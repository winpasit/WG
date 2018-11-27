package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Schedule extends Application {

	@Override
	public void start(Stage primaryStage) {
		/*
		 * GridPane grid = new GridPane(); grid.setAlignment(Pos.TOP_CENTER);
		 * 
		 * HBox hb = new HBox(35); hb.setPadding(new Insets(25, 25, 25, 25)); for(int i
		 * = 1 ; i < 8 ; i++) { Label lb = new Label("Day "+ Integer.toString(i));
		 * hb.getChildren().add(lb); } hb.setStyle("-fx-border-style: solid inside;" +
		 * "-fx-border-width: 2;" + "-fx-border-insets: 5;" +
		 * "-fx-border-color: black;");
		 * 
		 * grid.add(hb,0,0);
		 */

		TableView table = new TableView();

		Scene scene = new Scene(new Group());
		primaryStage.setTitle("Table View Sample");
		primaryStage.setWidth(600);
		primaryStage.setHeight(500);

		Label label = new Label("Schedule");
		label.setFont(new Font("Arial", 20));

		table.setEditable(true);

		TableColumn d1 = new TableColumn("Day 1");
		TableColumn d2 = new TableColumn("Day 2");
		TableColumn d3 = new TableColumn("Day 3");
		TableColumn d4 = new TableColumn("Day 4");
		TableColumn d5 = new TableColumn("Day 5");
		TableColumn d6 = new TableColumn("Day 6");
		TableColumn d7 = new TableColumn("Day 7");

		// table styles
		table.setStyle("-fx-background-color: wheat; -fx-text-fill: black; -fx-font-weight: bold;"
				+ "-fx-alignment: CENTER_LEFT; -fx-border-color: black");
		//

		table.getColumns().addAll(d1, d2, d3, d4, d5, d6, d7);

		VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(label, table);

		((Group) scene.getRoot()).getChildren().addAll(vbox);

		primaryStage.setScene(scene);
		primaryStage.show();

		// Scene scene = new Scene(grid, 500, 500);
		// primaryStage.setScene(scene);
		// primaryStage.setTitle("Schedule");
		// primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
