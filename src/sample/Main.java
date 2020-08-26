package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    private BorderPane root;
    private TextArea textArea;
    private HBox bottomHBox, topHBox;
    private Button showBtn, wrapBtn;
    private CheckBox boldCb, italicCB;
    private ToggleButton onTb, offTb;
    private RadioButton alignCenterRb, alignRightRb;
    private ToggleGroup toggleGroup;
    @Override
    public void start(Stage primaryStage) throws Exception{
        textArea = new TextArea();
        showBtn = new Button("Show");
        wrapBtn = new Button("_Wrap");
        boldCb = new CheckBox("Bold");
        italicCB = new CheckBox("Italic");
        onTb = new ToggleButton("ON");
        offTb = new ToggleButton("OFF");
        alignCenterRb = new RadioButton("Align Center");
        alignRightRb = new RadioButton("Align Right");
        toggleGroup = new ToggleGroup();
//        onTb.setToggleGroup(toggleGroup);
//        offTb.setToggleGroup(toggleGroup);
        alignCenterRb.setToggleGroup(toggleGroup);
        alignRightRb.setToggleGroup(toggleGroup);
//        boldCb.setSelected(true);
        boldCb.setOnAction(e->{
            textArea.setFont(new Font(40));
        });
        bottomHBox = new HBox();
        bottomHBox.getChildren().addAll(showBtn,wrapBtn);
        bottomHBox.setSpacing(20);
        topHBox = new HBox();
        topHBox.setSpacing(20);
        topHBox.setPadding(new Insets(20));
        topHBox.getChildren().addAll(boldCb,italicCB,alignCenterRb,alignRightRb);
        root = new BorderPane();
        root.setTop(topHBox);
        root.setCenter(textArea);
        root.setBottom(bottomHBox);
        root.setPadding(new Insets(20));
        wrapBtn.setOnAction(e->{
            textArea.setWrapText(true);
        });
        showBtn.setOnAction(e->{
            System.out.println(textArea.getParagraphs());
        });
        Scene scene =  new Scene(root,500,500);
        primaryStage.setTitle("Text Area Demo");
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
