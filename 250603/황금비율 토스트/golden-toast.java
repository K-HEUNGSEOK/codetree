import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int T = sc.nextInt();

        List<Character> list = new LinkedList<>();
        String str = sc.next();
        sc.nextLine();
        for(int i = 0 ; i < n ; i ++){
            list.add(str.charAt(i));
        }
        ListIterator<Character> il = list.listIterator(list.size()); //만듬
        for(int i = 0 ; i <T; i ++) {
            String method = sc.nextLine();

            switch (method){
                case "L":
                    if (il.hasPrevious()){
                        il.previous();
                    }
                    break;
                case "R":
                    if (il.hasNext()){
                        il.next();
                    }
                    break;
                case "D":
                    if (il.hasNext()){
                        il.next();
                        il.remove();
                    }
                    break;
                default:
                    String[] split = method.split(" ");
                    String s = split[1];
                    il.add(s.charAt(0));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
