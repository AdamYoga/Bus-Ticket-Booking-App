package TugasBesarPerbaikan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KendaliPemesananTiket {

    private Stage dialogStage;
    private Desain desain;
    private boolean okClicked = false;
    private NampilinAplikasi nampilinAplikasi;
    private String SimpanBentarKelas;
    private String SimpanBentarJam;
    String PanggilNama = null;
    String PanggilTujuan = null;
    String PanggilWaktu = null;
    String PanggilKodebus = null;
    String PanggilKelas = null;
    String PanggilJam = null;
    String PanggilHarga = null;
    String cocok;

    @FXML
    private TextField nama;
    @FXML
    private ComboBox<String> KodeBus;
    @FXML
    private RadioButton Kelas1;
    @FXML
    private RadioButton Kelas2;
    @FXML
    private RadioButton Kelas3;
    @FXML
    private TextField Tujuan;
    @FXML
    private ComboBox<String> Tanggal;
    @FXML
    private ComboBox<String> Bulan;
    @FXML
    private RadioButton Jam1;
    @FXML
    private RadioButton Jam2;
    @FXML
    private TextField Harga;
    @FXML
    private ToggleGroup SatuinLah;
    @FXML
    private ToggleGroup SatuinLagi;


    ObservableList<String> list = FXCollections.observableArrayList("SY01","SJ02","SB03");

    ObservableList<String> tanggal = FXCollections.observableArrayList("1","2","3","4","5","6","7","8"
            ,"9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30");

    ObservableList<String> bulan = FXCollections.observableArrayList("1","2","3","4","5","6","7","8"
            ,"9","10","11","12");

    private ObservableList<Desain> Mendata = FXCollections.observableArrayList();

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }


    @FXML
    private void SimpanDataKelas1 () {
        SimpanBentarKelas = Kelas1.getText();
        this.desain = new Desain();
        // untuk comboBox KodeBus
        String kodebus = KodeBus.getSelectionModel().getSelectedItem().toString();

        if (kodebus.equals("SY01")){
            desain.setTujuan("Surabaya - Yogyakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("80000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("120000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("170000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SJ02")){
            desain.setTujuan("Surabaya - Jakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("150000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("225000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("300000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SB03")){
            desain.setTujuan("Surabaya - Bali");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("90000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("175000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("250000");
                Harga.setText(desain.getHarga());
            }
        }

    }

    @FXML
    private void SimpanDataKelas2 () {
        SimpanBentarKelas = Kelas2.getText();
        this.desain = new Desain();
        // untuk comboBox KodeBus
        String kodebus = KodeBus.getSelectionModel().getSelectedItem().toString();

        if (kodebus.equals("SY01")){
            desain.setTujuan("Surabaya - Yogyakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("80000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("120000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("170000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SJ02")){
            desain.setTujuan("Surabaya - Jakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("150000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("225000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("300000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SB03")){
            desain.setTujuan("Surabaya - Bali");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("90000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("175000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("250000");
                Harga.setText(desain.getHarga());
            }
        }
    }

    @FXML
    private void SimpanDataKelas3 () {
        SimpanBentarKelas = Kelas3.getText();
        this.desain = new Desain();
        // untuk comboBox KodeBus
        String kodebus = KodeBus.getSelectionModel().getSelectedItem().toString();

        if (kodebus.equals("SY01")){
            desain.setTujuan("Surabaya - Yogyakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("80000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("120000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("170000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SJ02")){
            desain.setTujuan("Surabaya - Jakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("150000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("225000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("300000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SB03")){
            desain.setTujuan("Surabaya - Bali");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("90000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("175000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("250000");
                Harga.setText(desain.getHarga());
            }
        }
    }

    @FXML
    private void SimpanDataJam1 () {
        SimpanBentarJam = Jam1.getText();
    }

    @FXML
    private void SimpanDataJam2 () {
        SimpanBentarJam = Jam2.getText();
    }

    @FXML
    private void TombolLihat() throws IOException, SQLException {
        this.desain = new Desain();
        // untuk comboBox KodeBus
        String kodebus = KodeBus.getSelectionModel().getSelectedItem().toString();
        String PanggilWaktu1 = Tanggal.getSelectionModel().getSelectedItem().toString();
        String PanggilWaktu2 = Bulan.getSelectionModel().getSelectedItem().toString();

        if (kodebus.equals("SY01")){
            desain.setTujuan("Surabaya - Yogyakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("80000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("120000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("170000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SJ02")){
            desain.setTujuan("Surabaya - Jakarta");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("150000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("225000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("300000");
                Harga.setText(desain.getHarga());
            }
        }

        if (kodebus.equals("SB03")){
            desain.setTujuan("Surabaya - Bali");
            Tujuan.setText(desain.getTujuan());
            if (SimpanBentarKelas.equals("EKONOMI")){
                desain.setHarga("90000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("BISNIS")){
                desain.setHarga("175000");
                Harga.setText(desain.getHarga());
            }
            if (SimpanBentarKelas.equals("EKSEKUTIF")){
                desain.setHarga("250000");
                Harga.setText(desain.getHarga());
            }
        }

        // untuk textfields nama
        if (isInputValid()) {
            PanggilNama = nama.getText();
            PanggilTujuan = Tujuan.getText();
            PanggilWaktu = PanggilWaktu1 + "." + PanggilWaktu2 + ".2021";
            PanggilKodebus = KodeBus.getSelectionModel().getSelectedItem().toString();
            PanggilKelas = SimpanBentarKelas;
            PanggilJam = SimpanBentarJam;
            PanggilHarga = desain.getHarga();

            desain.setnama(nama.getText());
            desain.setTujuan(Tujuan.getText());
            desain.setWaktu(PanggilWaktu1 + " . " + PanggilWaktu2 + " . 2021");
            desain.setKodeBus(kodebus);
            desain.setKelas(SimpanBentarKelas);
            desain.setJam(SimpanBentarJam);

            System.out.println(desain.getnama());
            System.out.println(desain.getTujuan());
            System.out.println(SimpanBentarKelas);
            System.out.println(SimpanBentarJam);
            System.out.println(desain.getWaktu());


            Harga.setText(desain.getHarga());
        }
        MemasukkanDataKePHP();
        okClicked = true;
        NampilinAplikasi buka = new NampilinAplikasi();
        buka.RiwayatPemesanan();
        TombolCancel();
    }

    public void MemasukkanDataKePHP() throws SQLException {
        cocok = "SELECT * FROM `basisdatatugasbesar`"; //nyocokin
        PreparedStatement tampilin = koneksiMySQL.con().prepareStatement(cocok);
        ResultSet rs = tampilin.executeQuery();

        String db = "insert into basisdatatugasbesar(Nama, KodeBus, Kelas, Tujuan, TanggalKeberangkatan, JadwalKeberangkatan, Harga) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = koneksiMySQL.con().prepareStatement(db);

        stmt.setString(1, PanggilNama);
        stmt.setString(2, PanggilKodebus);
        stmt.setString(3, PanggilKelas);
        stmt.setString(4, PanggilTujuan);
        stmt.setString(5, PanggilWaktu);
        stmt.setString(6, PanggilJam);
        stmt.setString(7, PanggilHarga);
        stmt.executeUpdate();
        while (rs.next()) {
            System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getString(4)
                    + " | " + rs.getString(5) + " | " + rs.getString(6) + " | " + rs.getString(7));
        }
        tampilin.close();
        stmt.close();

    }

    @FXML
    private void TombolCancel(){
        dialogStage.close();
    }

    private boolean isInputValid() {
        String errorMessage = "";

        if (nama.getText() == null || nama.getText().length() == 0) {
            errorMessage += "No valid first name!\n";
        }
        if (Tujuan.getText() == null || Tujuan.getText().length() == 0) {
            errorMessage += "No valid first name!\n";
        }
        if (errorMessage.length() == 0) {
            return true;
        }
        else {
            // Show the error message.
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }

    public void setMainApp(NampilinAplikasi nampilinAplikasi) {
        this.nampilinAplikasi = nampilinAplikasi;
    }

    @FXML
    private void initialize() {
        KodeBus.setItems(list);
        Tanggal.setItems(tanggal);
        Bulan.setItems(bulan);
    }
}