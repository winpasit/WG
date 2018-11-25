package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UserInput extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(25, 25, 25, 25));
		
		Label weight = new Label("Weight : ");
		gp.add(weight, 0, 0);
		TextField weightTextField = new TextField();
		
		weightTextField.setPromptText("your weight");
		gp.add(weightTextField, 1, 0);
		
		Label dayPerWeek = new Label("Day per week : ");
		gp.add(dayPerWeek,0,1);
		TextField dayTextField = new TextField();
		dayTextField.setPromptText("the number of day");
		gp.add(dayTextField,1,1);
		
		Button btn = new Button("Next");
		//add action of this button to go to BodyChoose page
		gp.add(btn, 1, 2);
		
		//change style here
		

		Scene scene = new Scene(gp, 350, 300);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Information");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
