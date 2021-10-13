import java.util.ArrayList;

public class Jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs = new ArrayList();

    public Jurusan ( String kode, String nama ) {
        this.kode = kode;
        this.nama = nama;
    }

    public void addMahasiswa(Mahasiswa m){
        this.mhs.add(m);

    }

    public String getNama () {
        return nama;
    }

    public String getKode () {
        return kode;
    }

    public ArrayList<Mahasiswa>  getMhs () {
        return mhs;
    }
}


