import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;

public class challengeOne {
    public static void main(String[] args) {
        int target = 2020;
        ArrayList<Integer> expenseList = new ArrayList<Integer>();
        String home = System.getProperty("user.dir");
        System.out.println("User home directory is: " + home);
        File userHome = new File(home);
        // Put files in a known and reproducible path!
        
        try {
            File file = new File(userHome, "expenses.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                expenseList.add(Integer.parseInt(scanner.nextLine()));
            }

            for (int i : expenseList) {
                for (int j : expenseList) {
                    if (i + j == target) {
                        System.out.println(i * j);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Houston, we have no file.");
        }
    }
}