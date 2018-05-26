package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.HashMap;

public class Main extends Application {
    private Stage primaryStage;
    private static HashMap<String, View> views;
    private String APP_NAME = "Candy Crush";

    @Override
    public void start(Stage primaryStage) throws Exception{
        views = new HashMap<>();
        this.primaryStage = primaryStage;

        // definition des scenes utilisables
        addScene("menu", "menu.fxml", "Menu", 600, 338, false);
        addScene("game", "game.fxml", "Jeux", 600, 338, false);
        addScene("scores", "scores.fxml", "Meilleurs scores", 600, 338, false);

        setScene("menu");

    }

    public static void setScene(String name){
       views.get(name).show();
    }


    public void addScene(String name, String fxmlfile, String title, int width, int height, boolean resizable) throws Exception{
        views.put(name, new View(
            primaryStage,
            APP_NAME + " - " + title,
            fxmlfile,
            width,
            height,
            resizable
        ));

    }


    public static void main(String[] args) {
        launch(args);
    }
}
