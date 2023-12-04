import java.util.Scanner;
public class UASN05 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a, b;
        char operator;

        try (// Membaca input dari pengguna
        Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan pertama: ");
            a = input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            b = input.nextInt();
            System.out.print("Masukkan operator (+, -, *, /): ");
            operator = input.next().charAt(0);
        }
        // Melakukan operasi
        switch (operator) {
            case '+':
                System.out.println(a + " + " + b + " = " + tambah(a, b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + kurang(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + kali(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + bagi(a, b));
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(int a, int b) {
        return (double) a / b;
    }
}
