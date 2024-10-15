import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("결과 : 0");
            return;
        }

        // 커스텀 구분자 처리 및 숫자 추출
        String delimiter = "[,:]";
        String numberString = input;
        if (input.startsWith("//")) {
            int newLineIndex = input.indexOf("\n");
            if (newLineIndex == -1) {
                throw new IllegalArgumentException("커스텀 구분자 뒤에 줄바꿈이 필요합니다.");
            }
            delimiter = Pattern.quote(input.substring(2, newLineIndex));
            numberString = input.substring(newLineIndex + 1);
        }

        // 음수 체크를 위한 정규식
        if (Pattern.compile("-\\d").matcher(numberString).find()) {
            throw new IllegalArgumentException("음수는 허용되지 않습니다.");
        }

        // 구분자를 기준으로 문자열을 분리
        String[] numbers = numberString.split(delimiter);
        numbers = Stream.of(numbers)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        if (numbers.length == 0) {
            throw new IllegalArgumentException("숫자가 포함되어 있지 않습니다.");
        }

        int sum = 0;

        for (String num : numbers) {
            try {
                int parsedNumber = Integer.parseInt(num.trim());
                sum += parsedNumber;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: " + num);
            }
        }

        System.out.println("결과 : " + sum);
    }
}