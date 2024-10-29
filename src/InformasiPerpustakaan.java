public class InformasiPerpustakaan {

    private String kode;
    private String judul;


    public InformasiPerpustakaan(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
    }


    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void tampilkanInformasi() {
        System.out.println("Kode: " + kode + ", Judul: " + judul);
    }
}
