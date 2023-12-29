package proje.hastaneuygulamasi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class OdaEkleUIYoneticisi extends GirisMenusuUIYoneticisi{

    @FXML
    private Button cikisButon;

    @FXML
    private Button ekleButon;

    @FXML
    private TextField yatakSayiInput;


    @FXML
    void fonksiyonGoster(ActionEvent event) {

    }

    @FXML
    void kayitIslem(ActionEvent event) throws IOException {
        super.kayitIslem(event);
    }

    @FXML
    void yukleIslem(ActionEvent event) {
        super.yukleIslem(event);
    }


    public OdaEkleUIYoneticisi() throws IOException, ClassNotFoundException {
        super();
    }

    @FXML
    void cikisTiklandi(ActionEvent event) {
        ((Node)event.getSource()).getScene().getWindow().hide();

    }

    @FXML
    void ekleTiklandi(ActionEvent event) {
        int yatakSayisi = 0;
        int flag = 1;
        try {
            yatakSayisi = Integer.parseInt(yatakSayiInput.getText());
        }
        catch (Exception exception){
            //Hata ekranı aç.
            flag = 0;
        }
        if(flag ==1)
        {
            ((Node)event.getSource()).getScene().getWindow().hide();
            hastane.odaEkle(new Oda(yatakSayisi));
        }
    }

}
