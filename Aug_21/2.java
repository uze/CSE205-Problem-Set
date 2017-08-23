import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        while (number > 0){
            // Get the last digit of the number
            sum += number % 10; // sum = sum + number % 10;

            // Remove the last digit from the number
            number /= 10; // number = number / 10;
        } System.out.println("Sum = " + sum);
    }
}
