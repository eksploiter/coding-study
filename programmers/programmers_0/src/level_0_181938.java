//두 수의 연산값 비교하기
//연산 + 는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
//예를 들면 다음과 같습니다.
// -> 12 + 3 = 123
// -> 3 + 12 = 312
//양의 정수 a 와 b 가 주어졌을 때, a + b와 2 * a * b 중 더 큰 값을 return 하는 solution 값을 완성해주세요.

public class level_0_181938 {
    public int solution (int a, int b) {
        // 두 정수를 문자열로 이어 붙인 값을 구합니다.
        String ab = String.valueOf(a) + String.valueOf(b);
        int abInt = Integer.parseInt(ab);

        int A = 2 * a * b;

        // 두 값을 비교하여 더 큰 값을 반환합니다.
        if(abInt >= A) {
            return abInt;
        } else {
            return A;
        }
    }
}
