import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Main_version2 {

    //define global variable
    private JFrame frame;
    private JButton matrixButton;

    // Main execution part
    public Main_version2(){

        createFrame();
        createButton();
        setDisplay();
        setButtonAction();

    }
    ////// Define function
    //setting Frame
    public void createFrame() {

        frame = new JFrame("SMC_Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

    }

    private void createButton() {

        matrixButton = new JButton("행렬 계산");


    }

    public void setButtonAction(){

    }

    private void setDisplay(){

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