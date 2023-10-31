import javax.swing.JLabel;

public class Label_option{

    // Field
    String message;
    int x;
    int y;
    int width;
    int height;

    //Constructor
    Label_option(String message,int x,int y,int width,int height){

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






}
