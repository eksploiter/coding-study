// 너의 평점은
// 인하대학교 컴퓨터 공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야한다.
// 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 으이하지 않았다는 사실을 깨달았다.
// 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.

// 전공평점은 전공 과목별 (학점 x 과목평점)의 합을 학점의 총합으로 나눈 값이다.

// 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.

package V.silver_25206;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subject = new String[20];
        double totalScore = 0;
        double totalCredit = 0;

        for (int i = 0; i < subject.length; i++) {
            subject[i] = scanner.next();
            double credit = scanner.nextInt();
            String grade = scanner.next();

            double numericGrade = 0;

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
            totalCredit += credit;
        }

        double average = totalScore / totalCredit;
        System.out.printf("%.6f\n", average);
    }
}
