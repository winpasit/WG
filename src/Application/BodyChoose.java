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
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BodyChoose extends Application {

	@Override
	public void start(Stage primaryStage) {
		VBox vb = new VBox();

		HBox hbox = new HBox();
		Button ectomorph = new Button("ECTOMORPH");
		Button mesomorph = new Button("MESOMORPH");
		Button endomorph = new Button("ENDOMORPH");

		hbox.setHgrow(ectomorph, Priority.ALWAYS);
		hbox.setHgrow(mesomorph, Priority.ALWAYS);
		hbox.setHgrow(endomorph, Priority.ALWAYS);

		ectomorph.setMaxWidth(Double.MAX_VALUE);
		mesomorph.setMaxWidth(Double.MAX_VALUE);
		endomorph.setMaxWidth(Double.MAX_VALUE);

		hbox.getChildren().addAll(ectomorph, mesomorph, endomorph);
		hbox.setStyle("-fx-background-color:black;");

		String image_path = ClassLoader.getSystemResource("images/").toString();
		ImageView imagebdc = new ImageView(new Image(image_path + "bodychoose.jpg"));
		imagebdc.setPreserveRatio(true);
		imagebdc.setFitHeight(500);
		imagebdc.setFitWidth(500);

		vb.getChildren().addAll(hbox, imagebdc);

		Scene scene = new Scene(vb, 500, 340);

		primaryStage.setScene(scene);
		primaryStage.setTitle("BodyChoose");
		primaryStage.show();
		
		ectomorph.setOnAction(e -> {
			Schedule sc = new Schedule();
			primaryStage.close();
			sc.start(primaryStage);
		});
		
		mesomorph.setOnAction(e -> {
			Schedule sc = new Schedule();
			primaryStage.close();
			sc.start(primaryStage);
		});
		
		endomorph.setOnAction(e -> {
			Schedule sc = new Schedule();
			primaryStage.close();
			sc.start(primaryStage);
		});
	}

	

	public static void main(String[] args) {
		launch(args);
	}
}
