package proje.hastaneuygulamasi;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HastaListesiGosterUIYoneticisi extends GirisMenusuUIYoneticisi implements Initializable {


    @FXML
    private TableView<Hasta> Tablo;
    @FXML
    private TableColumn<Hasta, String> hastaNoColumn;

    @FXML
    private TableColumn<Hasta, String> isimColumn;

    @FXML
    private TableColumn<Hasta, String> soyisimColumn;

    @FXML
    private TableColumn<Hasta, String> vatandasNoColumn;

    @FXML
    private TableColumn<Hasta, String> yasColumn;

    public HastaListesiGosterUIYoneticisi() throws IOException, ClassNotFoundException {
    }

    @FXML
    void hastaTaburcuEt(ActionEvent event) {

    }

    public ObservableList<Hasta> getHastalar()
    {
        ObservableList<Hasta> liste = FXCollections.observableArrayList();
        for(Oda oda: hastane.getOdaListesi())
        {
            liste.addAll(oda.getHastaListesi());
        }
        System.out.println(liste);
        return liste;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Hasta> veri = getHastalar();
        isimColumn.setCellValueFactory(new PropertyValueFactory<Hasta, String>("İsim"));
        soyisimColumn.setCellValueFactory(new PropertyValueFactory<Hasta, String>("Soysim"));
        yasColumn.setCellValueFactory(new PropertyValueFactory<Hasta, String>("Yaş"));
        vatandasNoColumn.setCellValueFactory(new PropertyValueFactory<Hasta, String>("Vatandaş No"));
        hastaNoColumn.setCellValueFactory(new PropertyValueFactory<Hasta, String>("Hasta No"));
        Tablo.setItems(veri);
    }
}
