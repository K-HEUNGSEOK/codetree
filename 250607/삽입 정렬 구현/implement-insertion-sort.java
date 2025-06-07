import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i = 1 ; i < arr.length; i ++){
            int temp = arr[i], j;
            for(j = i - 1; j >= 0 ; j --){
                if (arr[j] > temp){
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        for(int result : arr){
            System.out.print(result + " ");
        }
    }
}