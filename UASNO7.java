import java.util.Scanner;

public class UASNO7 {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor untuk inisialisasi atribut buku
    public UASNO7(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Awalnya buku tidak dipinjam
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println();
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (dipinjam) {
            System.out.println("Buku ini sudah dipinjam.");
        } else {
            System.out.println("Anda berhasil meminjam buku.");
            dipinjam = true;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Membuat objek buku
        UASNO7 buku1 = new UASNO7("Introduction to AI", "Robert Williams", 2022);
        UASNO7 buku2 = new UASNO7("Database Management", "Emily Davis", 2018);

        // Menampilkan informasi buku sebelum dipinjam
        System.out.println("Informasi Buku Sebelum Dipinjam:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        // Meminjam buku
        buku1.pinjamBuku();
        buku2.pinjamBuku();

        // Menampilkan informasi buku setelah dipinjam
        System.out.println("Informasi Buku Setelah Dipinjam:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

}

}