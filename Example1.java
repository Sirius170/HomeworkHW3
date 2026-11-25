import java.awt.*;
import java.awt.event.*;

public class Example1 {
    public static void main(String[] args) {

        // 建立視窗
        Frame frame = new Frame("Java Example1");

        // 建立文字輸入框、按鈕及標籤
        TextField textField = new TextField(15);
        Button button = new Button("SEND");
        Label label = new Label("Input your name：");

        // 設定版面配置
        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // 設定按鈕點擊事件
        // 使用 trim() 避免空白輸入
        button.addActionListener((ActionEvent e) -> {
            String name = textField.getText().trim();
            label.setText("你好，" + name + "！");
        });


        // 設定關閉視窗事件
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // 使用 pack() 自動調整視窗大小
        //frame.setSize(350, 150);
        frame.pack();

        // 讓視窗顯示在螢幕中央
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}