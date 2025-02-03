import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "pulsh_back":
                    int target = Integer.parseInt(parts[1]);
                    list.add(target);
                    break;
                case "pop_back":
                    list.remove(list.size() - 1);
                    break;
                case "get":
                    int index = Integer.parseInt(parts[1]);
                    System.out.println(list.get(index - 1));
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
            }
        }
    }
}