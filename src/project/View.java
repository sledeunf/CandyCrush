package project;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {
    Stage stage;
    Scene scene;
    String title;
    boolean resizable;

    public View(Stage stage, String title, String fxmlfile, int width, int height, boolean resizable) throws Exception{
        // chargement des donnees du template
        Parent root = FXMLLoader.load(getClass().getResource(fxmlfile));
        //
        this.stage = stage;
        // creation de la scene correspondante
        this.scene = new Scene(root, width, height);
        //
        this.title = title;
        //
        this.resizable = resizable;
    }

    public void show(){
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(resizable);
    }
}
