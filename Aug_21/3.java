import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String original, reverse = new String("");
        Scanner scan = new Scanner(System.in);
        original = scan.nextLine();

        /* original.length() -1 is the index of the last character in the string */
        for(int i = original.length() - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        System.out.println(reverse);
    }
}
