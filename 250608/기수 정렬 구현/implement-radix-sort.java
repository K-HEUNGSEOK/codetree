import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        radixSort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void radixSort(int[] arr) {
        int max = getMax(arr); // 가장 큰 수 → 자릿수 결정
        int exp = 1;

        while (max / exp > 0) {
            countingSortByDigit(arr, exp);
            exp *= 10;
        }
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i ++){
            list.add(new ArrayList<>()); //0~9까지 버킷준비
        }

        for (int num : arr) {
            int digit = (num / exp ) % 10; //1234면 4
            list.get(digit).add(num);
        }
        int index = 0;
        for (List<Integer> target : list) {
            for (Integer number : target) {
                arr[index ++] = number;
            }
        }
    }

    private static int getMax(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max){
                max = i;
            }
        }
        return max;
    }
}
