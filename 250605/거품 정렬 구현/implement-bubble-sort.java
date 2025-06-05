import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int[] fibo; //값을 저장하는 배열

    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        dfs(arr);
    }

    static void dfs(int[] arr) {
       for(int i = 0 ; i < arr.length-1; i ++){
           for(int j = 0; j < arr.length-1-i; j ++){
               if (arr[j] > arr[j + 1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

