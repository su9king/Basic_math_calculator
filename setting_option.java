package Basic_math_calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class setting_option extends JFrame {

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    public setting_option() {

        setTitle("Calculator");
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        
    }
    
}
