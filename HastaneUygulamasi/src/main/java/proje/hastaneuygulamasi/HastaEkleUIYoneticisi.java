package proje.hastaneuygulamasi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HastaEkleUIYoneticisi extends GirisMenusuUIYoneticisi implements Initializable {

    @FXML
    private TextField hastaNoInput;

    @FXML
    private TextField isimInput;

    @FXML
    private ChoiceBox<String> odaKutusu;

    @FXML
    private TextField soyisimInput;

    @FXML
    private TextField vatandasNoInput;

    public HastaEkleUIYoneticisi() throws IOException, ClassNotFoundException {
        super();
    }

    @FXML
    void cikisTiklandi(ActionEvent event) {
        ((Node)event.getSource()).getScene().getWindow().hide();
    }

    @FXML
    void fonksiyonGoster(ActionEvent event) {

    }

    @FXML
    void kaydetTiklandi(ActionEvent event) {
        if(hastaNoInput.getText().isEmpty() || isimInput.getText().isEmpty() || soyisimInput.getText().isEmpty() || vatandasNoInput.getText().isEmpty() || odaKutusu.getValue().isEmpty())
        {
            Stage hata = new Stage();
            Scene scene;
            FXMLLoader fxmlLoader = new FXMLLoader(GirisMenusuUIYoneticisi.class.getResource("HastaKayitUyariUI.fxml"));
            try {
                scene = new Scene(fxmlLoader.load(), 617, 132);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            hata.setScene(scene);
            hata.show();
        }
        else
        {
            odaKutusu.getValue();
            ((Node) event.getSource()).getScene().getWindow().hide();

        }

    }

    @FXML
    void kayitIslem(ActionEvent event) throws IOException {
        super.kayitIslem(event);
    }

    @FXML
    void yukleIslem(ActionEvent event) {
        super.yukleIslem(event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
