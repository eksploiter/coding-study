//문자열 my_string 과 정수 k 가 주어질 때, my_string 을 k 번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

public class level_0_181940 {
    public String solution (String my_string, int k) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < k; i++) {
            answer.append(my_string);
        }

        return answer.toString();
    }
}


// 메서드 선언
// public String solution(String my_string, int k) {
// - 문자열 'my_string' 과 정수 'k' 를 매개변수로 받아 문자열을 반환하는
// - 'solution' 이라는 공용 메서드를 선언합니다.

// StringBuilder 객체 생성
// StringBuilder answer = new StringBuilder();
// - 'StringBuilder' 객체 'answer' 를 생성합니다.
// - 'StringBuilder' 는 문자열을 효울적으로 조작할 수 있는 클래스로,
// - 문자열을 여러 번 이어 붙이는 작업에서 성능이 좋습니다.

// 반복문을 이용한 문자열 붙이기
// for (int i = 0; i < k; i++) {
//      answer.append(my_string);
// }
// - 'for' 루프를 사용하여 'k'번 반복합니다.
// - 루프는 'i = 0' 에서 시작하여 'i < k' 일 때까지 반복됩니다.
// - 루프의 각 반복마다 'answer' 에 'my_string' 을 이어붙입니다.
// - 'append' 메서드를 사용하여 'my_string' 을 'answer' 에 추가합니다.

// 결과 반환
// return answer.toString();
// 모든 반복이 끝난 후, 'answer' 객체에 저장된 문자열을
// 'toString' 메서드를 사용하여 일반 문자열로 변환한 후 반환합니다.

// 전체적인 흐름
// - 이 코드는 주어진 문자열 'my_string'을 'k' 번 반벅하여 이어 붙인 결과를 반환하는 역할을 합니다.
// - 'StringBuilder' 를 사용하여 문자열을 효울적으로 이어 붙이며, 최종적으로 완성된 문자열을 반환합니다.
// - 이는 문자열을 여러 번 이어 붙이는 작업에서
// - 'StringBuilder' 가 'String' 객체보다 성능이 뛰어나기 때문에 사용됩니다.