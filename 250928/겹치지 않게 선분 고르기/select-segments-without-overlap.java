
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n, ans;
    static Node[] arr;
    static ArrayList<Node> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        ans = 0;
        n = sc.nextInt();
        arr = new Node[n];
        for(int i = 0 ; i < n ; i ++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[i] = new Node(s,e);
        }
        DFS(0, list);
        System.out.println(ans);
    }
    static void DFS(int v, ArrayList<Node> box){
        if (v == n){
            if (ans >= box.size()) return;
            ans = box.size();
        }else{
            DFS(v + 1, box);
            Node current = arr[v];
            boolean flag = true;
            for (Node node : box) {
                if (current.end >= node.start && current.start <= node.end){
                    flag = false;
                    break;
                }
            }
            if (flag){
                box.add(current);
                DFS(v +1, box);
                box.remove(box.size()-1);
            }
        }
    }
    static class Node{
        int start, end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}