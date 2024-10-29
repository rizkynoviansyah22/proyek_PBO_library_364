public class TransaksiPeminjaman extends Transaksi {

    public TransaksiPeminjaman(Anggota anggota, Buku buku) {
        super(anggota, buku); // Inheritance
    }


    @Override
    public void pinjamBuku() {
        System.out.println("Anggota:");
        System.out.println("ID   = " + anggota.getNim());
        System.out.println("Nama = " + anggota.getNama());


        System.out.println();

        System.out.println("Buku:");
        System.out.println("Kode   = " + buku.getKode());
        System.out.println("Judul  = " + buku.getJudul());
        System.out.println("Penulis = " + buku.getPenulis());
        System.out.println("Stok   = " + buku.getStok());

        if (buku.getStok() > 0) {
            buku.kurangiStok();
            System.out.println("\nPeminjaman berhasil: " + anggota.getNama() + " meminjam " + buku.getJudul());
        } else {
            System.out.println("\nStok habis untuk buku: " + buku.getJudul());
        }
    }


    @Override
    public void kembalikanBuku() {
        System.out.println("Silakan lakukan pengembalian di bagian pengembalian.");
    }
}
