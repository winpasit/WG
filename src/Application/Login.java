package Application;

import major.*;
import java.util.HashMap;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		User us = new User();
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(30);
		grid.setVgap(20);
		grid.setPadding(new Insets(50, 50, 50, 50));

		Text scenetitle = new Text("Welcome to Workout Generator");
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);

		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		Button signinBtn = new Button("Sign up");
		signinBtn.setPrefWidth(100);
		Button exitBtn = new Button("Exit");
		exitBtn.setPrefWidth(100);
		hbBtn.getChildren().addAll(signinBtn, exitBtn);
		grid.add(hbBtn, 1, 4);

		// set style
		userName.setStyle("-fx-text-fill: white;");
		pw.setStyle("-fx-text-fill: white;");
		grid.setStyle("-fx-background-color:black;");
		scenetitle.setStyle("-fx-font-size: 30px; -fx-font-family:\"Arial Black\";-fx-fill: lime;-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);\r\n" + 
				"");
		signinBtn.setStyle(
				"-fx-text-fill: green; -fx-font-weight: bold; -fx-font-family: \"Arial Narrow\"; -fx-background-color: white;");
		exitBtn.setStyle(
				"-fx-text-fill: crimson; -fx-font-weight: bold; -fx-font-family: \"Arial Narrow\"; -fx-background-color: white;");

		// add handler
		// press ESC to clear user text field
		userTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent ke) {
				if (ke.getCode() == KeyCode.ESCAPE) {
					userTextField.setText("");
				}
			}
		});
		
		pwBox.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent ky) {
				if (ky.getCode() == KeyCode.ENTER) {
					if (userTextField.getText().equals("") || pwBox.getText().equals("")) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error Dialog");
						alert.setHeaderText(null);
						alert.setContentText(
								"Please fill in both username and password");
						alert.showAndWait();
						}
						else {
							us.setName(userTextField.getText());
							Alert alert = new Alert(AlertType.INFORMATION);
							alert.setTitle("Welcome Dialog");
							alert.setHeaderText(null);
							alert.setContentText(
									"Welcome, " + userTextField.getText() + ". Your Password is " + pwBox.getText() + ".");
							alert.showAndWait();
							UserInput user = new UserInput(us);
							primaryStage.close();
							user.start(primaryStage);
						}	
				}
			}
		});
		
		// change button width when mouse over
		signinBtn.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				signinBtn.setPrefWidth(115);
			}
		});
		signinBtn.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				signinBtn.setPrefWidth(100);
			}
		});
		exitBtn.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				exitBtn.setPrefWidth(115);
			}
		});
		exitBtn.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				exitBtn.setPrefWidth(100);
			}
		});
		// action when click button // change this to link to others pages
		signinBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				if (userTextField.getText().equals("") || pwBox.getText().equals("")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Error Dialog");
				alert.setHeaderText(null);
				alert.setContentText(
						"Please fill in both username and password");
				alert.showAndWait();
				}
				else {
					us.setName(userTextField.getText());
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Welcome Dialog");
					alert.setHeaderText(null);
					alert.setContentText(
							"Welcome, " + userTextField.getText() + ". Your Password is " + pwBox.getText() + ".");
					alert.showAndWait();
					UserInput user = new UserInput(us);
					primaryStage.close();
					user.start(primaryStage);
				}			

			}

		});
		exitBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				primaryStage.close();
			}
		});

		Scene scene = new Scene(grid, 900, 600);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Workout Generator Login");
		primaryStage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
