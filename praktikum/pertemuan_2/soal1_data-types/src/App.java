import java.util.Scanner;
import java.math.BigInteger;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Masukkan jumlah angka
        System.out.print("Jumlah angka: ");
        int T = input.nextInt();
        input.nextLine();

        String[] n = new String[T];
        // Isi array dengan angka
        System.out.println("Masukkan " + T + " angka: ");
        for (int i = 0; i < T; i++) {
            n[i] = input.nextLine();
        }

        // Cek
        for (int i = 0; i < T; i++) {
            BigInteger num = new BigInteger(n[i]);

            if (num.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && num.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println(n[i] + " can be fitted in:");

                Long numLong = Long.parseLong(n[i]);
                if (numLong >= Byte.MIN_VALUE && numLong <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (numLong >= Short.MIN_VALUE && numLong <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (numLong >= Integer.MIN_VALUE && numLong <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (numLong >= Long.MIN_VALUE && numLong <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } else {
                System.out.println(n[i] + " can't be fitted anywhere");
            }
        }
    }
}

