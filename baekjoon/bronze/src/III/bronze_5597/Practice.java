package III.bronze_5597;

import java.util.Scanner;

public class Practice {
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