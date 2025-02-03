import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList arr = new ArrayList();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer str;
        StringBuilder sb = new StringBuilder();

        while (N-->0){
            str = new StringTokenizer(br.readLine(), " ");

            int strLen = str.countTokens();

            if (strLen > 1){
                String str1 = str.nextToken();
                int str2 = Integer.parseInt(str.nextToken());

                if (str1.equals("push_back")){
                    arr.add(str2);
                } else {
                    sb.append(arr.get(str2-1)).append("\n");
                }
            } else {
                String str1 = str.nextToken();
                if (str1.equals("pop_back")){
                    arr.remove(arr.size()-1);

                } else if (str1.equals("size")){
                    sb.append(arr.size()).append("\n");
                }
            }
        }

        System.out.println(sb);
        
    }
}