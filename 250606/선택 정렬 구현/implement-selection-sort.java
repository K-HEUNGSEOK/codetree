import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static int n = 3;
    static int[] ch;
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n -1; i ++){
            int idx = i;
            for(int j = i +1; j < n ; j ++){
                if (arr[idx] > arr[j]){
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

