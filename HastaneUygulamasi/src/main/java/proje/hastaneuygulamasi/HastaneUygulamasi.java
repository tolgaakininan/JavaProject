package proje.hastaneuygulamasi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class rHastaneUygulamasi extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HastaneUygulamasi.class.getResource("GirisMenusuUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 496, 300);
        stage.setTitle("HASTA YATAK REZERVASYONU");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}