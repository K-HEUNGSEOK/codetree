import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new int[n+1][n+1];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < n ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int cnt=  0;
                for(int k = i ; k < 3 + i; k ++){
                    for(int l = j ; l < 3 + j; l ++){
                        if (k >= n || l >= n) continue;
                        if (graph[k][l] == 1){
                            cnt ++;
                        }
                    }
                    ans = Math.max(ans,cnt);
                }
            }
        }
        System.out.println(ans);
    }
}
