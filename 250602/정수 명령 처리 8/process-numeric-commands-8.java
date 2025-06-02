import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n ; i ++){
            String str = sc.nextLine();
            if (str.startsWith("push")){
                String[] split = str.split(" ");
                String commond = split[0];
                int num = Integer.parseInt(split[1]);
                switch (commond){
                    case "push_back":
                        list.addLast(num);
                        break;
                    case "push_front":
                        list.addFirst(num);
                        break;
                }
            }else {
            switch (str){
                case "pop_front":
                    Integer integer1 = list.pollFirst();
                    System.out.println(integer1);
                    break;
                case "pop_back":
                    Integer integer = list.pollLast();
                    System.out.println(integer);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    if (list.isEmpty()) System.out.println("1");
                    else System.out.println("0");
                    break;
                case "front":
                    System.out.println(list.peekFirst());
                    break;
                case "back":
                    System.out.println(list.peekLast());
                    break;

            }
            }
        }
    }
}
