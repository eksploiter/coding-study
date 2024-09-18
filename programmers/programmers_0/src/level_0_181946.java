//두 개의 문자열 str1, str2 가 공백으로 구분되어 입력으로 주어집니다.
//입출력 예와 같이 str1 과 str2 을 이어서 출력하는 코드를 작성해보세요.

import java.util.Scanner;

public class level_0_181946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a + b);

        sc.close();
    }
}
