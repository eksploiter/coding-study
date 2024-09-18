//문자열 반복해서 출력하기
//문자열 str 과 정수 n 이 주어집니다.
//str 이 n 번 반복된 문자여를 만들어 출력하는 코드를 작성해보세요.

//public class level_0_181950 {
//    public String solution(String str, int n) {
//
//    }
//}

import java.util.Scanner;

//public class level_0_181950 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int n = sc.nextInt();
//
//        // 반복문을 사용하여 문자열을 n 번 반복하여 출력
//        for (int i = 0; i < n; i++) {
//            System.out.print(str);
//        }
//
//        //줄 바꿈을 추가하여 출력 후 깔끔하게 보이도록 함
//        System.out.println();
//
//        sc.close();
//    }
//}

public class level_0_181950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(str);
        }

        System.out.println();

        sc.close();
    }
}
