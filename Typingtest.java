package BasicProjects;
import java.util.Scanner;
public class Typingtest{
        public static void main(String[] args) {
            System.out.println();
            System.out.println("Check your typing speed: ");
            System.out.println("---------------------------------------------------\n");
            String sentence = "The future belongs to those who believe in the beauty of their dreams.\n" ;
            System.out.println(sentence);

            Scanner scanner = new Scanner(System.in);
            long startTime = System.currentTimeMillis();

            String input = scanner.nextLine();
            long endTime = System.currentTimeMillis();

            // Calculate typing speed
            long timeTaken = endTime - startTime;
            int wordsTyped = input.split("\\s+").length;
            double timeTakenInMinutes = timeTaken / 60000.0;
            double wpm = wordsTyped / timeTakenInMinutes;
            System.out.println();
            System.out.printf("Your typing speed is %.2f WPM.", wpm);
            System.out.println("\n-------------------------------------------------------");
            scanner.close();
        }
    }



