package Basic_math_calculator;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main{

    public static void main(String[] args) {


        
         // JFrame 생성
        JFrame frame = new JFrame("Text Output Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 출력할 문자열
        String text = "HHHHHH";
        
        // JLabel 생성 및 문자열 설정
        JLabel label = new JLabel(text);
        
        // JLabel을 JFrame의 content pane으로 설정
        frame.getContentPane().add(label);
        
        // JFrame 크기 및 위치 설정
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);  // 화면 중앙에 표시

        // JFrame 
        frame.setLayout(new FlowLayout());
        
        // JFrame을 보이도록 설정
        frame.add(new JButton("뭘봐 버튼이다임마"));
        frame.setVisible(true);

        

    }
}


//2023.10.26 목 23:21
//객체지향 프로그래밍 기법 숙달 필요.
// 필요한 부분 : 인수를 클래스 형태로 받는 것, 메소드 실행시 인수가 필요한 형태로 작성하기
// 폰트 출력시 스크린 데이터가 필요함.
// 클래스 선언 및 메소드 활용 지식 필요함.