//str1과 str2의 길이가 다른 경우
//두 문자열을 교차하여 하나의 문자열로 합치는 작업을 처리하기 위해
//더 짧은 문자열의 길이만큼 반복한 후 남은 부분을 추가하는 방식으로 코드를 수정할 수 있습니다.

public class level_0_181942_1 {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        // 두 문자열 중 더 짧은 길이를 구함
        int minLength = Math.min(str1.length(), str2.length());

        // 더 짧은 문자열의 길이만큼 반복
        for (int i = 0; i < minLength; i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }

        //str1 이 더 길다면 남은 부분 추가
        if (str1.length() > minLength) {
            answer.append(str1.substring(minLength));
        }

        //str2 가 더 길다면 남은 부분 추가
        if (str2.length() > minLength) {
            answer.append(str2.substring(minLength));
        }

        //최종 문자열 반환
        return answer.toString();
    }
}


// 두 문자열 중 더 짧은 길이 구하기
// int minLength = Math.min(str1.length(), str2.length());
// - 'Math.min' 메서드를 사용하여 'str1' 과 'str2' 중 더 짧은 문자열의 길이를 'minLength' 변수에 저장합니다.