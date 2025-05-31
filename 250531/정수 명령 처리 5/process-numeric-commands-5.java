import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n ; i ++){
            String s = sc.nextLine();
            String method = "";
            int num = 0;
            if (s.startsWith("push") || s.startsWith("get")){
                String[] str = s.split(" ");
                method = str[0];
                 num = Integer.parseInt(str[1]);
            }else {
                method = s;
            }
            switch (method) {
                case "push_back":
                    list.add(num);
                    break;
                case "pop_back":
                    list.remove(list.size()-1);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "get" :

                    System.out.println(list.get(num-1));
                    break;
            }

        }
        // Please write your code here.
    }

}
