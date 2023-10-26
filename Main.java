package Basic_math_calculator;

import javax.swing.JLabel;

public class Main{

    public static void main(String[] args) {
        System.out.println("반갑다 어리석은 닝겐");

        setting_option Screen = new setting_option();


        creating_font message = new creating_font("True",100,50,500,300);
        message.data_check();
        message.show_message(Screen);
        
        

    }
}


//2023.10.26 목 23:21
//객체지향 프로그래밍 기법 숙달 필요.
// 필요한 부분 : 인수를 클래스 형태로 받는 것, 메소드 실행시 인수가 필요한 형태로 작성하기
// 폰트 출력시 스크린 데이터가 필요함.
// 클래스 선언 및 메소드 활용 지식 필요함.