import java.net.*;
import java.io.*;

public class Example3 {
    public static void main(String[] args) {

        // 設定要連線的網站
        String website = "https://www.ntut.edu.tw/";

        try {
            // 建立 URL
            URI uri = URI.create(website);
            URL url = uri.toURL();

            // 建立網路連線
            URLConnection connection = url.openConnection();

            // 設定連線逾時時間
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // 讀取網頁資料
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            connection.getInputStream(), "UTF-8"))) {

                System.out.println("Successfully connected to the website!");
                System.out.println("Website Content： \n");

                String line;
                int count = 0;

                // 顯示前 10 行
                while ((line = reader.readLine()) != null && count < 10) {
                    System.out.println(line);
                    count++;
                }
            }

        } catch (IOException e) {
            System.out.println("Network connection failed: " + e.getMessage());
        }
    }
}