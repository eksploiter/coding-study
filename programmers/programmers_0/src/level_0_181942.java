//길이가 같은 두 문자열 str1과 str2가 주어집니다.
//두 문자열의 각 문자가 앞에서 부터 서로 번갈아가며 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해주세요.

public class level_0_181942 {
    public String solution(String str1, String str2) {
        //StringBuilder 를 사용하여 결과 문자열을 생성
        StringBuilder answer = new StringBuilder();

        //두 문자열의 길이는 같으므로 하나의 반복문으로 처리 가능
        for (int i = 0; i < str1.length(); i++) {
            //str1 의 i 번째 문자 추가
            answer.append(str1.charAt(i));
            //str2 의 i 번째 문자 추가
            answer.append(str2.charAt(i));
        }

        //최종 문자열 반환
        return answer.toString();
    }
}

// 메서드 선언
// public String solution(String str1, String str2) {
// - 문자열 'str1' 과 'str2' 를 매개변수로 반아 문자열을 반환하는 'solution; 이라는 공용 메서드를 선언합니다.

// StringBuilder 객체 생성
// StringBuilder answer = new StringBuilder();
// - 'StringBuilder' 객체 'answer' 를 생성합니다.
// - 'StringBuilder' 는 문자열을 효율적으로 조작할 수 있는 클래스로,
// - 문자열을 여러 번 이어 붙이는 작업에서 성능이 좋습니다.

// 반복문을 이용한 문자열 병합
// for (int i = 0; i < str1.length(); i++) {
//      answer.append(str1,charAt(i));
//      answer.append(str2,charAt(i));
// }
// - 'for' 루프를 사용하여 'str1' 의 길이만큼 반복합니다.
// - 루프는 'i = 0'에서 시작하여 'i < str1.length()' 일 때까지 반복됩니다.
// - 'str1' 과 'str2' 의 길이가 같으므로, 'str1.length()' 만큼 반복하면 됩니다.
// - 루프의 각 반복마다 'answer' 에 'str1' 의 'i' 번째 문자와 'str2' 의 'i' 번째 문자를 차례로 추가합니다.
// - 'answer.append' 메서드를 사용하여 추출한 문자를 'answer' 에 추가합니다.

// 결과 문자열 반환
// return answer.toString();
// 모든 반복이 끝난 후, 'answer' 객체에 저장된 문자열을 'toString' 메서드를 사용하여 일반 문자열로 변환한 후 반환합니다.