package TugasBesarPerbaikan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class NampilinAplikasi extends Application{

    private Stage primaryStage;

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        HalamanUtama();
    }

    public void HalamanUtama() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan/HalamanUtama.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        // Create the dialog Stage.
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Beli Tiket");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        KendaliHalamanUtama controller = loader.getController();
        controller.setDialogStage(dialogStage);
        controller.setMainApp(this);

        dialogStage.showAndWait();
    }

    public void PemesananTiket() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan/PemesananTiket.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        // Create the dialog Stage.
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Beli Tiket");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        // Show the dialog and wait until the user closes it

        KendaliPemesananTiket controller = loader.getController();
        controller.setDialogStage(dialogStage);
        controller.setMainApp(this);

        dialogStage.showAndWait();

    }

    public void InformasiJadwalBus() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan/InformasiJadwalBus.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        // Create the dialog Stage.
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Beli Tiket");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        // Give the controller access to the main app.
        KendaliInformasiJadwalBus controller = loader.getController();
        controller.jalan();
        controller.setDialogStage(dialogStage);

        // Show the dialog and wait until the user closes it
        dialogStage.showAndWait();
    }

    public void RiwayatPemesanan() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan/RiwayatPemesanan.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        // Create the dialog Stage.
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Beli Tiket");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        // Give the controller access to the main app.
        KendaliRiwayatPemesanan controller = loader.getController();
        controller.jalan();
        System.out.println("coba");
        controller.setDialogStage(dialogStage);
        System.out.println("lulus");

        // Show the dialog and wait until the user closes it
        dialogStage.showAndWait();




    }
}
