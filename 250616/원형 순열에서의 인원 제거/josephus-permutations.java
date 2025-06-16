import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int n;
    static int[] ch;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 1;  i<= n; i ++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            for(int i = 0 ; i < k-1; i ++){
                int pop = queue.poll();
                queue.offer(pop);
            }
            System.out.print(queue.poll()+ " ");
        }
    }


    static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", lt=" + lt +
                    ", rt=" + rt +
                    '}';
        }
    }
}