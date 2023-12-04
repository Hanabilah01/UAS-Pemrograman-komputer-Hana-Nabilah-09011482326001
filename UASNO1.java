import java.util.Scanner;
public class UASNO1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int jumlahBeli;
        int hargaSatuan;
        float diskon;
        float totalHarga;

        try (// Membaca input dari pengguna
        Scanner input = new Scanner(System.in)) {
            System.out.print("Jumlah barang yang dibeli: ");
            jumlahBeli = input.nextInt();
            System.out.print("Harga satuan barang: ");
            hargaSatuan = input.nextInt();
        }
        // Menghitung total harga
        totalHarga = jumlahBeli * hargaSatuan;

        // Menghitung diskon
        if (jumlahBeli < 5) {
            diskon = 0;
        } else if (jumlahBeli <= 10) {
            diskon = 0.05f;
        } else if (jumlahBeli <= 20) {
            diskon = 0.1f;
        } else {
            diskon = 0.2f;
        }

        // Menghitung total harga setelah diskon
        float totalHargaDiskon = totalHarga - (totalHarga * diskon);

        // Menampilkan hasil
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon * 100 + "%");
        System.out.println("Total harga setelah diskon: " + totalHargaDiskon);
    }
}
