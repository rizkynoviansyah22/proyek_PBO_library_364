public class Petugas {
    private String nama;
    private String idPetugas;

    public Petugas(String nama, String idPetugas) {
        this.nama = nama;
        this.idPetugas = idPetugas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public void tampilkanPetugas() {
        System.out.println("\nNama Petugas: " + nama + ", ID Petugas: " + idPetugas);
    }
}
