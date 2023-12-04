import java.util.ArrayList;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println();
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void pinjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Buku sedang dipinjam oleh orang lain.");
        }
    }

    public void kembalikanBuku() {
        if (dipinjam) {
            dipinjam = false;
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Buku sudah tersedia di perpustakaan.");
        }
    }

    public String getJudul() {
        return null;
    }
}

class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku dalam Perpustakaan:");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInformasi();
        }
    }

    public Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}

public class UASNO7 {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku ke perpustakaan
        Buku buku1 = new Buku("Java Programming", "John Doe", 2020);
        Buku buku2 = new Buku("Python Basics", "Jane Smith", 2018);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan daftar buku
        perpustakaan.tampilkanDaftarBuku();

        // Meminjam buku
        Buku bukuDipinjam = perpustakaan.cariBuku("Java Programming");
        if (bukuDipinjam != null) {
            bukuDipinjam.pinjamBuku();
        }

        // Menampilkan daftar buku setelah dipinjam
        perpustakaan.tampilkanDaftarBuku();

        // Mengembalikan buku
        if (bukuDipinjam != null) {
            bukuDipinjam.kembalikanBuku();
        }

        // Menampilkan daftar buku setelah dikembalikan
        perpustakaan.tampilkanDaftarBuku();
    }
}