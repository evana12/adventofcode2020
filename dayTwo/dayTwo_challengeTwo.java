import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo_challengeTwo {
    public static void main(String[] args) {
        String home = System.getProperty("user.dir");
        File userHome = new File(home);
        
        try {
            File file = new File(userHome, "input.txt");
            Scanner scanner = new Scanner(file);
            int validPasswords = 0;

            while (scanner.hasNextLine()) {
                //capture min
                scanner.useDelimiter("-");

                int indexOne = Integer.parseInt(scanner.next());

                //capture max
                scanner.useDelimiter(" ");

                String orig = scanner.next();

                String updated = orig.replace("-", "");

                int indexTwo = Integer.parseInt(updated);

                //capture letter
                scanner.useDelimiter(":");

                String letterString = scanner.next();

                char letter = letterString.charAt(1);

                //capture sequence to check
                String origSequence = scanner.nextLine();

                String sequence = origSequence.replace(": ", "");

                char[] sequenceArray = sequence.toCharArray();

                if (sequenceArray[indexOne - 1] == letter || 
                        sequenceArray[indexTwo - 1] == letter) {
                    validPasswords++;
                }

                System.out.println("first index is: " + indexOne);
                System.out.println("second index is: " + indexTwo);
                System.out.println("letter is: " + letter);
                System.out.println("sequence is " + sequence);

                if (sequenceArray[indexOne - 1] == letter || 
                    sequenceArray[indexTwo - 1] == letter) {
                    System.out.println(true);
                }
            }

            //System.out.println(validPasswords);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Houston, we have no file.");
        }
    }
}
