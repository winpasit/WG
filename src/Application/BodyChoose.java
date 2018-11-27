package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BodyChoose extends Application {
	
	private final BorderPane bodyPane;

	@Override
	public void start(Stage primaryStage) {
		 HBox hbox  = new HBox();
		 Button ectomorph = new Button("ECTOMORPH");
		 Button mesomorph = new Button("MESOMORPH");
		 Button endomorph = new Button("ENDOMORPH");
		 
		 hbox.setHgrow(ectomorph, Priority.ALWAYS);
	     hbox.setHgrow(mesomorph, Priority.ALWAYS);
	     hbox.setHgrow(endomorph, Priority.ALWAYS);
		 
		 ectomorph.setMaxWidth(Double.MAX_VALUE);
	     mesomorph.setMaxWidth(Double.MAX_VALUE);
	     endomorph.setMaxWidth(Double.MAX_VALUE);
	     
	     /*final ImageView selectedImage = new ImageView();   
	     Image ect = new Image(BodyChoose.class.getResourceAsStream("C:\\Users\\Zongpol\\Desktop\\Capture.JPG"));

	     selectedImage.setImage(ect);

	     hbox.getChildren().addAll(selectedImage);*/
	     
	    //ImageView imageView = new ImageView(new Image(ClassLoader.getSystemResource("images/Endomorph.png").toString()));
			
		//imageView.setPreserveRatio(true);
		//imageView.setFitWidth(150);
		//imageView.setFitHeight(150);
			
	    //hbox.getChildren().addAll(imageView);
	     
		 
		 hbox.getChildren().addAll(ectomorph, mesomorph, endomorph);
		 hbox.setStyle("-fx-background-color:black;");
		 
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
