import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        char[] ch = new char[1001];
        for (int i = 0; i < n; i++) {
            char s = sc.next().charAt(0);
            int num = sc.nextInt();
            ch[num] = s;
        }
        int cnt = 0;
        for (int i = start; i <= end; i++) {
            int ansS = Integer.MAX_VALUE;
            int ansN = Integer.MAX_VALUE;
            for (int j = start; j <= end; j++) {
                if (ch[j] == 'S') {
                    ansS = Math.min(ansS, Math.abs(j - i));
                }
                if (ch[j] == 'N') {
                    ansN = Math.min(ansN, Math.abs(j - i));
                }
            }
            if (ansS <= ansN) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
