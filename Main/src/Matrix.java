import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {

    private JPanel innerPanel;
    private List<?>[] list;
    private int maxSize;
    public Matrix(){
        String input = JOptionPane.showInputDialog(null, "첫번째 행렬의 행을 입력해주세요.");
        int row = Integer.parseInt(input);
        System.out.println(row);

        input = JOptionPane.showInputDialog(null, "첫번째 행렬의 열을 입력해주세요.");
        int column = Integer.parseInt(input);
        System.out.println(column);

        //1차원 행렬
        if (column == 0){
            int [] example = new int[row];

            for(int i=0;i<row;i++){
                example[i] = -1;

            }

            new drawMatrix(example);
        }

        else {

            int[][] example = new int[row][column];

            for (int j = 0; j < column; j++) {
                for (int i = 0; i < row; i++) {
                    example[i][j] = -1;

                }
            }

            new drawMatrix(example);
        }






    }
}
