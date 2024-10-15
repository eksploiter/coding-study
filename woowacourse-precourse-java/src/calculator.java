// 문자열 덧셈 계산하기

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("덧셈할 문자를 입력해 주세요.");
        String input = scanner.nextLine();

        // 숫자가 아닌 모든 문자를 +로 대체한다.
        input = input.replaceAll("[^0-9]", "+");

        // 문자열을 +로 나누어서 배열에 저장한다.
        String[] numbers = input.split("\\+");

        int sum = 0;

        // 배열에 있는 숫자들을 모두 더한다.
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        // 결과 출력
        System.out.println("결과 : " + sum);
    }
}
