import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Matrix {

    public Matrix(){

        JFrame frame = new JFrame("계산 분야 선택");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);  // 화면 중앙에 표시



        // JFrame
        frame.setLayout(new FlowLayout());
        JButton plus_button = new JButton("행렬 계산");


        frame.add(plus_button);
        frame.setVisible(true);
        plus_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");

            }
        });


        ActionListener A_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                System.out.println("TESt");
                JLabel label = new JLabel("첫번째 숫자를 입력하세요.");

                frame.setVisible(true);
            }
        };


    }
}
