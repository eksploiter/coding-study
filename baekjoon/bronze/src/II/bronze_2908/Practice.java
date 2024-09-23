// 상수
//

package II.bronze_2908;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        int reverseA = reverseNumber(A);
        int reverseB = reverseNumber(B);
        int C = Math.max(reverseA, reverseB);

        System.out.println(C);

        scanner.close();
    }

    public static int reverseNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        return Integer.parseInt((sb.reverse().toString()));
    }
}
