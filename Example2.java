import java.io.*;
import java.util.*;

public class Example2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 建立 ArrayList 儲存科目
        ArrayList<String> subjects = new ArrayList<>();

        // 輸入三個科目
        for (int i = 0; i < 3; i++) {
            //System.out.print("Enter the subject:");
            System.out.print("Please enter subject " + (i + 1) + ": ");
            subjects.add(scanner.nextLine());
        }

        // 將資料寫入文字檔
        try (FileWriter writer = new FileWriter("subjects.txt")) {

            // System.lineSeparator() 會依照作業系統使用適合的換行符號，
            // 讓程式在 Windows、Linux 等不同系統上有較好的相容性
            for (String subject : subjects) {
                // writer.write(subject + "\n");
                writer.write(subject + System.lineSeparator());
            }

            System.out.println("\nData has been successfully written to the file！");

        } catch (IOException e) {
            System.out.println("File write failed: " + e.getMessage());
        }

        // 從文字檔讀取資料
        System.out.println("\nRead file content: ");

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("subjects.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }

        scanner.close();
    }
}