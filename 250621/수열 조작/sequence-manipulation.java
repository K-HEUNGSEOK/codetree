import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();
        int n =  sc.nextInt();
        for(int i = 1 ; i <=n ; i ++){
            queue.offer(i);
        }
        while (queue.size() != 1){
            queue.poll();
            int num = queue.poll();
            queue.offer(num);
        }
        System.out.println(queue.pop());
    }
}
