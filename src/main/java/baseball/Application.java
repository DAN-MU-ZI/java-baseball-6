package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        do {
            play();
        } while(isRestart());
    }

    private static boolean isRestart() {
        return false;
    }

    private static void play() {
        List<Integer> computer = createRandomNumbers();
        do {
            String input = Console.readLine();
            List<Integer> user = parse(input);
        } while (false);
    }

    private static List<Integer> parse(String input) {
        List<Integer> parsedInput = new ArrayList<>();
        try {
            if (input.length() != 3) {
                throw new IllegalArgumentException();
            }
            List<String> listedInput = Arrays.asList(input);
            while(parsedInput.size() < 3) {
                int number = Integer.parseInt(listedInput.remove(0));
                if (!parsedInput.contains(number)) {
                    parsedInput.add(number);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return parsedInput;
    }

    private static List<Integer> createRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }
}
