import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[101];
        int[] y = new int[101];
        int ans =Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i = 0; i <= 100; i +=2){
            for(int k = 0 ; k <= 100; k +=2){
                //1. x보다 작고 y 보다 작은 갯수
                int count1 = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (i > x[j] && k > y[j] ){
                        count1 ++;
                    }
                }

                //2. x보다 작고 y보다 큰 개수
                int count2 = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (i > x[j] && k < y[j] ){
                        count2 ++;
                    }
                }

                //3. x보다 크고 y보다 작은 개수
                int count3 = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (i < x[j] && k > y[j] ){
                        count3 ++;
                    }
                }

                //4. x 보다 크고 y 보다 큼
                int count4 = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (i < x[j] && k < y[j] ){
                        count4 ++;
                    }
                }

                int max = Math.max(count1,count2);
                max = Math.max(count3, max);
                max = Math.max(count4, max);

                ans = Math.min(ans,max);
            }
        }
        System.out.println(ans);
    }

}