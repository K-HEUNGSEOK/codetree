import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int covered = -1;      // 지금까지 커버된 가장 오른쪽 인덱스
        int wifiCount = 0;     // 설치한 와이파이 개수

        for (int i = 0; i < n; i++) {
            // 사람이 살고 있고, 아직 커버되지 않은 위치라면
            if (arr[i] == 1 && i > covered) {
                wifiCount++;
                // i 에서 설치 → 오른쪽으로도 m, 왼쪽으로도 m →
                // 0-based index 로는 i + 2*m 까지 커버됨
                covered = i + 2 * m;
            }
        }

        System.out.println(wifiCount);
    }
}
