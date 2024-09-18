// Bronze5

package V;

import java.util.Scanner;

//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int T = scanner.nextInt();
//        scanner.nextLine();  // 개행 문자 제거
//
//        for (int i = 0; i < T; i++) {
//            String word = scanner.nextLine();
//            if (word.length() > 0) {
//                // 첫 번째 글자 출력
//                System.out.print(word.charAt(0));
//                // 마지막 글자 출력 (단어의 길이가 1 이상인 경우)
//                if (word.length() > 1) {
//                    System.out.print(word.charAt(word.length() - 1));
//                }
//                System.out.println();  // 줄 바꿈
//            }
//        }
//        scanner.close();
//    }
//}


//import java.util.Scanner;
//
//public class FirstAndLastChar {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int T = scanner.nextInt(); // 테스트 케이스 개수 입력
//        scanner.nextLine(); // 개행 문자 제거
//
//        for (int i = 0; i < T; i++) {
//            String word = scanner.nextLine(); // 문자열 입력
//            // 첫 글자와 마지막 글자 출력
//            System.out.println("" + word.charAt(0) + word.charAt(word.length() - 1));
//        }
//
//        scanner.close();
//    }
//}


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == 0 && b == 0){
                break;
            }

            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
