//정수 리스트 num_list 가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
//홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
//두 값이 갑ㅌ을 경우 그 값을 return 합니다.

public class level_0_181887 {
    public int solution(int[] num_list) {
        int oddSum = 0; //홀수 번째 원소들의 합
        int evenSum = 0; //짝수 번째 원소들의 합

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 1) {
                //인덱스 i + 1 이 홀수인 경우 (홀수 번째)
                oddSum += num_list[i];
            } else {
                //인덱스 i + 1 이 짝수인 경우 (짝수 번째)
                evenSum += num_list[i];
            }
        }

        //홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 반환
        return Math.max(oddSum, evenSum);
    }

    public static void main(String[] args) {
        level_0_181887 solution = new level_0_181887();
        int result = solution.solution(new int[] {4, 2, 6, 1, 7, 6});
        System.out.println(result);
    }
} //일반 메서드 돌려보는 법


// 메서드 선언
// public int solution (int[] num_list) {
// - 정수 배열 'num_list' 를 매개변수로 받아 정수형 결과를 반환하는 'solution' 이라는 공용 메서드를 선업합니다.

// 변수 초기화
// int oddSum = 0;
// int evenSum = 0;
// - 정수형 변수 'oddSum' 과 'evenSum' 을 각각 0으로 초기화 합니다.
// - 이 변수들은 배열의 홀수 번째와 짝수 번째 원소들의 합을 계산할 때 사용됩니다.

// 배열 순회
// for (int i = 0; i < num_list.length; i++) {
// - 'for' 루프를 사용하여 'num_list' 배열의 각 원소를 순회합니다.
// - 루프는 'i = 0' 에서 시작하여 'i < num_list.length' 일 때까지 반복됩니다.

// 홀수 및 짝수 번째 원소 합 계산
// if((i + 1) % 2 == 1) {
//     oddSum += num_list[i];
// } else {
//     evenSum += num_list[i];
// }
// - 'if' 조건문을 사용하여 '(i + 1) % 2 == 1' 인 경우,
// - 즉 인덱스 'i + 1' 이 홀수인 경우 'oddSum' 에 'num_list[i]' 를 더합니다.
// - 'else' 조건문을 사용하여 인덱스 'i + 1' 이 짝수인 경우 'evenSum' 에 'num_list[i]' 를 더합니다.

// 결과 반환
// return Math.max(oddSum, evenSum);
// - 모든 원소를 순회한 후, 'oddSum' 과 'evenSum' 중 큰 값을 반환합니다.
// - 'Math.max' 메서드를 사용하여 두 값중 큰 값을 선택합니다.

// 전체적인 흐름
// - 이 코드는 주어진 정수 배열 'num_list' 를 순회하며 홀수 번째 원소들의 합과 짝수 번째 원소들의 합을 계산합니다.
// - 그 후, 두 합 중 더 큰 값을 반환합니다. 배열의 인덱스는 0부터 시작하지만 문제에서의 "첫 번째" 원소는 인덱스 1에 해당하므로
// - '(i + 1) % 2' 를 사용하여 홀수와 짝수를 판별합니다.