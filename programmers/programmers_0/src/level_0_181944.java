//자연수 n 이 입력으로 주어졌을 때 만약 n 이 짝수이면 "n is even" 을, 홀수이면 "n is odd" 를 출력하는 코드를 작성해 보세요.

import java.util.Scanner;

public class level_0_181944 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 ==0){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}

//import java.util.Scanner;

//public class level_0_181944 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        - 'Scanner sc': 'Scanner' 틀래스의 갹채를 선언. 'sc' 는 객체의 이름
//        - 'new Scanner(System.in)': 'System.in' 은 표준입력 스트림(일반적으로는 키보드 입력)을 의미합니다. 'Scanner' 객체를 생성하여 표준 입력을 읽을 수 있도록 합니다.

//        int n = sc.nextInt();     // 'Scanner' 객체 'sc' 를 사용하여 사용자로부터 정수를 입력받습니다. 이 입력된 값은 'n' 변수에 저장됩니다.
//
//        if (n % 2 ==0){
//            System.out.println(n + " is even");
//        } else {
//            System.out.println(n + " is odd");
//        }
//    }
//}