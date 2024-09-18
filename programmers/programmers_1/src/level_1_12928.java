//약수의 합
//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution 을 완성해주세요.

public class level_1_12928 {
    public int solution (int n) {
        int answer = 0;

        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
