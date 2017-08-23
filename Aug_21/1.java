import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, oddCount = 0, evenCount = 0;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){

            num = scan.nextInt();

            if (num%2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Number of even numbers is: " + evenCount);
        System.out.println("Number of odd numbers is: " + oddCount);
    }
}
