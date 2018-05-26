package project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {
    @FXML private Button btn_nouvelle_partie;
    @FXML private Button btn_scores;
    @FXML private Button btn_quitter;

    public void initialize(){
        //
        btn_nouvelle_partie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.setScene("game");
            }
        });

        //
        btn_scores.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.setScene("scores");
            }
        });

        // action lors du clic sur bouton quitter
        btn_quitter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

}
