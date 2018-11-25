package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class Table extends Application {
 
    private TableView table = new TableView();
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(1000);
        stage.setHeight(500);
 
        final Label label = new Label("Calisthenics");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn day1 = new TableColumn("Day1");
        TableColumn day2 = new TableColumn("Day2");
        TableColumn day3 = new TableColumn("Day3");
        TableColumn day4 = new TableColumn("Day4");
        TableColumn day5 = new TableColumn("Day5");
        TableColumn day6 = new TableColumn("Day6");
        TableColumn day7 = new TableColumn("Day7");
        
        table.getColumns().addAll(day1, day2, day3, day4, day5, day6, day7);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
        
        /*public static class Person {
            private final SimpleStringProperty firstName;
            private final SimpleStringProperty lastName;
            private final SimpleStringProperty email;
         
            private Person(String fName, String lName, String email) {
                this.firstName = new SimpleStringProperty(fName);
                this.lastName = new SimpleStringProperty(lName);
                this.email = new SimpleStringProperty(email);
            }
         
            public String getFirstName() {
                return firstName.get();
            }
            public void setFirstName(String fName) {
                firstName.set(fName);
            }
                
            public String getLastName() {
                return lastName.get();
            }
            public void setLastName(String fName) {
                lastName.set(fName);
            }
            
            public String getEmail() {
                return email.get();
            }
            public void setEmail(String fName) {
                email.set(fName);
            }
                
        }
        
        final ObservableList<Person> data = FXCollections.observableArrayList(
        	    new Person("Jacob", "Smith", "jacob.smith@example.com"),
        	    new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
        	    new Person("Ethan", "Williams", "ethan.williams@example.com"),
        	    new Person("Emma", "Jones", "emma.jones@example.com"),
        	    new Person("Michael", "Brown", "michael.brown@example.com")
        	);*/
    }
}