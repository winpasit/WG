package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Schedule extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		HBox hb = new HBox(35);
		hb.setPadding(new Insets(25, 25, 25, 25));
		for(int i = 1 ; i < 8 ; i++) {
			Label lb = new Label("Day "+ Integer.toString(i));
			hb.getChildren().add(lb);
		}
		
		hb.setStyle("-fx-border-style: solid inside;"
		        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
		        + "-fx-border-color: black;");
		
		grid.add(hb,0,0);
		
		
		
		
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Schedule");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
