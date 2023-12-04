 import java.util.Scanner;
 public class UASNO3 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int n;
        int a = 0;
        int b = 1;
        int c;

        try (// Membaca input dari pengguna
        Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n: ");
            n = input.nextInt();
        }
        // Menampilkan deret Fibonacci
        System.out.println("Deret Fibonacci sesuai nilai n:");
        System.out.println(a + ", " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
