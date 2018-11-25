package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BodyChoose extends Application {
	
	private final BorderPane bodyPane;

	@Override
	public void start(Stage primaryStage) {
		 HBox hbox  = new HBox();
		 hbox.setAlignment(Pos.CENTER);
		 //hbox.setHgap(10);
		 //hbox.setVgap(10);
		 hbox.setPadding(new Insets(25, 25, 25, 25));
		 
		 /*TextField weightTextField = new TextField();
		 weightTextField.setPromptText("your weight");
		 hbox.getChildren().add(weightTextField);*/
		 
		 Scene scene = new Scene(hbox, 350, 300);

			primaryStage.setScene(scene);
			primaryStage.setTitle("BodyChoose");
			primaryStage.show();
	}
	
	
	
	public BodyChoose() {

        bodyPane = new BorderPane();

        // build UI, register event handlers, etc etc

    }
	
	public Pane getRootPane() {
        return bodyPane ;
    }
	
	

	public static void main(String[] args) {
		launch(args);
	}
}
