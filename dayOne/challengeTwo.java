import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;

public class day1 {
    public static void main(String[] args) {
        int target = 2020;
        ArrayList<Integer> expenseList = new ArrayList<Integer>();

        try {
            File file = new File("expenses.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                expenseList.add(Integer.parseInt(scanner.nextLine()));
            }

            for (int i : expenseList) {
                for (int j : expenseList) {
                    for (int k : expenseList) { 
                        if (i + j + k == target) {
                            System.out.println(i * j * k);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File wasn't found");
        }
    }
}