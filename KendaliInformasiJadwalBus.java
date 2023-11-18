package TugasBesarPerbaikan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class KendaliInformasiJadwalBus {
    @FXML
    private TableView<Desain> TabelKeseluruhan;
    @FXML
    private TableColumn<Desain, String> KodeBus;
    @FXML
    private TableColumn<Desain, String> Tujuan;
    @FXML
    private TableColumn<Desain, String> Kelas;
    @FXML
    private TableColumn<Desain, String> WaktuKeberangkatan;
    @FXML
    private TableColumn<Desain, String> Harga;

    private ObservableList<Desain> JalankanData = FXCollections.observableArrayList();

    private String nama;
    private String tujuan;
    private String harga;
    private String kodebus;
    private String kelas;
    private String waktu;
    private String jam;
    private Stage dialogStage;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @FXML
    public void initialize() {
        KodeBus.setCellValueFactory(cellData -> cellData.getValue().KodeBusProperty());
        Tujuan.setCellValueFactory(cellData -> cellData.getValue().TujuanProperty());
        Kelas.setCellValueFactory(cellData -> cellData.getValue().KelasProperty());
        WaktuKeberangkatan.setCellValueFactory(cellData -> cellData.getValue().WaktuProperty());
        Harga.setCellValueFactory(cellData -> cellData.getValue().HargaProperty());

    }

    public KendaliInformasiJadwalBus() throws Exception {
        readDB();
    }

    private void readDB() throws Exception {
        String read = "select * From basisdatatugasbesar";
        PreparedStatement statement = koneksiMySQL.con().prepareStatement(read);
        ResultSet enter = statement.executeQuery();
        while (enter.next()) {
            nama = enter.getString(1);
            kodebus = enter.getString(2);
            kelas = enter.getString(3);
            tujuan = enter.getString(4);
            waktu = enter.getString(5);
            jam = enter.getString(6);
            harga = enter.getString(7);
            JalankanData.add(new Desain(nama, kodebus, kelas, tujuan, waktu, jam, harga));
        }
        System.out.println("waw");
    }

    public void jalan() {
        TabelKeseluruhan.setItems(JalankanData);
    }

    @FXML
    private void kembali(){
        dialogStage.close();
    }
}
