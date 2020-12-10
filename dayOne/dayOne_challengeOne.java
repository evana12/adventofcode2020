import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class dayOne_challengeOne {
    public static void main(String[] args) {
        int target = 2020;
        String home = System.getProperty("user.dir");
        System.out.println("User home directory is: " + home);
        File userHome = new File(home);
        
        try {
            File file = new File(userHome, "expenses.txt");
            Scanner scanner = new Scanner(file);
            Integer[] list = new Integer[200];
            
            for (int i = 0; i < list.length; i++) {
                list[i] = Integer.parseInt(scanner.nextLine());
            }

            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] + list[j] == target) {
                        System.out.println(list[i] * list[j]);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Houston, we have no file.");
        }
    }
}