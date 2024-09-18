// 그룹 단어 체커
// 그룹 단어 체커란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우를 말한다.
// 예를 들면, ccazzzzbb 는 c, a, z, b가 모두 연솓해서 나타나고, kin 도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
// aabbccb 는 b가 떨어져 나타나기 때문에 그룹 단어가 아니다.

// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

package V.silver_1316;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();

            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char preChar = '\0';

        for (int i =0 ;i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (currentChar != preChar) {
                if (seen[currentChar - 'a']) {
                    return false;
                }
                seen[currentChar - 'a'] = true;
            }

            preChar = currentChar;
        }
        return true;
    }
}
