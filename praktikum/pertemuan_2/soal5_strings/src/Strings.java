import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A, B;
        
        A = input.nextLine().toLowerCase();
        B = input.nextLine().toLowerCase();
        input.close();
        
        // sum
        System.out.println(A.length() + B.length());

        // compare lexicographically
        if(A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else if(B.compareTo(A) > 0) {
            System.out.println("No");
        } else {
            System.out.println("Are Equals");
        }

        // capitalize first letter
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1) );
    }
}

