public class Main  {
        public static void main ( String[] args ) {

            Jurusan D3RPLA = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
            Jurusan D3SI = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

            Mahasiswa Rendi = new Mahasiswa("6701", "Rendi");
            Mahasiswa Chaca = new Mahasiswa("6702", "Chaca");
            Mahasiswa Agus = new Mahasiswa("6703", "Agus");

            D3RPLA.addMahasiswa(Rendi);
            D3RPLA.addMahasiswa(Chaca);
            D3RPLA.addMahasiswa(Agus);

            Mahasiswa Ridwan = new Mahasiswa("6301", "Ridwan");
            Mahasiswa Siska = new Mahasiswa("6302", "Siska");
            Mahasiswa Zayn = new Mahasiswa("6303", "Zayn");
            Mahasiswa Rahmat = new Mahasiswa("6304", "Rahmat");

            D3SI.addMahasiswa(Ridwan);
            D3SI.addMahasiswa(Siska);
            D3SI.addMahasiswa(Zayn);
            D3SI.addMahasiswa(Rahmat);

            System.out.println("Kode: "+ D3RPLA.getKode());
            System.out.println("Nama: "+ D3RPLA.getNama());
            System.out.println("Daftar Mahasiswa: ");
            int nomor = 1;
            for(Mahasiswa mhs : D3RPLA.getMhs()) {
                System.out.println(nomor++ + ". " + mhs.getNim() + " - " + mhs.getNama());
            }
            System.out.println(" ");
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Kode: "+ D3SI.getKode());
            System.out.println("Nama: "+ D3SI.getNama());
            System.out.println("Daftar Mahasiswa: ");
            int nomor2 = 1;
            for(Mahasiswa mhs : D3SI.getMhs()) {
                System.out.println(nomor2++ + ". " + mhs.getNim() + " - " + mhs.getNama());
            }
        }
}


