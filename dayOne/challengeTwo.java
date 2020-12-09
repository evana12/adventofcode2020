import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class challengeTwo {
    public static void main(String[] args) {
        int target = 2020;

        try {
            File file = new File("expenses.txt");
            Scanner scanner = new Scanner(file);
            Integer[] list = new Integer[200];
            
            for (int i = 0; i < list.length; i++) {
                list[i] = Integer.parseInt(scanner.nextLine());
            }

            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list.length; j++) {
                    for (int k = 0; k < list.length; k++) {
                        if (list[i] + list[j] + list[k] == target) {
                            System.out.println(list[i] * list[j] * list[k]);
                        }
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Houston, we have no file.");
        }
    }
}