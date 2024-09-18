package II;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();

        int[] positions = new int[26];
        for (int i = 0; i < 26; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i< S.length(); i++) {
            char ch = S.charAt(i);
            int index = ch - 'a';

            // 처음 등장한 경우에만 위치 저장
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}

// 코드 설명
// 1. positions 배열은 각 알파벳(a~z)의 처음 등장하는 위치를 저장하며, 처음에는 모두 -1로 표기합니다.
// 2. 문자열 S를 순회하면서 각 알파벳의 인덱스를 계산하여 position 배열에 저장합니다. 이때 처음 등장하는 위치만 저장합니다.
// 3. 마지막으로 positions 배열을 출력하여 각 알파벳의 등장 위치를 출력합니다.

// char ch = 'c';
// int index = ch - 'a'; // 'c' 의 아스키 값(99) - 'a'의 아스키 값(97) = 2