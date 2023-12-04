import java.util.Scanner;
public class UASN06 {
    public static boolean isPalindrome(String kata) {
        // Mengubah kata menjadi huruf kecil
        kata = kata.toLowerCase();

        // Melakukan looping dari kiri ke kanan
        for (int i = 0; i < kata.length() / 2; i++) {
            // Jika huruf di kiri dan kanan tidak sama, maka kata bukan palindrom
            if (kata.charAt(i) != kata.charAt(kata.length() - 1 - i)) {
                return false;
            }
        }

        // Jika sampai di sini, maka kata adalah palindrom
        return true;
    }

    public static void main(String[] args) {
        // Deklarasi variabel
        String kata;

        try (// Membaca input dari pengguna
        Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kata atau frase: ");
            kata = input.nextLine();
        }
        // Melakukan pengecekan
        if (isPalindrome(kata)) {
            System.out.println(kata + " adalah palindrom");
        } else {
            System.out.println(kata + " bukan palindrom");
        }
    }  
}
