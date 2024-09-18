//두 수의 나눗셈
//정수 num1과 num2가 매개변수로 주어질 때. num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 환성해주세요.

//public class level_0_120806 {
//    public int solution(int num1, int num2) {
//        //num1과 num2로 나눈 값을 저장합니다.
//        double a = (double) num1 / num2;
//
//        //결과에 1000을 곱합니다.
//        double b = a * 1000;
//
//        //정수 부분을 추출합니다.
//        int answer = (int) b;
//
//        return answer;
//    }
//}

public class level_0_120806 {
    public int solution (int num1, int num2) {
        //int answer = num1 / num2; -> 이렇게 하게 된다면 정수형만 반환하므로 double 을 사용해서 소수점까지 계산
        double a = (double) num1 / num2;

        double b = a * 1000;

        int answer = (int) b;

        return answer;
    }
}

// 정수 나눗셈을 소수점까지 계산하기 위한 변수 선언 및 초기화
// double a = (double) num1 / num2;
// - '(double) num1': 'num1'을 'double' 타입으로 형변환 합니다.
// - '/ num2': 'num2'와 나눗셈을 수행합니다. 'num1'이 'double' 타입으로 변환되었기 때문에 결과는 'double' 타입이 됩니다.
// - 'a': 나눗셈의 결과를 저장하는 'double' 타입의 변수입니다.

// 결과를 정수로 변환
// int answer = (int) b;
// - '(int) b': 'b'를 'int' 타입으로 형변환하여 소수점 이하를 버립니다.
// - 'answer': 최종 결과를 저장하는 'int' 타입의 변수입니다.

// 전체적인 흐름
// 1. 입력된 두 정수 'num1'과 'num2'를 소수점까지 계산하기 위해 'double' 로 나눗셈을 수행합니다.
// 2. 나눗셈 결과를 1000을 곱해 소수점 이하 3자리까지 확대합니다.
// 3. 확대된 결과를 'int' 로 변환하여 소수점 이하를 제거합니다.
// 4. 최종결과를 반환합니다.

// 개선된 코드
// public class level_0_120806 {
//    public int solution(int num1, int num2) {
//        double a = (double) num1 / num2;
//
//        int answer = (int) (a * 1000);
//
//        return answer;
//    }
//}