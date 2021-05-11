package baseball.domain;

//공용 공공
public class Calculator {
    public final int shareBirthDay = 0710; //상수, 클래스 변수이면서 변하지 않는 값
    public static int shareResult = 0; //클래스 변수
    public int result = 0; //인스턴스 변수

    public Calculator(){

    }
    public int add(int number1, int number2){ //인스턴스 메서드
        result = number1 + number2;
        shareResult = result;
        return number1 + number2;
    }
}
