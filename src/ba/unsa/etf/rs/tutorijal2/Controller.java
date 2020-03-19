package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField tekstpolje;
    public Label labelazaispisivanje;

    public void promijeniTekst(ActionEvent actionEvent) {
        String s=tekstpolje.getText();
        int i, razmak = -1, duzina = 0, pos = 0;
        for (i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                if (i - razmak - 1 > duzina) {
                    duzina = i - razmak - 1;
                    pos = razmak + 1;
                }
                razmak = i;
            }
        }
        String prije_naj=s.substring(0, pos);
        String najduza=s.substring(pos, pos+duzina).toUpperCase();
        String poslije_naj=s.substring(pos+duzina, s.length());

        labelazaispisivanje.setText(prije_naj+najduza+poslije_naj);
    }
}
