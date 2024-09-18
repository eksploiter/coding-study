package V.bronze_3003;

import java.util.Scanner;

public class Bronze_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correct = {1, 1, 2, 2, 2, 8};

        int[] found = new int[6];
        for (int i = 0; i < found.length; i++) {
            found[i] = scanner.nextInt();
            // 계속 실수한다
            // found = scanner.nextInt()가 아니다.
            // found[i] = scanner.nextInt()
        }

        for (int i = 0; i < 6; i++) {
            System.out.print((correct[i] - found[i]) + " ");
        }
    }
}
