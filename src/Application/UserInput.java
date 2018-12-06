package Application;

import major.*;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInput extends Application {
	private User us;
	public UserInput(User us) {
		this.us = us;
	}
	
	public boolean isInteger( String input )
	{
	   try
	   {
	      Integer.parseInt( input );
	      return true;
	   }
	   catch( Exception e )
	   {
	      return false;
	   }
	}
	

	@Override
	public void start(Stage primaryStage) {
		
		VBox vb = new VBox(20);
		vb.setSpacing(20);
		
		Label id = new Label(us.getName());;
		//id.setStyle("-fx-font-size:30px;");
		id.setStyle("-fx-font:60px Tahoma");
		vb.setMargin(id, new Insets(40, 0, 0, 30)); 
		vb.getChildren().addAll(id);
		
		
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(25, 25, 25, 25));
		
		Label weight = new Label("Weight(kg) : ");
		gp.add(weight, 0, 0);
		TextField weightTextField = new TextField();
		weightTextField.setPromptText("your weight");
		gp.add(weightTextField, 1, 0);

		Label dayPerWeek = new Label("day per week : ");
		gp.add(dayPerWeek, 0, 1);
		TextField dayTextField = new TextField();
		dayTextField.setPromptText("the number of day(s) active");
		gp.add(dayTextField, 1, 1);
		

		Button btn = new Button("Next");
		
		// add handler
		dayTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent ke) {
				if (ke.getCode() == KeyCode.ENTER) {
					if (!isInteger(weightTextField.getText()) || !isInteger(dayTextField.getText())) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Please be reasonable");
						alert.showAndWait();
					} else {
					if (weightTextField.getText().equals("") || dayTextField.getText().equals("")) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Please fill in both weight and days per week");
						alert.showAndWait();
					}
					else if (Integer.parseInt(dayTextField.getText()) <= 0 || Integer.parseInt(dayTextField.getText()) > 7 /*|| dayTextField.getText().getClass() instanceof double*/) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Invalid day(s) per week");
						alert.showAndWait();
					}
					else if (Integer.parseInt(weightTextField.getText()) <= 20 || Integer.parseInt(weightTextField.getText()) > 200) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Please fill in reasonable weight");
						alert.showAndWait();
					}
					else {
						us.setWeight(Double.parseDouble(weightTextField.getText()));
						us.setDayPerWeek(Integer.parseInt(dayTextField.getText()));
						BodyChoose body = new BodyChoose(us);
						primaryStage.close();
						body.start(primaryStage);
					}
					}
				}
			}
		});
					
		// add action of this button to go to BodyChoose page
		btn.setOnAction(e -> {
			if (!isInteger(weightTextField.getText()) || !isInteger(dayTextField.getText())) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Error Dialog");
				alert.setHeaderText(null);
				alert.setContentText(
						"Please be reasonable");
				alert.showAndWait();
			} else {
			if (weightTextField.getText().equals("") || dayTextField.getText().equals("")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Error Dialog");
				alert.setHeaderText(null);
				alert.setContentText(
						"Please fill in both weight and days per week");
				alert.showAndWait();
			}
			else if (Integer.parseInt(dayTextField.getText()) <= 0 || Integer.parseInt(dayTextField.getText()) > 7 /*|| dayTextField.getText().getClass() instanceof double*/) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Error Dialog");
				alert.setHeaderText(null);
				alert.setContentText(
						"Invalid day(s) per week");
				alert.showAndWait();
			}
			else if (Integer.parseInt(weightTextField.getText()) <= 0 || Integer.parseInt(weightTextField.getText()) > 200) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Error Dialog");
				alert.setHeaderText(null);
				alert.setContentText(
						"Please fill in reasonable weight");
				alert.showAndWait();
			}
			else {
				us.setWeight(Double.parseDouble(weightTextField.getText()));
				us.setDayPerWeek(Integer.parseInt(dayTextField.getText()));
				BodyChoose body = new BodyChoose(us);
				primaryStage.close();
				body.start(primaryStage);
			}
			}
		});
		gp.add(btn, 1, 2);
		vb.setStyle("-fx-background-color:beige;");
		vb.getChildren().addAll(gp);

		// change style here

		Scene scene = new Scene(vb, 600, 400);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Information");
		primaryStage.show();

	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
