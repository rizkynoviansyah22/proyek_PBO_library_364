public class Anggota {
    private String nim;
    private String nama;




    public Anggota(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }


    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilkanAnggota() {
        System.out.println("NIM: " + nim + ", Nama: " + nama);
    }
}
