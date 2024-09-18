//커피 심부름
//팀의 막내인 철수는 아메리카노와 카페 라떼만 판매하는 카페에서 팀원들의 커피를 사려고 합니다.
//아메리카노롸 카페 라떼의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원 입니다.
//각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로 통일하고
//"아무거나"를 적은 팀원은 차가운 아메리카노로 통일하기로 했습니다.
//각 직원이 적은 메뉴가 문자열 배열 order 로 주어질 떄, 카페에서 결제하게 될 금액을 return 하느 solution 함수를 작성해주세요.
//order 의 원소는 아래의 것들만 들어오고, 각각의 의미는 다움과 같습니다.

//          order 의 원소           |           의미
// "ice americano", "americano ice"       차가운 아메리카노
// "hpt americano", "americano hot"       따뜻한 아메리카노
// "ice cafelatte", "cafelatte ice"       차가운 카페라떼
// "hot cafelatte", "cafelatte hot"       따뜻한 카페라떼
// "americano"                              아메리카노
// "cafelatte"                               카페라떼
// "anyting"                                 아무거나

public class level_0_181837 {
    public int solution(String[] order) {
        int answer = 0;

        for (String item : order) {
            if (item.contains("americano") || item.equals("anything")) {
                //"americano" 또는 "anything" (anything 은 차가운 아메리카노로 처리)
                answer += 4500;
            } else if (item.contains("cafelatte")) {
                //"cafe latte"
                answer += 5000;
            }
        }

        return answer;
    }
}


// 메서드 선언
// public int solution (String[] order) {
// - 문자열 배열 'order' 를 매개변수로 받아 정수형 결과를 반환하는
// - 'solution' 이라는 공용 메서드를 선업합니다.

// 변수 초기화
// int answer = 0;
// - 정수형 변수 'answer' 를 0으로 초기화합니다.
// - 이 변수는 주문의 총 가격을 계산할 때 사용됩니다.

// 주문 항목 조회
// for (String item : order) {
// - 'for-each' 루프를 사용하여 'order' 배열의 각 항목을 순회합니다.
// - 배열의 각 항목은 문자열 'item' 으로 처리됩니다.

// 조건 검사 및 가격 더하기
// if (item.contains("americano") || item.equals("anything")) {
//      answer += 4500;
// } else if (item.contains("cafelatte")) {
//      answer += 5000;
// }
// - 첫 번째 'if' 조건문은 'item' 문자열에
// - "americano" 가 포함되어 있거나 'item' 이
// - "anything" 과 같으면, 'answer' 에 4500을 더합니다.
// - "anything" 은 차가운 아메리카노로 처리됩니다.
// - 두 번째 'else if' 조건문은 'item' 문자열에 "caffelatte"가 포함되어있으면
// - 'answer' 에 5000을 더합니다.
