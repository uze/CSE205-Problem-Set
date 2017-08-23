import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Coffee       2. Tea      3. Coke     4. Orange Juice\n");
        Scanner scan = new Scanner(System.in);
        int choice, coffeeCounter = 0, teaCounter = 0, cokeCounter = 0, orangeJuiceCounter = 0, count = 0;
        do {
            count++;
            System.out.println("Please input the favorite beverage of person #" + count + ": Choose 1, 2, 3, or 4 from the above menu or -1 to exit the program.");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    coffeeCounter++;
                    break;
                case 2:
                    teaCounter++;
                    break;
                case 3:
                    cokeCounter++;
                    break;
                case 4:
                    orangeJuiceCounter++;
                    break;
                default:
                    System.out.println("Please enter a valid number!");
                    break;
            }
        } while (choice != -1);

        System.out.println("\nThe total number of people surveyed is " + (count-1) + ". The results are as follows: \n");
        System.out.println("Beverage            Number of Votes");
        System.out.println("***********************************");
        System.out.println("Coffee:             " + coffeeCounter);
        System.out.println("Tea:                " + teaCounter);
        System.out.println("Coke:               " + cokeCounter);
        System.out.println("Orange Juice:       " + orangeJuiceCounter);
    }
}
