import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectScreen {

    public SelectScreen(){

        JFrame frame = new JFrame("Text Output Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);  // 화면 중앙에 표시

        // JFrame
        frame.setLayout(new FlowLayout());
        JButton plus_button = new JButton("덧셈");
        ActionListener listenera = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(plus_button);
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
                        frame.remove(complete_button);
                        int a = Integer.parseInt(txt.getText());
                        frame.remove(txt);

                        JLabel label = new JLabel("두번째 숫자를 입력하세요.");
                        JTextField txt2 = new JTextField(10);

                        JButton complete_button = new JButton("입력완료");
                        frame.add(txt2);
                        frame.add(complete_button);
                        frame.add(label);
                        frame.setVisible(true);

                        ActionListener listenerc = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                frame.remove(label);
                                frame.remove(complete_button);
                                int b = Integer.parseInt(txt2.getText());
                                JLabel label = new JLabel("결과값 : " + (a + b));
                                frame.add(label);
                                frame.setVisible(true);
                                System.out.println(a+b);






                            }
                        };
                        complete_button.addActionListener(listenerc);


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
