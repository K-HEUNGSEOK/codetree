import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static boolean[] ch;
    static int[][] graph;
    static int n, m, ans;

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        ch = new boolean[n + 1];
        ch[1] = true;
        DFS(1);
        System.out.println(ans);
    }

    static void DFS(int V) {
        for(int i = 1; i<=n ; i ++){
            if (graph[V][i] == 1 && !ch[i]){
                ch[i] = true;
                ans ++;
                DFS(i);
            }
        }
    }
}
