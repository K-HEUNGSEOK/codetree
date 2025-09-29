
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int INT_MAX = Integer.MAX_VALUE;
    static int MAX_N = 11;
    static int n,m;
    static ArrayList<Pair> lines = new ArrayList<>();
    static ArrayList<Pair> selectLines = new ArrayList<>();
    static int ans = INT_MAX;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            lines.add(new Pair(b, a-1));
        }
        Collections.sort(lines);
        DFS(0);
        System.out.println(ans);
    }
    static boolean isPossible(){
        int[] num1 = new int[MAX_N];
        int[] num2 = new int[MAX_N];
        for(int i = 0 ; i < n; i ++){
            num1[i] = num2[i] = i;
        }

        for(int i = 0 ; i < lines.size(); i ++){
            int idx = lines.get(i).y; //이게 2면 3이랑 연결 되는 것
            int tmp = num1[idx];
            num1[idx] = num1[idx + 1];
            num1[idx + 1] = tmp;
        }

        for(int i = 0 ; i < selectLines.size(); i ++){
            int idx = selectLines.get(i).y;
            int tmp = num2[idx];
            num2[idx] = num2[idx + 1];
            num2[idx + 1] = tmp;
        }

        for(int i  = 0 ; i < n ; i ++){
            if (num1[i] != num2[i]) return false;
        }
        return true;
    }
    static void DFS(int v){
        if (v == m){
            if (isPossible()) {
                ans = Math.min(ans, (int) selectLines.size());
                return;
            }
        }else{
            selectLines.add(lines.get(v));
            DFS(v + 1);
            selectLines.remove(selectLines.size()-1);
            DFS(v + 1);
        }
    }
    static class Pair implements Comparable<Pair>{
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Pair o){
            if (this.x == o.x){
                return this.y - o.y;
            }
            return this.x - o.x;

        }
    }
}