import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num word: ");
        int num_word = sc.nextInt();

        sc.nextLine();

        System.out.println("word: ");
        String origin_word = sc.nextLine();
        String [] new_word = origin_word.split(" ");
        
        for (String word : new_word) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += Character.toLowerCase(word.charAt(i));
            }
            if (reverse.length() > 0) {
                reverse = Character.toUpperCase(reverse.charAt(0)) + reverse.substring(1);
            }
            System.out.print(reverse + " ");
        }
    }
}