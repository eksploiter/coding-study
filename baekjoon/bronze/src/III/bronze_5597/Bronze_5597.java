// 과제 안 내신 분..?
// X대학 M 교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명 있는데,
// 학생 명부엔 각 학생별로 1번 부터 30번 까지 출석 번호가 붙어 있다.

// 교수임이 내준 특별 과제를 28명이 제출했는데,
// 그 중에서 제출 안 한 학생 2명의 출석 번호를 구하는 프로그램을 작성하세요.

// 입력은 총 28줄로 각 제출자(학생)의 출석 번호 n(1 <= n <= 30)가 한 줄에 하나씩 주어진다.
// 출석번호에 중복은 없다.

package III.bronze_5597;

import java.util.Scanner;

public class Bronze_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 30명의 학생 출석 번호를 담은 배열 (0번 인덱스는 사용하지 않음)
        boolean[] submitted = new boolean[31];

        // 제출한 학생의 번호를 입력받아 기록
        for (int i = 0; i < 28; i++) {
            int studentNumber = scanner.nextInt();
            submitted[studentNumber] = true;
            // 제출한 학생의 번호를 true 로 표시
        }

        // 제출하지 않은 학생 번호 찾기
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) { // 해당 번호가 false 인 경우, 출력
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
