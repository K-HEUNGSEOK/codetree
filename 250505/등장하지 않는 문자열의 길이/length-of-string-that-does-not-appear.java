import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        for (int len = 1; len <= n; len++) {
            boolean hasDuplicate = false;

            // 길이 len짜리 모든 부분 문자열 검사
            for (int i = 0; i <= n - len; i++) {
                String sub = str.substring(i, i + len);
                int count = 0;
                int idx = 0;

                // 등장 횟수 세기 (두 번 이상 나오면 중단)
                while ((idx = str.indexOf(sub, idx)) != -1) {
                    count++;
                    if (count > 1) break;
                    idx++;
                }

                if (count > 1) {
                    hasDuplicate = true;
                    break;
                }
            }

            // 만약 중복된 조각 하나도 없었다면 이 len이 답
            if (!hasDuplicate) {
                System.out.println(len);
                return;
            }
        }
    }
}
