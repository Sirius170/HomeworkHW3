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
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                label.setText("Hello，" + name + "！");
            }
        });

        // 設定關閉視窗事件
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setSize(350, 150);
        frame.setVisible(true);
    }
}