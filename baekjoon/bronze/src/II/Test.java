package II;

import java.util.Scanner;

//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String S = scanner.nextLine();
//
//        int[] positions = new int[26];
//        for (int i = 0; i < 26; i++) {
//            positions[i] = -1;
//        }
//
//        for (int i = 0; i< S.length(); i++) {
//            char ch = S.charAt(i);
//            int index = ch - 'a';
//
//            // 처음 등장한 경우에만 위치 저장
//            if (positions[index] == -1) {
//                positions[index] = i;
//            }
//        }
//
//        for (int i = 0; i < 26; i++) {
//            System.out.print(positions[i] + " ");
//        }
//    }
//}

// 코드 설명
// 1. positions 배열은 각 알파벳(a~z)의 처음 등장하는 위치를 저장하며, 처음에는 모두 -1로 표기합니다.
// 2. 문자열 S를 순회하면서 각 알파벳의 인덱스를 계산하여 position 배열에 저장합니다. 이때 처음 등장하는 위치만 저장합니다.
// 3. 마지막으로 positions 배열을 출력하여 각 알파벳의 등장 위치를 출력합니다.

// char ch = 'c';
// int index = ch - 'a'; // 'c' 의 아스키 값(99) - 'a'의 아스키 값(97) = 2

import java.util.Scanner;

//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int T = scanner.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            int R = scanner.nextInt();
//            String S = scanner.next();
//
//            for (int j = 0; j < S.length(); j++) {
//                char ch = S.charAt(j);
//                for (int k = 0; k < R; k++) {
//                    System.out.print(ch);
//                }
//            }
//        }
//    }
//}

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

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine().trim();  // 양 끝의 공백 제거

        if (words.isEmpty()) {
            System.out.println(0);  // 입력이 공백만 있는 경우
        } else {
            String[] wordArray = words.split("\\s+");  // 공백을 기준으로 단어 나누기
            System.out.println(wordArray.length);  // 단어의 개수 출력
        }
    }
}
