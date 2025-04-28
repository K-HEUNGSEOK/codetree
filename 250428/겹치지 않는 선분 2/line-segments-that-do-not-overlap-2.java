import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] seg = new int[n][2];
        // 1) 입력받아서 [작은값, 큰값] 형태로 저장
        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            seg[i][0] = Math.min(x1, x2);
            seg[i][1] = Math.max(x1, x2);
        }

        int count = 0;
        // 2) i번째 선분이 다른 어떤 선분과도 겹치지 않으면 count++
        for(int i = 0; i < n; i++){
            boolean isolated = true;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                // 두 구간이 겹치면 isolated = false
                if(Math.max(seg[i][0], seg[j][0]) <= Math.min(seg[i][1], seg[j][1])) {
                    isolated = false;
                    break;
                }
            }
            if(isolated) count++;
        }

        System.out.println(count);
    }
}
