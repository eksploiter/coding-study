//조건 문자열
//문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

public class level_0_181934_if {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                answer = (n >= m) ? 1 : 0;
            } else if (eq.equals("!")) {
                answer = (n > m) ? 1 : 0;
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")) {
                answer = (n <= m) ? 1 : 0;
            } else if (eq.equals("!")) {
                answer = (n < m) ? 1 : 0;
            }
        }

        return answer;
    }
}
