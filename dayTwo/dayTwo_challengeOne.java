import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo_challengeOne {
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

                int min = Integer.parseInt(scanner.next());

                //capture max
                scanner.useDelimiter(" ");

                String orig = scanner.next();

                String updated = orig.replace("-", "");

                int max = Integer.parseInt(updated);

                //capture letter
                scanner.useDelimiter(":");

                String letterString = scanner.next();

                char letter = letterString.charAt(1);

                //capture sequence to check
                String origSequence = scanner.nextLine();

                String sequence = origSequence.replace(": ", "");

                char[] sequenceArray = sequence.toCharArray();

                int instances = 0;

                for (int i = 0; i < sequenceArray.length; i++) {
                    if (sequenceArray[i] == letter) {
                        instances++;
                    }
                }

                if (instances >= min && instances <= max) {
                    validPasswords++;
                }
            }

            System.out.println(validPasswords);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Houston, we have no file.");
        }
    }
}
