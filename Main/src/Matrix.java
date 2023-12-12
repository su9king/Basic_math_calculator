import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Matrix {

    private JPanel innerPanel;
    private List<?>[] list;
    private int maxSize;
    public Matrix(){

        System.out.println(list.length);
        maxSize = list[0].size();
        for(List<?> i : list) {
            if(i.size() > maxSize)  maxSize = i.size();
        }
        Main_version2.frame.setSize(80 * maxSize, 40 + 80 * list.length);
        Main_version2.frame.setTitle("Array");
        Main_version2.frame.setLocationRelativeTo(null);  // 정중앙 위치에 배치

        innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(list.length, 3));// (열, 행): 열의 수가 중요
        innerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        innerPanel.setBackground(Color.WHITE);
        Main_version2.frame.add(innerPanel);
        //Main_version2.frame.list = list;

        //this.initComp();
        //this.setVisible(true);




    }
}
