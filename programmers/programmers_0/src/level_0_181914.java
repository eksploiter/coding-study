//음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
//이 사실을 이용하여 음이 아닌 정수가 문자열 number 로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.

public class level_0_181914 {
    public int solution (String number){
        int answer = 0;

        //문자열의 각 문자를 숫자로 변환하여 합을 구합니다.
        for (int i = 0; i < number.length(); i++) {
            answer += Character.getNumericValue(number.charAt(i)); //어려우니 정확히 알아내기
        }

        //합을 9로 나눈 나머지를 반환합니다.
        return answer % 9; //ctrl+shift+enter 중간에 있고 ; 없는 상황, 바로 생성
    }
}


// answer += Character.getNumericValue(number.charAt(i)); -> 공부 내용
// 이 코드는 Java 에서 문자열 'number' 의 각 문자를 숫자로 변환하여 'answer' 변수에 더하는 과정을 나타냅니다. 세세하게 설명.

// 1. 'number.chatAt(i)':
//      - 'number' 는 문자열(String)입니다.
//      - 'chatAt(i) 메서드는 문자열의 'i' 번째 문자를 반환합니다.
//      - 예를들어, 'number' 가 "12345" 이고 'i' 가 2라면, 'number.charAt(i)' 는 '3' 을 반환합니다. (0번째, 1번째, 2번째 ...)

// 2. 'Character.getNumericValue()':
//      - 'Character' 클래스는 문자에 대한 다양한 유틸리티 메서드를 제공하는 Java 의 표준 클래스 입니다.
//      - 'getNumericValue(char ch)' 메서드 문자를 숫자로 변환합니다.
//      - 예를 들어, 'Character.getNumericValue('3')' 는 3을 반환합니다.
//      - 이 메서드는 숫자 문자를 해당 정수 값으로 변환합니다. 숫자가 아닌 문자에 대해서는 음수를 반환할 수 있습니다.

// 3. 'answer += ...':
//      - 'answer' 는 정수형 변수 (int) 입니다.
//      - '+=" 연산자는 'answer = answer + ...' 와 같은 의미로, 'answer' 에 값을 더하고 그 결과를 다시 'answer' 에 저장합니다..
//      - 따라서, 'answer += Character.getNumericValue(number.charAt(i));' 는 'answer' 에 'number' 의 'i' 번때 문자를 숫자를 변환한 값을 더하는 것입니다.

// 종합적으로 이 코드를 설명하면. 'number' 문자열의 'i' 반째 문자를 숫자로 변환하여 'answer' 에 더하는 작업을 작업을 수행하는 것입니다.
// 예를 들어, 'number' 가 "12345"이고 'i' 가 2라면, 이 코드가 실행된 후 'answer' 에 3이 더해집니다.

// 이 코드를 반복문과 함께 사용하면 문자열의 모든 숫자를 더할 수 있습니다. 예를 들어:

// String number = "12345";
// int answer = 0;

// for (int i = 0; i < number.length(); i++) {
//      answer += Character.getNumericValue(number.charAt(i));
// }

// System.out.println(answer); // 출력: 15