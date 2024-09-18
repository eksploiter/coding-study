//대소문자 바꿔서 출력하기
//영어 알파벳으로 이루어진 문자열 str 이 주어집니다.
//각 알파벳을 대문자는 소문자로 소문자는 대문자로 반환해서 출력하는 코드를 작성해보세요.

import java.util.Scanner;

public class level_0_181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder result = new StringBuilder();

        //문자열의 각 문자에 대해 대소문자 변환
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append((Character.toUpperCase(ch)));
            }
        }

        // 변화노딘 문자열 출력
        System.out.println(result.toString());

        sc.close();
    }
}


// 패키지 및 클래스 선언
// import java.util.Scanner;
// public class solution {
// - 'java.util.Scanner' 를 임포트 하여 사용자 입력을 받을 수 있게 합니다.
// - 공용 클래스를 선업합니다.

// 메인 메서드 선언
// public static void main(String[] args) {
// - Java 프로그램의 진입점인 'main' 메서드를 선언합니다.

// Scanner 객체 생성 및 문자열 입력 받기
// Scanner sc = new Scanner(System.in);
// String str = sc.next();
// - 'Scanner' 객체 'sc' 를 생성하여 사용자로부터 입력을 받습니다.
// - 'sc.next()' 메서드를 사용하여 한 단어(공백 없이)를 입력받아 'str' 변수에 저장합니다.
// - 여기서 궁금할 수 있는 부분
// - 공백을 포함한 문장을 입력받고 싶다면?
// - 'sc.next()' 를 'sc.nextLine()' 으로 변경하면 된다.

// StringBuilder 객체 생성
// StringBuilder result = new StringBuilder();
// - 'StringBuilder' 객체 'result' 를 생성하여 변환된 문자열을 효울적으로 저장합니다.

// 대소문자 변환 반복문
// for (int i = 0; i < minLength(); i++) {
//      char ch = str.CharAt(i);
//      if (Character.isUpperCase(ch)) {
//          result.append(Character.toLowerCase(ch));
//      } else if (Character.isLowerCase(ch)) {
//          result.append(Character.toUpperCase(ch));
// }
// - 'for' 루프를 사용하여 문자열 'str' 의 각 문자를 순회합니다.
// - 'str.charAt(i)' 메서드를 사용하려 'i' 번째 문자를 가져와 'ch' 변수에 저장합니다.
// - 'Character.isUpperCase(ch)' 메서드를 사용하여 'ch' 가 대문자인지 확인합니다.
//      - 대문자인 경우, 'Character.toLowerCase(ch)' 메서드를 사용하여 소문자로 변환한 후 'result' 에 추가합니다.
// - 'Character.isLowerCase(ch)' 메서드를 사용하여 'ch' 가 소문자인지 확인합니다.
//      - 소문자인 경우, 'Character.toUpperCase(ch)' 메서드를 사용하여 대문자로 변환한 후 'result' 에 추가합니다.

// 변환된 문자열 출력
// System.out.println(result.toString());
// - 'result.toString()' 메서드를 사용하여
// - 'StringBuilder' 객체를 문자열로 변환한 후 출력합니다.

// Scanner 객체 닫기
// sc.close();
// - 'Scanner' 객체를 닫아 자원을 해제합니다.
