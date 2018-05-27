package project;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class ScoreController {
    @FXML
    ImageView btn_home;

    public void initialize(){
        btn_home.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Main.setScene("menu");
            }
        });
    }
}
