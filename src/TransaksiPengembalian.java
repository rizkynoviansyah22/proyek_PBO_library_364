public class TransaksiPengembalian extends Transaksi {

    public TransaksiPengembalian(Anggota anggota, Buku buku) {

        super(anggota, buku); // Inheritance
    }


    @Override
    public void pinjamBuku() {
        System.out.println("Silakan lakukan peminjaman di bagian peminjaman.");
    }


    @Override
    public void kembalikanBuku() {
        System.out.println("Anggota:");
        System.out.println("ID   = " + anggota.getNim());
        System.out.println("Nama = " + anggota.getNama());

        // Menambahkan baris kosong untuk paragraf baru
        System.out.println();

        System.out.println("Buku:");
        System.out.println("Kode   = " + buku.getKode());
        System.out.println("Judul  = " + buku.getJudul());
        System.out.println("Penulis = " + buku.getPenulis());
        System.out.println("Stok   = " + buku.getStok());

        buku.tambahStok();
        System.out.println("\nPengembalian berhasil: " + anggota.getNama() + " mengembalikan " + buku.getJudul());
    }
}
