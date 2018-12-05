package Application;

import major.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Schedule extends Application {
	
	private User us;
	public Schedule(User us) {
		this.us = us;
	}

	@Override
	public void start(Stage primaryStage) {

		/*TableView table = new TableView();

		Scene scene = new Scene(new Group());
		primaryStage.setTitle("Table View Sample");
		primaryStage.setWidth(600);
		primaryStage.setHeight(500);

		Label label = new Label("Schedule / ");
		label.setFont(new Font("Arial", 20));
		
		Label calories = new Label("Total Calories Burnt: ");
	    calories.setFont(new Font("Arial", 20));

		table.setEditable(true);

		TableColumn d1 = new TableColumn("Day 1");
		TableColumn d2 = new TableColumn("Day 2");
		TableColumn d3 = new TableColumn("Day 3");
		TableColumn d4 = new TableColumn("Day 4");
		TableColumn d5 = new TableColumn("Day 5");
		TableColumn d6 = new TableColumn("Day 6");
		TableColumn d7 = new TableColumn("Day 7");

		// table styles
		table.setStyle("-fx-background-color: wheat; -fx-text-fill: black; -fx-font-weight: bold;"
				+ "-fx-alignment: CENTER_LEFT; -fx-border-color: black");
		//

		table.getColumns().addAll(d1, d2, d3, d4, d5, d6, d7);

		HBox hbox = new HBox();
		hbox.setSpacing(5);
		hbox.getChildren().addAll(label, calories);
		
		VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(hbox, table);
		
		VBox monday = new VBox();
		monday.setSpacing(2);
		VBox tuesday = new VBox();
		tuesday.setSpacing(2);
		VBox wednesday = new VBox();
		wednesday.setSpacing(2);
		VBox thursday = new VBox();
		thursday.setSpacing(2);
		VBox friday = new VBox();
		friday.setSpacing(2);
		VBox saturday = new VBox();
		saturday.setSpacing(2);
		VBox sunday = new VBox();
		sunday.setSpacing(2);
		
		//if(us.getBodyShape().equals("Ectomorph")) {
		//	Calisthenics cali = new Calisthenics();
		//	for(int i = 0 ; i < cali.getWeekExerciseList().size() ; i++) {
		//		for(int j = 0 ; j < cali.getDayExercise(i).getMoveList().size(); j++) {
		//			if(i == 1) {
		//				Button mon = new Button(cali.getDayExercise(i).getMoveName(j));
		//				monday.getChildren().addAll(mon);
		//			}
		//		}
		//		table.getItems().add(monday);
		//	}
		}

		((Group) scene.getRoot()).getChildren().addAll(vbox);

		primaryStage.setScene(scene);
		primaryStage.show();
		*/
		
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(30, 30, 30, 30));
		grid.setVgap(20);
		//grid.setHgap(40);
		grid.setAlignment(Pos.TOP_LEFT);
		
		for(int i = 1 ; i < 8 ; i++) {
			Label lb = new Label("  Day "+ Integer.toString(i)+"  ");
			lb.setStyle( "-fx-border-width: 2;" + "-fx-border-color: black;" + "-fx-font-size: 30");
			grid.add(lb,i-1,0);
		}
		
		
		Scene scene = new Scene(grid, 860, 800);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Schedule");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
