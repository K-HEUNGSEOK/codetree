import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //스택에 ( 이걸 넣고
        // ) 이걸 만나면 pop을 한다.
        // stack 비어있거나 남아있으면 no 
        Stack<Character> stack = new Stack<Character>();
        char[] arr = str.toCharArray();
        boolean check = true;
        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] == '('){
                stack.push(arr[i]);
            }else{
                if(stack.isEmpty()){
                    check = false;
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            check = false;
        }

        if(check){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}