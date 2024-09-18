// 평균
// 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
// 일단 세준이는 다기 점수 중에 최댓값을 골랐다. 이 값을 M 이라고 한다.
// 그리고 나서 모든 점수를 점수/M*100 으로 고쳤다.
// 예를 들어, 세준이의 최고점이 70이고, 수학 점수가 50이었으면 수학 점수는 50/70*100이 되어 71.43점이 된다.

// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

package I.bronze_1546;

import java.util.Scanner;

public class Bronze_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        int M = scores[0];
        for (int i = 1; i < N; i++) {
            if (scores[i] > M) {
                M = scores[i];
            }
        }

        double total = 0;
        for (int i = 0; i < N; i++) {
            total += ((double) scores[i] / M) * 100;
            // 계산 순서가 애매한 것 같으면 무조건 괄호 처리부터!
        }
        double average =  total / N;
        System.out.println(average);
    }
}
