package TugasBesarPerbaikan;

import javafx.fxml.FXML;
import javafx.stage.Stage;


public class KendaliHalamanUtama {

    private Stage dialogStage;
    private NampilinAplikasi nampilinAplikasi;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setMainApp(NampilinAplikasi nampilinAplikasi) {
        this.nampilinAplikasi = nampilinAplikasi;
    }

    @FXML
    private void TombolPesan() throws Exception {
        NampilinAplikasi baru = new NampilinAplikasi();
        baru.PemesananTiket();


    }

    @FXML
    private void TombolInformasi() throws Exception {
        NampilinAplikasi baru = new NampilinAplikasi();
        baru.InformasiJadwalBus();

    }

}
