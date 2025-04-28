import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

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
        // 2) i번째 선분이 다른 어떤 선분과도 cross 되지 않으면 count++
        for(int i = 0; i < n; i++){
            boolean isolated = true;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                // (seg[i].a - seg[j].a)*(seg[i].b - seg[j].b) < 0 이면 두 선분이 뒤집혀서 교차(cross) 하는 경우
                if((seg[i][0] - seg[j][0]) * (seg[i][1] - seg[j][1]) < 0) {
                    isolated = false;
                    break;
                }
            }
            if(isolated) count++;
        }

        System.out.println(count);
    }
}
