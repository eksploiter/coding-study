// 시험 감독
// 총 N 개의 시험장이 있고, 각각의 시험장마다 응시자들이 있다.
// i번 시험장에 있는 응시자의 수는 Ai 명이다.

// 감독관은 총감독관과 부감독관으로 두 종류가 있다.
// 총감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 B 명이고,
// 부감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 C 명이다.

// 각각의 시험장에 총감독광은 오직 1명만 있어야 하고, 부감독관은 여러 명 있어도 된다.
// 각 시험장마다 응시생들을 모두 감시해야 한다.
// 이때, 필요한 감독관의 수의 최솟값을 구하는 프로그램을 작성하시오.

package II.bronze_13458;

import java.util.Scanner;

public class Bronze_13458 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시험장의 개수 N을 받음
        int N = scanner.nextInt();

        // 각 시험장의 응시자 수를 저장할 배열
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 총 감독관이 감시할 수 있는 응시자 수 B와 부감독관이 감시할 수 있는 응시자 수 C
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // 필요한 감독관 수의 최솟값을 저장할 변수
        long totalSupervisors = 0;

        for (int i= 0 ; i < N; i++) {
            // 먼저 총감독관을 배치
            totalSupervisors++;

            // 남은 응시자 수 계산
            int remaining = A[i] - B;

            // 남은 응시자가 있다면 부감독관을 배치
            if (remaining > 0) {
                // 부감독관이 필요한 수는 남은 응시자를 C로 나눈 몫
                totalSupervisors += (remaining + C - 1) / C;
            }
        }

        System.out.println(totalSupervisors);
        scanner.close();
    }
}
