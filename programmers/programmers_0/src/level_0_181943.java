//문자열 겹쳐쓰기
//문자열 my_string, overwrite_string 과 정수 s 가 주어집니다.
//문자열 my_string 의 인덱스 s 부터 overwrite_string 의 길이만큼
//문자열 overwrite_string 으로 바꾼 문자열을 return 하는 solution 함수를 작성해주세요.

public class level_0_181943 {
    public String solution (String my_string, String overwrite_string, int s) {
        //my_string 의 앞부분 (s 이전 부분)
        String frontPart = my_string.substring(0, s);

        //my_string 의 뒷부분 (overwrite_string 의 길이 이후 부분)
        String backPart = my_string.substring(s + overwrite_string.length());

        //앞부분 + overwrite_string + 뒷부분을 합쳐 새로운 문자열 생성
        String answer = frontPart + overwrite_string + backPart;

        return answer;
    }
}
