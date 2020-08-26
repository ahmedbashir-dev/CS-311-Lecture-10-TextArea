package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    private BorderPane root;
    private TextArea textArea;
    private HBox bottomHBox;
    private Button showBtn;
    @Override
    public void start(Stage primaryStage) throws Exception{
        textArea = new TextArea();
        showBtn = new Button("Show");
        bottomHBox = new HBox(showBtn);
        root = new BorderPane();
        root.setCenter(textArea);
        root.setBottom(bottomHBox);
        Scene scene =  new Scene(root,500,500);
        primaryStage.setTitle("Text Area Demo");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
