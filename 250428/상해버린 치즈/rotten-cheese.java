import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //사람 수
        int m = sc.nextInt(); //치즈 수
        int d = sc.nextInt(); //반복 수 //누가 무슨치즈 몇초
        int s = sc.nextInt(); //아픈 사람 수 // 누가 몇초

        Cheese [] box = new Cheese[1001];
        boolean[][] magic = new boolean[51][51];
        for(int i = 0 ; i < d; i ++){
            int men = sc.nextInt();
            int cheese = sc.nextInt();
            int time = sc.nextInt();
            box[i] = new Cheese(men,cheese,time);
            magic[men][cheese] = true;
        }
        // 1. 아픈애들이 동일하게 먹은 치즈가 아니면 제외한다.
        // 2. 아픈 이후에 먹은 치즈는 제외한다. (아픈 초와 >= 면 제외)
        Cheese [] twoBox = new Cheese[51];
        for(int i = 0 ; i < s; i ++){
            int men = sc.nextInt();
            int time = sc.nextInt();
            twoBox[i] = new Cheese(men,time);
        }
        Arrays.sort(box,0,n);
        Arrays.sort(twoBox,0,s);
        int ans = 0;
        // 0) 입력 받은 D개의 “(사람, 치즈, 시간)”을 박스에 그대로 보관했으니
//    이걸 바탕으로 완전탐색을 돌릴 거야.

// 1) 후보 치즈판별용 boolean 배열 초기화
        boolean[] candidate = new boolean[m+1];
        Arrays.fill(candidate, true);  // 1번~M번 치즈 모두 처음엔 “후보”라고 표시

// 2) S명의 아픈 사람 각각에 대해
        for (int j = 0; j < s; j++) {
            int sickPerson = twoBox[j].num;
            int sickTime   = twoBox[j].time;

            // 모든 치즈 아이디에 대해
            for (int cheeseId = 1; cheeseId <= m; cheeseId++) {
                // 이 sickPerson이 cheeseId를 'sickTime 이전'에 먹었는지 검사
                boolean ateBefore = false;
                for (int i = 0; i < d; i++) {
                    if (box[i].num == sickPerson
                            && box[i].cheese == cheeseId
                            && box[i].time < sickTime) {
                        ateBefore = true;
                        break;
                    }
                }
                // 만약 먹은 기록이 없거나, 먹었어도 sickTime 이후라면
                if (!ateBefore) {
                    candidate[cheeseId] = false;
                }
            }
        }

// 3) 이제 candidate[cheeseId] == true 인 치즈들만 “오염된 치즈 후보”
//    이 중에서 가장 많이 먹은 사람 수(=최대 약 개수)를 계산


        for (int cheeseId = 1; cheeseId <= m; cheeseId++) {
            if (!candidate[cheeseId]) continue;  // 후보가 아니면 건너뛰기

            // 이 cheeseId를 먹은 서로 다른 사람 수 세기
            boolean[] seen = new boolean[n+1];
            int countEat = 0;
            for (int i = 0; i < d; i++) {
                if (box[i].cheese == cheeseId) {
                    int eater = box[i].num;
                    if (!seen[eater]) {
                        seen[eater] = true;
                        countEat++;
                    }
                }
            }
            ans = Math.max(ans, countEat);
        }

        System.out.println(ans);



    }
    static class Cheese implements Comparable<Cheese>{
        int num;
        int cheese;
        int time;

        public Cheese(int num, int time) {
            this.num = num;
            this.time = time;
        }

        public Cheese(int num, int cheese, int time) {
            this.num = num;
            this.cheese = cheese;
            this.time = time;
        }

        @Override
        public int compareTo(Cheese o){
            if (this.time == o.time){
                return this.num - o.num;
            }
            return this.time - o.time;
        }
    }
}
