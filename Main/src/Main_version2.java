

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_version2 {


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
        JFrame frame = new JFrame("SMC_Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    public void createButton() {

    }

    public void setButtonAction(){

    }

    public void setDisplay(){

    }


    //System start
    public static void main(String[] args) {

        new Main_version2();

    }

}