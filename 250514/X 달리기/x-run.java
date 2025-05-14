import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();  // 목표 거리

        // 1. √X 의 정수부 k 구하기 (부동소수 오차 보정)
        int k = (int) Math.sqrt(X);
        while ((long) k * k > X)       k--;
        while ((long) (k + 1) * (k + 1) <= X) k++;

        // 2. 남은 거리 d 계산
        long d = X - (long) k * k;

        // 3. 답 결정
        long ans;
        if (d == 0) {
            ans = 2L * k - 1;    // 정확히 제곱수일 때
        } else if (d <= k) {
            ans = 2L * k;        // k*k < X <= k*k + k
        } else {
            ans = 2L * k + 1;    // k*k + k < X < (k+1)*(k+1)
        }

        System.out.println(ans);
       
    }
}
