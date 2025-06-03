import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        List<Character> list = new LinkedList<>();
        String str = br.readLine();
        for(int i = 0 ; i < n ; i ++){
            list.add(str.charAt(i));
        }
        ListIterator<Character> il = list.listIterator(list.size()); //만듬
        for(int i = 0 ; i <T; i ++) {
            String method = br.readLine();

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
