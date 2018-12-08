package Application;

import major.*;
import Move.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;


public class Schedule extends Application {

	private User us;
	private boolean bf = false;
	private Label burn;
	
	public Schedule(User us) {
		this.us = us;
	}

	public static final String Column1MapKey = "Day 1";
	public static final String Column2MapKey = "Day 2";
	public static final String Column3MapKey = "Day 3";
	public static final String Column4MapKey = "Day 4";
	public static final String Column5MapKey = "Day 5";
	public static final String Column6MapKey = "Day 6";
	public static final String Column7MapKey = "Day 7";

	// 3
	@Override
	public void start(Stage stage) {
		Scene scene = new Scene(new Group());
		stage.setTitle("Schedule");
		stage.setWidth(1300);
		stage.setHeight(500);

		final Label label = new Label(us.getName() + " : " + us.getBodyShape());
		label.setStyle(
				"-fx-font-size: 24px; -fx-font-family:\"Arial Black\";-fx-fill: #1E4363;-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);\r\n"
						+ "");

		TextField movename = new TextField();
		movename.setPromptText("Enter move name");
		// movename.setPrefWidth(150);

		movename.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent ke) {
				if (ke.getCode() == KeyCode.ENTER) {
					VideoPlayer vp = new VideoPlayer(us, movename.getText());
					stage.close();
					vp.start(stage);
				}
			}
		});

		TableColumn<Map, String> firstDataColumn = new TableColumn<>("Day 1");
		TableColumn<Map, String> secondDataColumn = new TableColumn<>("Day 2");
		TableColumn<Map, String> thirdDataColumn = new TableColumn<>("Day 3");
		TableColumn<Map, String> fourthDataColumn = new TableColumn<>("Day 4");
		TableColumn<Map, String> fifthDataColumn = new TableColumn<>("Day 5");
		TableColumn<Map, String> sixthDataColumn = new TableColumn<>("Day 6");
		TableColumn<Map, String> seventhDataColumn = new TableColumn<>("Day 7");

		firstDataColumn.setCellValueFactory(new MapValueFactory(Column1MapKey));
		firstDataColumn.setMinWidth(200);
		secondDataColumn.setCellValueFactory(new MapValueFactory(Column2MapKey));
		secondDataColumn.setMinWidth(190);
		thirdDataColumn.setCellValueFactory(new MapValueFactory(Column3MapKey));
		thirdDataColumn.setMinWidth(190);
		fourthDataColumn.setCellValueFactory(new MapValueFactory(Column4MapKey));
		fourthDataColumn.setMinWidth(210);
		fifthDataColumn.setCellValueFactory(new MapValueFactory(Column5MapKey));
		fifthDataColumn.setMinWidth(150);
		sixthDataColumn.setCellValueFactory(new MapValueFactory(Column6MapKey));
		sixthDataColumn.setMinWidth(200);
		seventhDataColumn.setCellValueFactory(new MapValueFactory(Column7MapKey));
		seventhDataColumn.setMinWidth(90);

		TableView tableView = new TableView<>(generateDataInMap());
		tableView.setStyle("-fx-background-color:brown;");

		firstDataColumn.setStyle("-fx-background-color:D9CBA3");
		secondDataColumn.setStyle("-fx-background-color:#FCF2CB");
		thirdDataColumn.setStyle("-fx-background-color:D9CBA3");
		fourthDataColumn.setStyle("-fx-background-color:#FCF2CB");
		fifthDataColumn.setStyle("-fx-background-color:D9CBA3");
		sixthDataColumn.setStyle("-fx-background-color:#FCF2CB");
		seventhDataColumn.setStyle("-fx-background-color:D9CBA3");

		tableView.setEditable(false);
		tableView.getSelectionModel().setCellSelectionEnabled(true);
		tableView.getColumns().setAll(firstDataColumn, secondDataColumn, thirdDataColumn, fourthDataColumn,
				fifthDataColumn, sixthDataColumn, seventhDataColumn);
		Callback<TableColumn<Map, String>, TableCell<Map, String>> cellFactoryForMap = (
				TableColumn<Map, String> p) -> new TextFieldTableCell(new StringConverter() {
					@Override
					public String toString(Object t) {
						return t.toString();
					}

					@Override
					public Object fromString(String string) {
						return string;
					}
				});
		firstDataColumn.setCellFactory(cellFactoryForMap);
		secondDataColumn.setCellFactory(cellFactoryForMap);
		thirdDataColumn.setCellFactory(cellFactoryForMap);
		fourthDataColumn.setCellFactory(cellFactoryForMap);
		fifthDataColumn.setCellFactory(cellFactoryForMap);
		sixthDataColumn.setCellFactory(cellFactoryForMap);
		seventhDataColumn.setCellFactory(cellFactoryForMap);

		final VBox vbox = new VBox();
		final HBox hbox = new HBox();
		
		if (us.getBodyShape().equals("ectomorph")) {
			Calisthenics calis = new Calisthenics();
			bf = ((Cardio)calis.getDayExercise(3)).burnFat();
		} else if (us.getBodyShape().equals("endomorph")) {
			WeightTraining wt = new WeightTraining();
			bf = ((Cardio)wt.getDayExercise(4)).burnFat();
		}
			
		if (bf) {
			burn = new Label("You are burning fat, Keep going!!		");
		} else {
			burn = new Label("");
		}
		
		Label wei = new Label("Weight : " + Integer.toString(us.getWeight()) + " kg" + ", ");
		Label hei = new Label("Height : " + Integer.toString(us.getHeight()) + "cm");
		
		hbox.setSpacing(15);
		hbox.getChildren().addAll(label, movename, burn, wei, hei);

		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(hbox, tableView);

		((Group) scene.getRoot()).getChildren().addAll(vbox);

		stage.setScene(scene);

		stage.show();
	}

	private ObservableList<Map> generateDataInMap() {
		int max = 15;
		ObservableList<Map> allData = FXCollections.observableArrayList();
		for (int i = 0; i < max; i++) {
			if (us.getBodyShape().equals("ectomorph")) {
				Calisthenics calis = new Calisthenics();
				Map<String, String> dataRow = new HashMap<>();

				String value1 = calis.getDayExercise(0).getMoveName(i) + "\t"
						+ calis.getDayExercise(0).getDefinition(i);
				String value2 = calis.getDayExercise(1).getMoveName(i) + "\t"
						+ calis.getDayExercise(1).getDefinition(i);
				String value3 = calis.getDayExercise(2).getMoveName(i) + "\t"
						+ calis.getDayExercise(2).getDefinition(i);
				String value4 = calis.getDayExercise(3).getMoveName(i) + "\t"
						+ calis.getDayExercise(3).getDefinition(i);
				String value5 = calis.getDayExercise(4).getMoveName(i) + "\t"
						+ calis.getDayExercise(4).getDefinition(i);
				String value6 = calis.getDayExercise(5).getMoveName(i) + "\t"
						+ calis.getDayExercise(5).getDefinition(i);
				String value7 = calis.getDayExercise(6).getMoveName(i) + "\t"
						+ calis.getDayExercise(6).getDefinition(i);

				dataRow.put(Column1MapKey, value1);
				dataRow.put(Column2MapKey, value2);
				dataRow.put(Column3MapKey, value3);
				dataRow.put(Column4MapKey, value4);
				dataRow.put(Column5MapKey, value5);
				dataRow.put(Column6MapKey, value6);
				dataRow.put(Column7MapKey, value7);

				allData.add(dataRow);
			} else if (us.getBodyShape().equals("mesomorph")) {
				WeightCalisthenics wcalis = new WeightCalisthenics();
				Map<String, String> dataRow = new HashMap<>();

				String value1 = wcalis.getDayExercise(0).getMoveName(i) + "\t"
						+ wcalis.getDayExercise(0).getDefinition(i);
				String value2 = wcalis.getDayExercise(1).getMoveName(i) + "\t"
						+ wcalis.getDayExercise(1).getDefinition(i);
				String value3 = wcalis.getDayExercise(2).getMoveName(i) + "\t"
						+ wcalis.getDayExercise(2).getDefinition(i);
				String value4 = wcalis.getDayExercise(3).getMoveName(i) + "\t"
						+ wcalis.getDayExercise(3).getDefinition(i);
				String value5 = wcalis.getDayExercise(4).getMoveName(i) + "\t"
						+ wcalis.getDayExercise(4).getDefinition(i);
				String value6 = wcalis.getDayExercise(5).getMoveName(i) + "\t"
						+ wcalis.getDayExercise(5).getDefinition(i);
				String value7 = wcalis.getDayExercise(6).getMoveName(i) + "\t"
						+ wcalis.getDayExercise(6).getDefinition(i);

				dataRow.put(Column1MapKey, value1);
				dataRow.put(Column2MapKey, value2);
				dataRow.put(Column3MapKey, value3);
				dataRow.put(Column4MapKey, value4);
				dataRow.put(Column5MapKey, value5);
				dataRow.put(Column6MapKey, value6);
				dataRow.put(Column7MapKey, value7);

				allData.add(dataRow);

				// Column7MapKey.setTooltip(new Tooltip("This column shows the first name"));

			} else if (us.getBodyShape().equals("endomorph")) {
				WeightTraining wt = new WeightTraining();
				Map<String, String> dataRow = new HashMap<>();

				String value1 = wt.getDayExercise(0).getMoveName(i) + "\t" + wt.getDayExercise(0).getDefinition(i);
				String value2 = wt.getDayExercise(1).getMoveName(i) + "\t" + wt.getDayExercise(1).getDefinition(i);
				String value3 = wt.getDayExercise(2).getMoveName(i) + "\t" + wt.getDayExercise(2).getDefinition(i);
				String value4 = wt.getDayExercise(3).getMoveName(i) + "\t" + wt.getDayExercise(3).getDefinition(i);
				String value5 = wt.getDayExercise(4).getMoveName(i) + "\t" + wt.getDayExercise(4).getDefinition(i);
				String value6 = wt.getDayExercise(5).getMoveName(i) + "\t" + wt.getDayExercise(5).getDefinition(i);
				String value7 = wt.getDayExercise(6).getMoveName(i) + "\t" + wt.getDayExercise(6).getDefinition(i);

				dataRow.put(Column1MapKey, value1);
				dataRow.put(Column2MapKey, value2);
				dataRow.put(Column3MapKey, value3);
				dataRow.put(Column4MapKey, value4);
				dataRow.put(Column5MapKey, value5);
				dataRow.put(Column6MapKey, value6);
				dataRow.put(Column7MapKey, value7);

				allData.add(dataRow);
			}
		}
		return allData;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
