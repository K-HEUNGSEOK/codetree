
import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        int ans = 0 ;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j ++){
                int total = 0;
                for(int k = i ; k < i + 3; k++){
                    for(int l = j ; l < j + 3; l ++){
                        if (!isRange(k,l))continue;
                        total += graph[k][l];
                    }
                }
                ans = Math.max(ans,total);
            }
        }
        System.out.println(ans);
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}