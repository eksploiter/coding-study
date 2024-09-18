// 패린드롬인지 확인하기
// 알파벳 소문자로만 이루어진 단어가 주어진다.
// 이때, 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오

// 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.

// level, noon 은 팰린드롬이고, baekjoon, online, judge 는 팰린드롬이 아니다.

package III.bronze_10988;

import java.util.Scanner;

public class Bronze_10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // 입력 문자열을 뒤집은 문자열 생성
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
