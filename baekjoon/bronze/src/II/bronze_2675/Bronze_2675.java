// 문자열 반복
// 사이트 참고

package II.bronze_2675;

import java.util.Scanner;

public class Bronze_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    System.out.print(ch);
                }
            }
        }
    }
}
