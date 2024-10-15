package III;

//import java.util.Scanner;
//import java.util.ArrayList;
//
//
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // N과 K 입력 받기
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//
//        // N의 약수를 저장할 리스트
//        ArrayList<Integer> divisors = new ArrayList<>();
//
//        // 1부터 N까지 돌면서 약수를 구한다
//        for (int i = 1; i <= N; i++) {
//            if (N % i == 0) {
//                divisors.add(i); // 약수를 리스트에 추가
//            }
//        }
//
//        // 약수의 개수가 K보다 적으면 0을 출력
//        if (divisors.size() < K) {
//            System.out.println(0);
//        } else {
//            // K번째 약수를 출력 (리스트는 0부터 시작하므로 K-1 인덱스)
//            System.out.println(divisors.get(K - 1));
//        }
//
//        sc.close();
//    }
//}

//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        String c = scanner.nextLine();
//
//        System.out.println(a + "\n" + b + "\n" + c);
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // 입력이 존재할 때까지 계속 출력
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            System.out.println(line);
//        }
//
//        scanner.close();
//    }
//}

//scanner.hasNextLine()은 입력이 더 있는지 확인하는 메서드로, 입력이 남아 있는 동안 while 루프가 반복됩니다.

//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int T = scanner.nextInt(); // 테스트 케이스 개수 입력받음
//
//        for (int i = 0; i < T; i++) {
//            int C = scanner.nextInt(); // 각 테스트 케이스의 거스름돈 C
//            int quarters = C / 25; // 쿼터 계산 (25센트)
//            C %= 25; // 나머지 거스름돈
//            int dimes = C / 10; // 다임 계산 (10센트)
//            C %= 10; // 나머지 거스름돈
//            int nickels = C / 5; // 니켈 계산 (5센트)
//            C %= 5; // 나머지 거스름돈
//            int pennies = C; // 페니 계산 (1센트)
//
//            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
//        }
//
//        scanner.close();
//    }
//}

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(executeCount(n));
        System.out.println(2);
    }

    public static long executeCount(int n) {
        long sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum += i;
        }
        return sum;
    }
}
