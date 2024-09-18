//369 게임
//머쓱이는 친구들과 369 게임을 하고 있습니다. 369 게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 ,대신 3, 6, 9의 개수 만큼
//박수를 치는 게임입니다. 머쓱이가 말해야하는 숫자 order 가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

//public class level_0_120891_369 {
//    public int solution (int order) {
//        int answer = 0;
//        String strOrder = String.valueOf(order); //order 를 문자열로 변환합니다.
//
//        for (int i = 0; i < strOrder.length(); i++) {
//            char ch = strOrder.charAt(i);
//            if(ch == '3' || ch == '6' || ch == '9') {
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//}


// String strOrder = String.value(order);
// - 'order' 정수를 문자열로 변환하여 'strOrder' 변수에 저장합니다.
// - 각 자리 숫자를 하나씩 검사하기 위해 문자열로 변환이 필요합니다.

// for (int i = 0; i < strOrder.length(); i++) {
//      char ch = strOrder.charAt(i);
// - 'for' 루프ㄹ를 사용하여 'strOrder' 문자열의 각 문자를 순회합니다.
// - 루프는 'i = 0' 에서 시작하여 'i < strOrder.length()'일 때까지 반복됩니다.
// - 'strOrder.charAt(i)'는 'strOrder' 문자열에서 'i' 번째 문자를 추출합니다.

// if (ch == '3' || ch == '6' || ch == '9') {
//      answer++;
//  }
// - 추출된 문자가 3, 6, 9 중 하나인 경우, 'answer' 를 1 증가시킵니다.

public class level_0_120891_369 {
    public int solution(int order) {
        int answer = 0;

        String strOrder = String.valueOf(order);

        for (int i = 0; i < strOrder.length(); i++) {
            char ch = strOrder.charAt(i);
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }

        return answer;
    }
}