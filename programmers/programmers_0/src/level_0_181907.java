//문자열 앞의 n 글자
//문자열 my_string 과 정수 n 이 매개변수로 주어질 때, my_string 의 앞의 n 글자로 이루어진 문자열을 return 하는 solution 함수를 작성해주세요.

public class level_0_181907 {
    public String solution(String my_string, int n) {
        //my_string 의 앞의 n 글자를 추출하여 반환합니다.
        return my_string.substring(0, n);
    }
}

// 메서드 선언
// public String solution(String my_string, int n) {
// - 'public': 접근 제어자입니다. 이 메서드는 어디서든 접근할 수 있습니다.
// - 'String': 반환 타입입니다. 이 메서드는 문자열을 반환합니다.
// - 'solution': 메서드의 이름입니다. 이 이름은 임의로 지정할 수 있습니다.
// - 'String my_string': 첫 번째 매개변수입니다. 입력 문자열을 나타냅니다.
// - 'int n': 두 번째 매개변수 입니다. 추출한 앞의 글자 수를 나타냅니다.

// 문자열 추출 및 반환
// return my_string.substring(0, n);
// - 'my_string': 입력 문자열입니다.
// - 'substring(0, n): 'substring' 메서드는 문자열의 부분 문자열을 반환합니다.
// - 여기서 '(0, n)'은 문자열의 시작 인덱스(포함)부터 끝 인덱스(제외) 까지의 부분 문자열을 의미합니다.
// - 즉, 문자열의 앞에서부터 'n' 개의 문자를 추출합니다.
// - 'return': 추출한 부분 문자열을 반환합니다.


// 또 다른 문제풀이
//class Solution {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        for (int i = 0; i < n; i++) {
//            answer += String.valueOf(my_string.charAt(i));
//        }
//        return answer;
//    }
//}