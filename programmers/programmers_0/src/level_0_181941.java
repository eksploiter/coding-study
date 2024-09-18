//문자들이 담겨있는 배열 arr 가 주어집니다. arr 의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해주세요.

//public class level_0_181941 {
//    public String solution (String[] arr) {
//        String answer = "";
//        return String.join("", arr);
//    }
//}

public class level_0_181941 {
    public String solution(String[] arr) {
        // StringBuilder 객체를 생성하여 효율적으로 문자열을 이어 붙입니다.
        StringBuilder sb = new StringBuilder();

        // 배열의 모든 원소를 순회하면서 StringBuilder에 추가합니다.
        for (String s : arr) {
            sb.append(s);
        }

        // StringBuilder에 누적된 문자열을 최종적으로 반환합니다.
        return sb.toString();
    }
}