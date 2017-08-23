import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String original, reverse = "", rword = "";
        Scanner scan = new Scanner(System.in);
        original = scan.nextLine();

        /* Extract each word in the sentence using the split command and put words in the array */
        String words[] = original.split(" ");

        for (int i = 0; i < words.length; i++){
            /* Reverse each word */
            for (int j = words[i].length() - 1; j >= 0; j--){
                rword = rword + words[i].charAt(j);
            }

            /* Constuct the reverse string using reversed word */
            reverse = reverse + " " + rword;
            rword = "";
        }
        System.out.println(reverse);
    }
}
