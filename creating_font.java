package Basic_math_calculator;

import javax.swing.JLabel;
import Basic_math_calculator.setting_option;
import Basic_math_calculator.Main;

public class creating_font {

    // Field
    String message;
    int x;
    int y;
    int width;
    int height;

    //Constructor
    creating_font(String message,int x,int y,int width,int height){
        
        this.message = message;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
    }

    //Method
    public void data_check() {
        System.out.println("메시지 : " + message);
    
    }

    public show_message(Class Screen){
        JLabel la = new JLabel(this.message);
        la.setLocation(this.x, this.y);
        la.setSize(this.width, this.height);

        Screen.add(la);

        System.out.println("작동을 했으면 말을 해라");
    }
    

    

}
