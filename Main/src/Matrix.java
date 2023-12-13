import javax.swing.*;
import java.util.List;

public class Matrix {

    private JPanel innerPanel;
    private List<?>[] list;
    private int maxSize;
    public Matrix(){
        String input = JOptionPane.showInputDialog(null, "첫번째 행렬의 행을 입력해주세요.");
        int number = Integer.parseInt(input);
        System.out.println(number);


        int[][] example = {{0,3,4},
                            {4,0,2},
                            {7,0,0}};
        new drawMatrix(example);





    }
}
