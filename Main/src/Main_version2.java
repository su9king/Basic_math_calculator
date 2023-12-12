import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Main_version2 {

    //define global variable
    public static JFrame frame;
    private JButton matrixButton;
    // Main execution part
    public Main_version2(){

        createFrame();
        createButton();
        setButtonAction();
        setDisplay();

    }
    ////// Define function
    //setting Frame
    public static void createFrame() {

        frame = new JFrame("SMC_Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

    }

    private void createButton() {

        matrixButton = new JButton("행렬 계산");


    }

    public void setButtonAction(){


        //버튼 액션 첫번째 방법_현재 이 함수로 사용결정.
        matrixButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Matrix();
            }

        });

        //버튼 액션생성 코드 두번째 형태 위쪽의 형태가 클린하지만 일단 냅둠.
//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//
//                if (matrixButton.equals(ae.getSource())) {
//                    System.out.println("함수작동");
//
//                }
//
//            }
//        };
//        matrixButton.addActionListener(listener);

    };

    public void setDisplay(){

        JPanel panel = new JPanel(new FlowLayout());
        frame.add(panel);
        panel.add(matrixButton);

        frame.setVisible(true);

    }


    //System start
    public static void main(String[] args) {

        new Main_version2();


    }

}