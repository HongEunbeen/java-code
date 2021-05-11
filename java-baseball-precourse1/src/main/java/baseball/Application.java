package baseball;

import baseball.domain.Calculator;
import baseball.domain.Judgment;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        final List<Integer> computer = generator.createRandomNumbers();

        Referee referee = new Referee();
        //0볼 0스트라이크
        String result = "";
        while(result.equals("0 볼 3 스크라이크")) {
            result = referee.compare(computer, askNumbers());
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
    public static List<Integer> askNumbers(){
        System.out.println("숫자를 입력해 주세요 : ");
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for(String number : input.split("")){
            numbers.add(Integer.parseInt(number));
        }
        return numbers;

    }
}
