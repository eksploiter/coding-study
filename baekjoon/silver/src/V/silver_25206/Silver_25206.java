// 너의 평점은
// 인하대학교 컴퓨터 공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야한다.
// 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 으이하지 않았다는 사실을 깨달았다.
// 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.

// 전공평점은 전공 과목별 (학점 x 과목평점)의 합을 학점의 총합으로 나눈 값이다.

// 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.

package V.silver_25206;

import java.util.Scanner;

public class Silver_25206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = new String[20];
        double totalScore = 0;  // (학점 × 과목평점)의 합
        double totalCredits = 0;  // 학점의 총합

        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();

            double numericGrade = 0;

            // 과목평점 계산
            switch (grade) {
                case "A+":
                    numericGrade = 4.5;
                    break;
                case "A0":
                    numericGrade = 4.0;
                    break;
                case "B+":
                    numericGrade = 3.5;
                    break;
                case "B0":
                    numericGrade = 3.0;
                    break;
                case "C+":
                    numericGrade = 2.5;
                    break;
                case "C0":
                    numericGrade = 2.0;
                    break;
                case "D+":
                    numericGrade = 1.5;
                    break;
                case "D0":
                    numericGrade = 1.0;
                    break;
                case "F":
                    numericGrade = 0.0;
                    break;
                case "P":
                    continue;  // P는 계산에서 제외
            }

            totalScore += credit * numericGrade;
            totalCredits += credit;
        }

        // 전공평점 계산 및 출력
        double majorGPA = totalScore / totalCredits;
        System.out.println(majorGPA);
        // System.out.printf("%.6f\n", majorGPA);
    }
}


// System.out.println(majorGPA);
// - 설명: println 은 단순히 변수의 값을 출력하고 마지맞에 줄바꿈을 추가합니다.
// - 출력 형식: 변수를 있는 그대로 출력합니다. 숫자형 변수라면 소수점 이하의 자릿수 제어 없이 출력합니다.

// System.out.printf("%.6f\n", majorGPA);
// - 설명: printf 는 포멧팅된 문자열을 출력할 수 있는 메서드입니다.
// "%.6f"는 소수점 이하 6자리 까지 출력하라는 의미입니다.
// - 출력형식: %.6f 는 소수점 이하 6자리까지 강제적으로 표시합니다.
// 만약 그 값이 그보자 적다면 0으로 채웁니다.

// 차이점 요약
// - println: 숫자를 소수점 이하 자릿수 제어 없이 그대로 출력합니다.
// - printf: 포멧을 사용해 소수점 이하 자릿수를 제어할 수 있으며, 고정된 형식으로 출력합니다.