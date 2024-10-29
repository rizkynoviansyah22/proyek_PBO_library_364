public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("005", "Bumi", "Tere Liye", 4);
        Buku buku2 = new Buku("006", "Laskar Pelangi", "Andrea Hirata", 2);

        Anggota anggota1 = new Anggota("110", "Eko");
        Anggota anggota2 = new Anggota("112", "Dimas");


        System.out.println("Data Buku:");
        tampilkanInformasiBuku(buku1);
        System.out.println();
        tampilkanInformasiBuku(buku2);


        System.out.println("\nData Anggota:");
        anggota1.tampilkanAnggota();
        anggota2.tampilkanAnggota();


        System.out.println("\n=============== Transaksi Peminjaman ===============");
        TransaksiPeminjaman peminjaman1 = new TransaksiPeminjaman(anggota1, buku1);
        peminjaman1.pinjamBuku();
        TransaksiPeminjaman peminjaman2 = new TransaksiPeminjaman(anggota2, buku2);
        peminjaman2.pinjamBuku();

        System.out.println("\n=============== Transaksi Pengembalian ===============");
        TransaksiPengembalian pengembalian1 = new TransaksiPengembalian(anggota1, buku1);
        pengembalian1.kembalikanBuku();
        TransaksiPengembalian pengembalian2 = new TransaksiPengembalian(anggota2, buku2);
        pengembalian2.kembalikanBuku();

        System.out.println("Data Buku:");
        tampilkanInformasiBuku(buku1);
        System.out.println();
        tampilkanInformasiBuku(buku2);
    }


    private static void tampilkanInformasiBuku(Buku buku) {
        System.out.println("Kode   = " + buku.getKode());
        System.out.println("Judul  = " + buku.getJudul());
        System.out.println("Penulis = " + buku.getPenulis());
        System.out.println("Stok   = " + buku.getStok());
    }
}
