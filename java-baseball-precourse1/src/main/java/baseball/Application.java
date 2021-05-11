package baseball;

import baseball.domain.Calculator;
import baseball.domain.NumberGenerator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        //객체 지향 프로그래밍
        //1. 기능을 가지고 있는 클래스를 인스턴스화 한다.
        //2. 필요한 기능을 각 인스터스가 수행하게 한다. (의인화)
        //3. 각 결과를 종합한다.(합친다)

        final NumberGenerator generator= new NumberGenerator();
        final List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);
    }
}
