public abstract class Transaksi {
    public Anggota anggota;
    public Buku buku;


    public Transaksi(Anggota anggota, Buku buku) {
        this.anggota = anggota;
        this.buku = buku;
    }


    public abstract void pinjamBuku();
    public abstract void kembalikanBuku();
}
