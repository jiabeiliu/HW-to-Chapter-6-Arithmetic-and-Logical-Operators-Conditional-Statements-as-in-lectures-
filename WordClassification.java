import java.util.Scanner;

public class WordClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any word: ");
        
        long startTime = System.currentTimeMillis();
        String word = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        if (word.isEmpty()) {
            System.out.println("You did not enter any word");
        } else {
            long timeElapsed = (endTime - startTime) / 1000;
            int wordLength = word.length();
            String wordSize;

            if (wordLength <= 5) {
                wordSize = "short";
            } else if (wordLength <= 10) {
                wordSize = "medium";
            } else {
                wordSize = "long";
            }

            System.out.println("Your word is " + word);
            System.out.println("The length of the word is " + wordLength);
            System.out.println("It is a " + wordSize + " word");
            System.out.println("Your reaction time is " + timeElapsed + " seconds");
        }

        scanner.close();
    }
}
