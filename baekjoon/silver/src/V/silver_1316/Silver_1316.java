// 그룹 단어 체커
// 그룹 단어 체커란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우를 말한다.
// 예를 들면, ccazzzzbb 는 c, a, z, b가 모두 연솓해서 나타나고, kin 도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
// aabbccb 는 b가 떨어져 나타나기 때문에 그룹 단어가 아니다.

// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

package V.silver_1316;

import java.util.Scanner;

public class Silver_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어의 개수 입력하기
        int N = scanner.nextInt();
        int count = 0;

        // 각 단어에 대해 그룹 단어인지 확인
        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        // 그룹 단어의 개수 출력
        System.out.println(count);
    }

    // 그룹 단어인지 확인하는 함수
    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26]; // 알파벳 소문자의 사용 여부를 기록하는 배열
        char preCher = '\0'; // 이전 문자를 기록하는 변수
        // 초기값 \0은 null 문자로, 아무것도 없는 상태를 나타냅니다.
        // 현재 처리 중인 문자(currentChar)가 이전 문자(preChar)와 동일한지 여부를 비교하기 위함
        // '\0'은 널 문자(null character)를 나타내는 특별한 문자로, ASCII 값이 0인 제어 문자입니다.

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (currentChar != preCher) { // 현재 문자와 이전 문자가 다른지 확인
                // 두 문자가 다르면, if문 활성화, 새로운 문자에 대한 처리 시작
                // 다르지 않다면, 문자가 연속해서 나타나고 있다는 의미이므로 특별한 처리가 필요하지 않다.
                if (seen[currentChar - 'a']) {
                    // 현재 문자가 이전에 등장했는지를 확인합니다.
                    // 현재 문자가 배열에서 이미 true 로 설정되어 있는지 확인합니다.
                    // 만약 이미 true 로 설정되어있다면 현재 문자는 그룹 단어 조건을 만족하지 않는 것이므로 false 를 반환하고 메서드를 종료합니다.
                    return false; // 이미 등장한 문자가 다시 나타났지만 연속적이지 않음
                }
                seen[currentChar - 'a'] = true; // 현재 문자를 본 것으로 기록
                // 현재 문자가 처음 등장했음을 기록합니다.
                // 해당 문자의 인덱스 위치에 true 를 설정하여, 이후 같은 문자가 등장했을 때 중복 여부를 알 수 있게 합니다.
            }

            preCher = currentChar; // 현재 문자를 이전 문자로 업데이트
        }

        return true; // 그룹 단어임
        // 루프를 끝까지 통과하고, 중간에 false 로 반환되지 않았다면 이 단어는 그룹 단어로 판별됩니다.
    }
}
