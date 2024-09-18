//더 크게 합치기
//연산 + 는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
//예를 들면 다음과 같습니다.
// -> 12 + 3 = 123
// -> 3 + 12 = 312
//더 큰 값을 return 하는 solution 함수를 완성해주세요.

public class level_0_181939 {
    public int solution(int a, int b) {
        // 두 정수를 문자열로 반환하여 이어 붙인 값을 구합니다.
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        // 두 문자열을 정수로 반환하여 비교합니다.
        int abInt = Integer.parseInt(ab);
        int baInt = Integer.parseInt(ba);

        // 더 큰 값을 반환합니다. 같으면 abInt 를 반환합니다.
        if (abInt >= baInt) {
            return abInt;
        } else {
            return baInt;
        }
    }
}
