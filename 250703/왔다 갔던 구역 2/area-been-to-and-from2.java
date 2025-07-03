import javax.print.DocFlavor;
import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] simulation = new int[201];
        int offset = 100;
        int current = 100;
        for(int i = 0 ; i < n ; i ++){
            int d  = sc.nextInt();
            char command = sc.next().charAt(0);

            if (command == 'L'){
                int distance = current - d;
                for(int j = current; j >= distance; j --){
                    simulation[j] ++;
                }
                current -= d;
            }else{
                int distance = d + current;
                for(int j = current; j <= distance; j ++){
                    simulation[j] ++;
                }
                current += d;
            }
        }
        int lt = 0, rt = 0, ans = 0;
        int len = 201;

        while (true) {
            // 1) ≤1인 정점 건너뛰기
            while (rt < len && simulation[rt] <= 1) {
                rt++;
            }
            if (rt >= len) break;      // 더 이상 >1인 정점이 없으면 종료

            // 2) >1인 정점 구간 시작
            lt = rt;

            // 3) 이어지는 >1인 정점 구간 찾기
            while (rt < len && simulation[rt] > 1) {
                rt++;
            }

            // 4) 구간 길이(rt−lt)에서 1을 빼서 “간선 개수”로 환산
            ans += (rt - lt - 1);
        }

        System.out.println(ans);
    }
}
