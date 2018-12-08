package Application;

import java.awt.event.KeyEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
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
						root.setAlignment(Pos.TOP_CENTER);
						String vid = "videos/Calisthenics/" + text.toLowerCase() + ".mp4";
						// String image_path = ClassLoader.getSystemResource("images/").toString();
						MediaPlayer player = new MediaPlayer(
								new Media(getClass().getClassLoader().getResource(vid).toExternalForm()));
						MediaView mediaView = new MediaView(player);
						mediaView.setFitHeight(800);
						mediaView.setFitWidth(800);
						root.add(mediaView,0,0);
						
						Button back = new Button("Back");
						back.setOnAction(e -> {
							Schedule sc = new Schedule(us);
							stage.close();
							sc.start(stage);
						});
						
						
						root.add(back, 1, 0);
						
						Scene scene = new Scene(root, 1000, 1000);
						
						scene.setOnKeyPressed(e -> {
						    if (e.getCode() == KeyCode.BACK_SPACE) {
						    	Schedule sc = new Schedule(us);
								stage.close();
								sc.start(stage);
						    }
						});
						
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
					check++;
					if (text.toLowerCase().equals(wcalis.getDayExercise(j).getMoveName(i).toLowerCase())) {
						GridPane root = new GridPane();
						root.setAlignment(Pos.TOP_CENTER);
						String vid = "videos/WeightCalisthenics/" + text.toLowerCase() + ".mp4";
						// String image_path = ClassLoader.getSystemResource("images/").toString();
						MediaPlayer player = new MediaPlayer(
								new Media(getClass().getClassLoader().getResource(vid).toExternalForm()));
						MediaView mediaView = new MediaView(player);
						mediaView.setFitHeight(800);
						mediaView.setFitWidth(800);
						root.add(mediaView,0,0);
						
						Button back = new Button("Back");
						back.setOnAction(e -> {
							Schedule sc = new Schedule(us);
							stage.close();
							sc.start(stage);
						});
						
						root.add(back, 1, 0);
						Scene scene = new Scene(root, 1000, 1000);
						
						scene.setOnKeyPressed(e -> {
						    if (e.getCode() == KeyCode.BACK_SPACE) {
						    	Schedule sc = new Schedule(us);
								stage.close();
								sc.start(stage);
						    }
						});
						
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
					check++;
					if (text.toLowerCase().equals(wt.getDayExercise(j).getMoveName(i).toLowerCase())) {
						GridPane root = new GridPane();
						root.setAlignment(Pos.TOP_CENTER);
						String vid = "videos/WeightTraining/" + text.toLowerCase() + ".mp4";
						// String image_path = ClassLoader.getSystemResource("images/").toString();
						MediaPlayer player = new MediaPlayer(
								new Media(getClass().getClassLoader().getResource(vid).toExternalForm()));
						MediaView mediaView = new MediaView(player);
						mediaView.setFitHeight(800);
						mediaView.setFitWidth(800);
						
						root.add(mediaView,0,0);
						Button back = new Button("Back");
						back.setOnAction(e -> {
							Schedule sc = new Schedule(us);
							stage.close();
							sc.start(stage);
						});
						
						root.add(back, 1, 0);
						Scene scene = new Scene(root, 1000, 1000);
						
						scene.setOnKeyPressed(e -> {
						    if (e.getCode() == KeyCode.BACK_SPACE) {
						    	Schedule sc = new Schedule(us);
								stage.close();
								sc.start(stage);
						    }
						});
						
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
