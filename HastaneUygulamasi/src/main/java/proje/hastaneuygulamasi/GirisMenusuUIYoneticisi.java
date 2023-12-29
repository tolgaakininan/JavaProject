package proje.hastaneuygulamasi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class GirisMenusuUIYoneticisi implements Initializable {

    ObjectInputStream in = new ObjectInputStream(new FileInputStream("HastaneVeri.txt"));
    protected Hastane hastane = (Hastane) in.readObject();

    private String[] secimler = {"Hasta Listesi Göster", "Hasta Ekle", "Oda Listesi Göster", "Oda Ekle", "Bakıcı Ekle"};
    @FXML
    private MenuItem kayitButon;

    @FXML
    private ChoiceBox<String> secenekKutusu;

    @FXML
    private MenuItem yukleButon;

    public GirisMenusuUIYoneticisi() throws IOException, ClassNotFoundException {
    }


    @FXML
    void kayitIslem(ActionEvent event) throws IOException {


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("HastaneVeri.txt"));
        out.writeObject(hastane);

    }

    @FXML
    void yukleIslem(ActionEvent event) {

    }

    @FXML
    public void secimYapildi(ActionEvent event) {
            for(Oda oda : hastane.getOdaListesi())
        {
            System.out.println(oda.getHastaListesi());
        }
        String secim = secenekKutusu.getValue();
        Stage stage = new Stage();
        if(Objects.equals(secim, "Oda Göster"))
        {
            //Oda gösterme işlemi yapılacak
            System.out.println("ZORT");
        }
        else if(Objects.equals(secim,"Oda Ekle"))
        {
            Scene scene;
            FXMLLoader fxmlLoader = new FXMLLoader(GirisMenusuUIYoneticisi.class.getResource("OdaEkleUI.fxml"));
            try {
                scene = new Scene(fxmlLoader.load(), 503, 311);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("0da Ekle");
            stage.setScene(scene);
            stage.show();
        }
        else if(Objects.equals(secim,"Hasta Ekle")) {
            if (bosYerVarMi()) {



                Scene scene = null;
                FXMLLoader fxmlLoader = new FXMLLoader(GirisMenusuUIYoneticisi.class.getResource("HastaKayitUI.fxml"));
                try {
                    scene = new Scene(fxmlLoader.load(), 503, 311);
                } catch (IOException e) {
                    System.out.println("Exception");;
                }
                stage.setTitle("Hasta Ekle");
                stage.setScene(scene);
                stage.show();

            }
            else
            {
                System.out.println("boş yer yok sayfası fırlat");
            }
        }
        else if(Objects.equals(secim,"Hasta Listesi Göster"))
        {
            Scene scene;
            FXMLLoader fxmlLoader = new FXMLLoader(GirisMenusuUIYoneticisi.class.getResource("HastaListesiGosterUI.fxml"));
            try {
                scene = new Scene(fxmlLoader.load(), 720, 435);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("0da Ekle");
            stage.setScene(scene);
            stage.show();

        }


        else if(Objects.equals(secim,"Hasta Taburcu Et"))
        {
            System.out.println("ZORT");
            //Hasta Taburcu edilecek
        }
    }

    @FXML
    void fonksiyonGoster(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        secenekKutusu.getItems().addAll(secimler);
        secenekKutusu.setOnAction(this::secimYapildi);


    }
    public boolean bosYerVarMi()
    {
        for(Oda oda:hastane.getOdaListesi())
        {
            if (oda.bosYerVarMi())
            {
                return true;
            }
        }
        return false;
    }




}


