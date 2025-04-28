import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // 반복횟수
        int n = sc.nextInt(); // 사람 명수
        Human[][] humans = new Human[k][n];

        for(int i = 0 ; i < k; i ++){
            for(int j = 0 ; j < n; j ++){
                humans[i][j] = new Human(j+1, sc.nextInt());
            }
        }
        int ans = 0;
        for(int i = 0 ; i < k ; i ++){
            int check = humans[i][0].index;
            int count =1;
            for(int j = 1; j < n ; j ++){
                if (check > humans[i][j].index){
                    break;
                }
                count ++;
            }
            ans = Math.max(ans,count);
        }
        System.out.println(ans);
    }
    static class Human{
        int index;
        int num;

        public Human(int index, int num) {
            this.index = index;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "index=" + index +
                    ", num=" + num +
                    '}';
        }
    }

}
