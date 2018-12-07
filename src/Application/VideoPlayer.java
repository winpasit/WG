package Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import major.Calisthenics;
import major.User;
import major.WeightCalisthenics;
import major.WeightTraining;

public class VideoPlayer extends Application {
	
	private String text;
	private User us;
	
	public VideoPlayer(User us,String text) {
		this.us = us;
		this.text = text;
	}

	@Override
	public void start(Stage stage) {
		if (us.getBodyShape().equals("ectomorph")) {
			Calisthenics calis = new Calisthenics();
			int check = 0;
			for (int j = 0; j < 7; j++) {
				for (int i = 0; i < 15; i++) {
					check++;
					if (text.toLowerCase().equals(calis.getDayExercise(j).getMoveName(i).toLowerCase())) {
						GridPane root = new GridPane();
						String vid = "videos/Calisthenics/" + text.toLowerCase() + ".mp4";
						// String image_path = ClassLoader.getSystemResource("images/").toString();
						MediaPlayer player = new MediaPlayer(
								new Media(getClass().getClassLoader().getResource(vid).toExternalForm()));
						MediaView mediaView = new MediaView(player);
						root.add(mediaView,0,0);
						
						Button back = new Button("Back");
						back.setOnAction(e -> {
							Schedule sc = new Schedule(us);
							stage.close();
							sc.start(stage);
						});
						
						root.add(back, 0, 1);
						
						Scene scene = new Scene(root, 1024, 768);
						stage.setTitle(text);
						stage.setScene(scene);
						stage.show();

						player.play();
						break;
					} else if(check >= 105) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Please check your spelling");
						alert.showAndWait();
						Schedule sc = new Schedule(us);
						stage.close();
						sc.start(stage);
					}
				}
			}
		}

		if (us.getBodyShape().equals("mesomorph")) {
			WeightCalisthenics wcalis = new WeightCalisthenics();
			int check = 0;
			for (int j = 0; j < 7; j++) {
				for (int i = 0; i < 15; i++) {
					if (text.toLowerCase().equals(wcalis.getDayExercise(j).getMoveName(i).toLowerCase())) {
						GridPane root = new GridPane();
						String vid = "videos/WeightCalisthenics/" + text.toLowerCase() + ".mp4";
						// String image_path = ClassLoader.getSystemResource("images/").toString();
						MediaPlayer player = new MediaPlayer(
								new Media(getClass().getClassLoader().getResource(vid).toExternalForm()));
						MediaView mediaView = new MediaView(player);
						root.add(mediaView,0,0);
						
						Button back = new Button("Back");
						back.setOnAction(e -> {
							Schedule sc = new Schedule(us);
							stage.close();
							sc.start(stage);
						});
						
						root.add(back, 0, 1);
						Scene scene = new Scene(root, 1024, 768);
						stage.setTitle(text);
						stage.setScene(scene);
						stage.show();

						player.play();
						break;
					} else if(check >= 105) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Please check your spelling");
						alert.showAndWait();
						Schedule sc = new Schedule(us);
						stage.close();
						sc.start(stage);
					}
				}
			}
		}

		if (us.getBodyShape().equals("endomorph")) {
			WeightTraining wt = new WeightTraining();
			int check = 0;
			for (int j = 0; j < 7; j++) {
				for (int i = 0; i < 15; i++) {
					if (text.toLowerCase().equals(wt.getDayExercise(j).getMoveName(i).toLowerCase())) {
						GridPane root = new GridPane();
						String vid = "videos/WeightTraining/" + text.toLowerCase() + ".mp4";
						// String image_path = ClassLoader.getSystemResource("images/").toString();
						MediaPlayer player = new MediaPlayer(
								new Media(getClass().getClassLoader().getResource(vid).toExternalForm()));
						MediaView mediaView = new MediaView(player);
						
						root.add(mediaView,0,0);
						Button back = new Button("Back");
						back.setOnAction(e -> {
							Schedule sc = new Schedule(us);
							stage.close();
							sc.start(stage);
						});
						
						root.add(back, 0, 1);
						Scene scene = new Scene(root, 1024, 768);
						stage.setTitle(text);
						stage.setScene(scene);
						stage.show();

						player.play();
						break;
					} else if(check >= 105) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Please check your spelling");
						alert.showAndWait();
						Schedule sc = new Schedule(us);
						stage.close();
						sc.start(stage);
						
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
