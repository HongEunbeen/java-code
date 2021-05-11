package baseball;

import baseball.domain.Calculator;
import baseball.domain.Judgment;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        final Referee referee = new Referee();
        final String result = referee.compare(Arrays.asList(3,1,2),Arrays.asList(3,1,2));
        System.out.println(result);
    }
}
