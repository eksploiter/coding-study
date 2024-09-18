//머쓱이보다 키 큰 사람
//머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
// 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
// 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.

//public class level_0_120585 {
//    public int solution(int[] array, int height){
//        int answer = 0;
//
//        //배열을 순회하면서 각 요소를 확인합니다.
//        for (int i = 0; i < array.length; i++) {
//            //현재 요소가 머쓱이의 키보다 크다면 카운터를 증가시킵니다.
//            if(array[i] > height) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//}

public class level_0_120585 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer ++;
            }
        }

        return answer;
    }
}