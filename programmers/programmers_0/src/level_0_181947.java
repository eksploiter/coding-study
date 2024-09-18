//두 정수 a, b 가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해보세요.
// a + b = c

import java.util.Scanner;

public class level_0_181947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        System.out.println(a + " + " + b + " = " + c);

        sc.close();
    }
}
