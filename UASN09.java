import java.util.Stack;
public class UASN09 {
    public static boolean cekUrutanKurung(String ekspresi) {
        // Inisialisasi stack
        Stack<Character> stack = new Stack<>();

        // Membaca karakter per karakter dari ekspresi
        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            // Jika karakter adalah kurung buka, maka tambahkan ke stack
            if (karakter == '(' || karakter == '{' || karakter == '[') {
                stack.push(karakter);
            }

            // Jika karakter adalah kurung tutup, maka keluarkan dari stack
            else if (karakter == ')' || karakter == '}' || karakter == ']') {
                // Jika stack kosong, maka urutan kurung tidak benar
                if (stack.isEmpty()) {
                    return false;
                }

                // Jika karakter kurung tutup tidak sesuai dengan karakter kurung buka di stack, maka urutan kurung tidak benar
                char karakterTop = stack.pop();
                if ((karakter == ')' && karakterTop != '(') ||
                        (karakter == '}' && karakterTop != '{') ||
                        (karakter == ']' && karakterTop != '[')) {
                    return false;
                }
            }
        }

        // Jika stack tidak kosong, maka urutan kurung tidak benar
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Ekspresi dengan urutan kurung benar
        String ekspresi1 = "(a + b) * (c - d)";
        System.out.println(cekUrutanKurung(ekspresi1)); // true

        // Ekspresi dengan urutan kurung salah
        String ekspresi2 = "(a + b) * (c - d) )";
        System.out.println(cekUrutanKurung(ekspresi2)); // false
    }
}
