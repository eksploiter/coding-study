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

//public class Test {
//    public static void main(String[] args) {
//        // 스캐너를 통해 입력을 받습니다.
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//
//        // 총 걸리는 시간을 저장할 변수
//        int totalTime = 0;
//
//        // 입력된 단어의 각 문자에 대해
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//
//            // 각 알파벳에 맞는 시간을 계산합니다.
//            if (c >= 'A' && c <= 'C') {
//                totalTime += 3;
//            } else if (c >= 'D' && c <= 'F') {
//                totalTime += 4;
//            } else if (c >= 'G' && c <= 'I') {
//                totalTime += 5;
//            } else if (c >= 'J' && c <= 'L') {
//                totalTime += 6;
//            } else if (c >= 'M' && c <= 'O') {
//                totalTime += 7;
//            } else if (c >= 'P' && c <= 'S') {
//                totalTime += 8;
//            } else if (c >= 'T' && c <= 'V') {
//                totalTime += 9;
//            } else if (c >= 'W' && c <= 'Z') {
//                totalTime += 10;
//            }
//        }
//
//        // 총 걸리는 시간을 출력합니다.
//        System.out.println(totalTime);
//    }
//}

import java.util.Scanner;

//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        int count = 0;
//
//        for (int i = 0; i < N; i++) {
//            int num = scanner.nextInt();
//            if (isPrime(num)) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
//
//        scanner.close();
//    }
//
//    // 소수를 판별하는 메서드
//    public static boolean isPrime(int num) {
//        if (num < 2) { // 2보다 작은 수는 소수가 아님
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) { // 제곱근까지 확인
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num < 2) { // 2보다 작은 수는 소수가 아님
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // 제곱근까지 확인
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
