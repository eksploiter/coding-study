// 색종이
// 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
// 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
// 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

package V.silver_2563;

import java.util.Scanner;

public class Silver_2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 100*100 크기의 도화지
        boolean[][] paper = new boolean[100][100];
        // 이 2차원 배열은 boolean 타입으로, 각 위치에 색종이가 붙었는지 여부를 기록한다.
        // 처음레는 모든 값이 false 로 초기화되어 있다.

        // 색종이의 수 입력
        int n = scanner.nextInt();

        for (int i  = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 색종이의 실제 범위를 정확히 표현하는 방법이다.
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                    // 색종이가 차지하는 10*10 영역을 true 로 설정한다.
                    // 이는 색종이가 붙어있음을 나타낸다.
                }
            }
        }

        // 검은 영억의 넓이 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);

        scanner.close();
    }
}

// 이 코드는 색종이가 겹치는 부분을 따로 감지하거나 계산에서 빼지 않고, 자동으로 처리되게 되어있다.
// 그 이유는 boolean[][] paper 배열이 겹침을 자연스럽게 처리하기 때문이야.

// 겹치는 부분 처리 방식
// - 색종이가 붙는 위치를 paper[j][k] = true; 로 설정할 때, 이미 true 인 영역에 다시 true 를 할당해도 값은 변하지 않는다.
// 즉, 배열의 값이 이미 true 인 상태에서는 다시 true 로 덮어써도 변동이 없다.
// - 이로 인해 겹치는 부분은 중복해서 카운트되지 않는다. 결국, 겹친 영역은 한 번만 true 로 표시되며,
// 면적을 계산할 때도 한 번만 포함된다.
