//문자열 str 이 주어집니다.
//문자열을 시계방향으로 90도 돌려서 아래 입출력 예시와 같이 출력하는 코드를 작성해보세요.

import java.util.Scanner;

public class level_0_181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //문자열 구하기
        int len = str.length();

        //문자열을 시계방향으로 90도 돌려서 출력
        for (int i = 0; i < len; i++) {
            System.out.println(str.charAt(i));
        }

        sc.close();
    }
}
