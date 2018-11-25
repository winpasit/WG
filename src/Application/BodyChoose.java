package Application;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BodyChoose extends Application {
	
	private final BorderPane bodyPane;

	@Override
	public void start(Stage primaryStage) {
		 HBox hbox  = new HBox();
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
