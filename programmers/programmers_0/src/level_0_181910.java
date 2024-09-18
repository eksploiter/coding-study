//문자열 my_string 과 정수 n 이 매개변수로 주어질 때,
//my_string 의 뒤의 n 글자로 이루어진 문자열을 return 하는 solution 함수를 작성해주세요.

//public class level_0_181910 {
//    public String solution(String my_string, int n) {
//        String answer = "";
//
//        answer = my_string.substring(my_string.length() - n);
//
//        return answer;
//    }
//}


public class level_0_181910 {
    public String solution(String my_string, int n){
        String answer = "";

        answer = my_string.substring(my_string.length() - n);

        return answer;
    }
}