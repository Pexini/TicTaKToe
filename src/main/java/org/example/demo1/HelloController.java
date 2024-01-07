package org.example.demo1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    private char nowSym = 'x';
    private char gameField[][] = new char[3][3];
    private boolean isGame = true;

    @FXML
    void btnClick(ActionEvent event) {
        if (!isGame) return;
        Button btn = (Button) event.getSource();
        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        gameField[rowIndex][columIndex] = nowSym;

        btn.setText(String.valueOf(nowSym));

        if (gameField[0][0] == gameField [0][1] && gameField[0][0] == gameField[0][2] && !Character.isWhitespace(gameField[0][0]))  {
            isGame = false;
        }
        nowSym = nowSym == 'x' ? 'o' : 'x';
    }

    @FXML
    void initialize() {

    }

}
