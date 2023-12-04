import java.util.ArrayList;
import java.util.Scanner;
public class UASN04 {
public static void main(String[] args) {
        // Deklarasi variabel
        int n;
        ArrayList<Integer> faktor = new ArrayList<>();

        try (// Membaca input dari pengguna
        Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan bulat positif: ");
            n = input.nextInt();
        }
        // Memfaktorisasi bilangan
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                faktor.add(i);
                n /= i;
            }
        }

        // Menampilkan hasil
        System.out.println("Faktorisasi " + n + ": ");
        for (int i = 0; i < faktor.size(); i++) {
            if (i > 0) {
                System.out.print(" * ");
            }
            System.out.print(faktor.get(i));
        }
    }
}