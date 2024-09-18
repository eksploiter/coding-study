//자릿수 더하기
//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어주세요.

public class level_1_12931 {
    public int solution(int n) {
        int answer = 0;

        // 정수형을 문자열로 변환
        String a = String.valueOf(n);

        for (int i = 0; i <= a.length(); i++) {
            //문자형을 정수형으로 변환
            answer += Character.getNumericValue(a.charAt(i));
        }

        //각 자릿수의 합을 출력
        System.out.println(answer);

        return answer;
    }

//    public class void main(String[] args) {
//        Solution sol = new Solution();
//
//        System.out.println("Sum of digits: " + sol.solution(123));
//    }
}

// 이 부분 잘 알아보기!
