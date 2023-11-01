import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_version2 {



    public static void main(String[] args) {

        // JFrame 생성
        JFrame frame = new JFrame("Text Output Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // JFrame 크기 및 위치 설정
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);  // 화면 중앙에 표시

        // JFrame
        frame.setLayout(new FlowLayout());

        // JFrame을 보이도록 설정
        JButton plus_button = new JButton("덧셈");

        ActionListener listenera = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel("첫번째 숫자를 입력하세요.");
                JTextField txt = new JTextField(10);

                JButton complete_button = new JButton("입력완료");
                frame.add(complete_button);
                frame.add(label);
                frame.add(txt);

                frame.setVisible(true);

                ActionListener listenerb = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        frame.remove(label);
                        JLabel label = new JLabel("입력한 값은 : "+ txt.getText());

                        frame.add(label);
                        frame.setVisible(true);


                    }
                };
                complete_button.addActionListener(listenerb);
            }
        };

        plus_button.addActionListener(listenera);


        frame.add(plus_button);

        frame.setVisible(true);



    }

}