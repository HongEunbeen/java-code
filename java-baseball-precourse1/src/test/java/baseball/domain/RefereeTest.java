package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.*;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;

class RefereeTest {
    private Referee referee;

    private static final List<Integer> ANSWER = Arrays.asList(1,2,3);

    @BeforeEach
    void setUp(){
        referee = new Referee();
    }
    @ParamerterizedTest
    @CsvSource({"2,3,4,0 볼 3 스트라이크", "7,8,9,아웃", "2,3,1,3 볼 0 스트라이크", "1,3,2,2, 볼 1 스크라이크"})
    public void compare(int number1, int number2, int number3, String expected){
        String actual = referee.compare(ANSWER, Arrays.asList(number1, number2, number3));
        assertThat(actual).isEqualTo(expected);
    }
    @Test
     void 스트라이크3() {
        Referee referee = new Referee();
        String result = referee.compare(ANSWER, Arrays.asList(1,2,3));
        assertion.assertThat(result).isEqualTo("0볼 스트라이크");
    }

    @Test
    void 아웃() {
        Referee referee = new Referee();
        String result = referee.compare(ANSWER, Arrays.asList(7,8,9));
        assertTaht(result).isEqualTo("아웃");
    }

    @Test
    void 볼3() {
        Referee referee = new Referee();
        String result = referee.compare(ANSWER, Arrays.asList(2,3,1));
        assertTaht(result).isEqualTo("3볼 0 스트라이크");
    }

    @Test
    void 볼2_스트라이크1() {
        Referee referee = new Referee();
        String result = referee.compare(ANSWER, Arrays.asList(1,3,2));
        assertTaht(result).isEqualTo("2볼 1 스트라이크");
    }
}