// 단어의 개수
// 영어 대소문자 공백으로 이루어진 문자열이 존재한다. 이 문자열에는 몇 개의 단어가 있을까?
// 이를 구하는 프로그램을 작성하시오.
// 단, 한 단어가 등장하면 등장한 횟수만큼 모두 세어야 한다.

package II.bronze_1152;

import java.util.Scanner;

public class Bronze_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine().trim(); // trim() 은 양 끝의 공백을 제거한다.

        if (words.isEmpty()) {
            System.out.println(0); // 아무것도 적지 않았을 때
        } else {
            String[] wordsArray = words.split("\\s+");
            // String[] wordsArray = words.split(" "); // 문장의 공백이므로 단순 스페이스 공백으로 표현해도 정답이다.
            // 이 부분은 문자열을 분리하는 역할을 합니다.
            // split() 메서드는 특정 구분자를 기준으로 문자열을 나누어 배열로 반환하는 자바의 내장 메서드입니다.
            // \\s+ 는 정규표현식 입니다. 공백 문자를 의미하는 정규표현식입니다.
            // 여기서 공백 문자는 단순히 스페이스 외에도 탭, 줄바꿈, 캐리지 리턴 등을 포합합니다.
            // + 는 1개 이상의 연속된 공백 문자를 의미합니다. 즉, 공백 문자가 하나 이상일 경우에도 이를 하나의 구분자로 취급하여 분리합니다.
            System.out.println(wordsArray.length); // <- 배열이므로 뒤에 ()가 붙지 않는다.
        }
    }
}


// 내 풀이 for 문 사용 -> 정답은 맞긴 하나 문제와의 취지와 달라서 틀림.
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String words = scanner.nextLine();
//        int count = 0;
//
//        for (int i = 1; i < words.length() - 1; i++) {
//            char ch = words.charAt(i);
//            if (ch == ' ') {
//                count++;
//            }
//        }
//
//        System.out.println(count + 1);
//    }
//}

// 작성한 코드에서 발생하는 문제는 공백을 포함한 문자열의 첫 번째와 마지막 문자를 제외한 채로 단어 개수를 세려고 하기 때문입니다.
// 하지만 문제의 조건에서는 문자열이 공백으로 시작하거나 끝날 수 있으므로 첫 번째와 마지막 문자를 고려하지 않는 로직이 잘못된 것입니다.
// 코드에서 for 루프가 문자열의 첫 번째 문자와 마지막 문자를 제외한 부분만 검사하고 있기 때문에,
// 문자열이 공백으로 시작하거나 끝날 때 단어의 개수를 올바르게 세지 못합니다.
// 수정된 코드는 공백을 기준으로 문자열을 분리한 후, 빈 문자열을 제외한 단어의 개수를 세는 방식으로 해결할 수 있습니다.
// 이를 위해 split() 메서드를 사용하면 공백을 기준으로 문자열을 나누고, 이를 통해 단어의 개수를 정확히 셀 수 있습니다.
