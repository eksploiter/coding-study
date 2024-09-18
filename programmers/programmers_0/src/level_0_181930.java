//주사위 게임 2
//1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c 라고 했을 때 언는 점수는 다음과 같습니다.
// - 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
// - 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면
// => (a + b + c) x (a^2 + b^2 + c^2) 점을 얻습니다.
// - 세 숫자가 모두 같다면
// => (a + b + c) x (a^2 + b^2 + c^2) x (a^3 + b^3 + c^3) 점을 얻습니다.
//세 정수 a, b, c 가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해주세요.

public class level_0_181930 {
    public int solution (int a, int b, int c) {
        int answer = 0;

        if (a != b && b != c && c != a) {
            answer = a + b + c;
        } else if (a == b && b != c) {
            answer = (a + b + c) * (a^2 + b^2 + c^2);
        } else if (b == c && c != a) {
            answer = (a + b + c) * (a^2 + b^2 + c^2);
        } else if (a == c && a != b) {
            answer = (a + b + c) * (a^2 + b^2 + c^2);
        } else {
            answer = (a + b + c) * (a^2 + b^2 + c^2) * (a^3 + b^3 + c^3);
        }

        return answer;
    }
}
