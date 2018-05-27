package project;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;

public class GameController {
    @FXML private MenuItem menu_quitter;
    @FXML private Canvas game_area;
    @FXML private MenuItem menu_aide;

    public void initialize(){
        GraphicsContext gc = game_area.getGraphicsContext2D();
        Image wallpaper = new Image("/project/img/sprite_0.png");
        gc.drawImage(wallpaper, 0, 0);

        menu_aide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.setScene("help");
            }
        });

        menu_quitter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.setScene("menu");
            }
        });
    }
}
