import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.print("Jumlah angka: ");
        int T = input.nextInt();
        input.nextLine();

        String[] n = new String[T];
        
        System.out.println("Masukkan " + T + " angka: ");   
        for (int i = 0; i < T; i++) {
            n[i] = input.nextLine();
        }
        
        long temp;
        for (int i = 0; i < T; i++) {
            temp = Long.parseLong(n[i]);
            System.out.println("Angka " + n[i] + " dapat dimasukkan ke dalam:");

            if (temp >= Byte.MIN_VALUE && temp <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            
            if (temp >= Short.MIN_VALUE && temp <= Short.MAX_VALUE) {
                System.out.println("* short");
            }

            if (temp >= Integer.MIN_VALUE && temp <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }

            System.out.println("* long");
        }
    }
}
