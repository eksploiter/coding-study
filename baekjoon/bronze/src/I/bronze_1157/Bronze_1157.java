// 단어 공부
// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
// 단, 대문자와 소문자를 구분하지 않는다.

// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

package I.bronze_1157;

import java.util.Scanner;

public class Bronze_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받은 단어를 모두 대문자로 변환
        String word = scanner.nextLine().toUpperCase();

        // 알파벳 빈도를 저장할 배열 (A-Z는 26개의 알파벳)
        int[] frequency = new int[26];

        // 각 문자에 댜한 빈도를 계산
        for (int i = 0; i < word.length(); i++) { // String 배열이므로 word.length() 이렇게 뒤에 괄호가 있다.
            char ch = word.charAt(i);
            frequency[ch - 'A']++;
        }

        // 가장 많이 사용된 알파벳 찾기
        int maxFrequency = -1;
        char mostFrequencyChar = '?';
        for (int i = 0; i < frequency.length; i++) { // 정수형 배열이므로 frequency.length 이다.(뒤에 괄호 없다.)
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequencyChar = (char) (i + 'A');
            } else if (frequency[i] == maxFrequency) { // 이 부분은 같은 같은 빈도의 수가 있는지 찾아내는 곳
                mostFrequencyChar = '?';
            }
        }

        // 결과물 출력
        System.out.println(mostFrequencyChar);
    }
}

// String word = scanner.nextLine().toUpperCase();
// - 사용자로부터 한 줄의 문자열을 입력받습니다.
// - 압력받은 문자열을 모두 대문자로 변환합니다. 이는 대소문자 구분 없이 알파벳 빈도를 계산하기 위해 필요합니다.

// int[] frequency = new int[26];
// - 알파벳의 빈도를 저장할 정수 배열을 생성합니다. 배열의 크기는 26으로,
// 이는 영어 알파벳(A-Z) 개수와 같습니다.
// - frequency[0]은 A의 빈도를, frequency[25]는 Z의 빈도를 나타냅니다.

// for (int i = 0; i < word.length(); i++) {
//      char ch = word.charAt(i);
//      frequency[ch - 'A']++;
// }
// - 이 for 루프는 입력된 단어의 각 문자를 순회하며 그 빈도를 계산합니다.
// - word.charAt(i)는 문자열 word 의 i번째 문자를 가져옵니다.
// - ch - 'A'는 해당 문자가 알파벳 배열에서 몇 번째에 해당하는지 계산합니다.
// 예를 들어, A는 0번째, B는 1번째에 해당합니다.
// - frequency[ch - 'A']++ 는 해당 문자의 빈도를 1 증가시킵니다.

// int maxFrequency = -1;
// char mostFrequencyChar = '?';
// - maxFrequency 는 가장 많이 사용된 알파벳의 빈도를 저장합니다.
// 초기값은 -1로 설정하여 어떤 알파벳도 아직 고려되지 않았음을 나타냅니다.
// - mostFrequencyChar 는 가장 많이 사용된 알파벳을 저장합니다. 초기값은 '?'입니다.

// for (int i = 0; i < 26; i++) {
//      if (frequency[i] > maxFrequency) {
//          maxFrequency = frequency[i];
//          mostFrequencyChar = (char) (i + 'A');
//     } else if (frequency[i] == maxFrequency) {
//          mostFrequencyChar = '?';
//     }
// }
// - 이 for 루프는 알파벳 배열을 순회하며 가장 빈도가 높은 알파벳을 찾습니다.

// charAt(i) 메서드는 문자열에서 특정 위치에 있는 문자를 반환하기 때문에,
// 이 코드를 사용하여 입력된 단어에서 하나씩 문자를 꺼내어 처리할 수 있습니다.

// 문자열 배열과 정수형 배열의 차이점 -> ,length 뒤에 괄호의 유무