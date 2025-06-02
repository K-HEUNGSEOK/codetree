import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //개발자 숫자
        int K = sc.nextInt(); //전염 시킬 수 있는 횟수
        int P = sc.nextInt();// 전염당한놈
        int T = sc.nextInt(); // 반복횟수

        Virus[] viri = new Virus[T];
        for(int i = 0 ; i < T; i ++){
            int t = sc.nextInt();
            int x= sc.nextInt();
            int y = sc.nextInt();
            viri[i] = new Virus(t,x,y);
        }
        Arrays.sort(viri,(a,b) ->{
            return a.t - b.t;
        });
        boolean[] person = new boolean[N+1];
        person[P] = true;
        int[] check = new int[N+1];

        for(int i = 0 ; i < T; i ++){
            int x = viri[i].x;
            int y = viri[i].y;
            if (person[x]){
                check[x] = K;
            }else if(person[y]){
                check[y] = K;
            }

            if (person[x] && !person[y] && check[x] > 0){
                person[y] = true;
                check[x] -- ;
                check[y] = K;
            }else if(person[y] && !person[x] && check[y] > 0){
                person[x] = true;
                check[x] = K;
                check[y] --;
            }else if(person[x] && person[y]){
                check[x] --;
                check[y] --;
            }
        }
        for(int i = 0; i < N; i ++){
            if (person[i]){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
    }
    static class Virus{
        int t;
        int x;
        int y;

        public Virus(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Virus{" +
                    "t=" + t +
                    ", x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

}
