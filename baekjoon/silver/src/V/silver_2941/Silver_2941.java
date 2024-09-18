// 크로아티아 알파벳
// 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다.
// 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다. (사이트 참고)

package V.silver_2941;

import java.util.Scanner;

public class Silver_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] Cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        // 향상된 for 문 사용
        for (String croAlpha : Cro) {
            while (input.contains(croAlpha)) {
                input = input.replaceFirst(croAlpha, " ");
                count++;
            }
        }
        count += input.replaceFirst(" ", " ").length();

        System.out.println(count);
    }
}
