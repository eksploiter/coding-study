//공배수
//정수 number 와 n, m 이 주어집니다. number 가 n 의 배수이면서 m 의 배수이면 1을
//아니라면 0을 return 하도록 solution 함수를 완성해주세요.

public class level_0_181936 {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if ((number % n == 0) && (number % m == 0)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
