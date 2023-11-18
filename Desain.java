package TugasBesarPerbaikan;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Desain {

    private final StringProperty nama;
    private final StringProperty Tujuan;
    private final StringProperty Harga;
    private final StringProperty KodeBus;
    private final StringProperty Kelas;
    private final StringProperty Waktu;
    private final StringProperty Jam;


    /**
     * Default constructor.
     */

    /**
     * Constructor with some initial data.
     *
     *
     */
    public Desain (){
        this(null, null, null, null, null, null, null);
    }

    public Desain(String Nama, String Tujuan, String Harga, String KodeBus, String Kelas, String Waktu, String Jam) {
        this.nama = new SimpleStringProperty(Nama);
        this.Tujuan = new SimpleStringProperty(Tujuan);
        this.Harga = new SimpleStringProperty(Harga);
        this.KodeBus = new SimpleStringProperty(KodeBus);
        this.Kelas = new SimpleStringProperty(Kelas);
        this.Waktu = new SimpleStringProperty(Waktu);
        this.Jam = new SimpleStringProperty(Jam);
    }

    public String getnama() {
        return nama.get();
    }

    public void setnama(String nama) {
        this.nama.set(nama);
    }

    public StringProperty namaProperty() {
        return nama;
    }

    public String getTujuan() {
        return Tujuan.get();
    }

    public void setTujuan(String Tujuan) {
        this.Tujuan.set(Tujuan);
    }

    public StringProperty TujuanProperty() {
        return Tujuan;
    }

    public String getHarga() {
        return Harga.get();
    }

    public void setHarga(String Harga) {
        this.Harga.set(Harga);
    }

    public StringProperty HargaProperty() {
        return Harga;
    }

    public String getKodeBus() {
        return KodeBus.get();
    }

    public void setKodeBus(String KodeBus) {
        this.KodeBus.set(KodeBus);
    }

    public StringProperty KodeBusProperty() {
        return KodeBus;
    }



    public String getKelas() {
        return Kelas.get();
    }

    public void setKelas(String Kelas) {
        this.Kelas.set(Kelas);
    }

    public StringProperty KelasProperty() {
        return Kelas;
    }



    public String getWaktu() {
        return Waktu.get();
    }

    public void setWaktu(String Waktu) {
        this.Waktu.set(Waktu);
    }

    public StringProperty WaktuProperty() {
        return Waktu;
    }



    public String getJam() {
        return Jam.get();
    }

    public void setJam(String Jam) {
        this.Jam.set(Jam);
    }

    public StringProperty JamProperty() {
        return Jam;
    }
}