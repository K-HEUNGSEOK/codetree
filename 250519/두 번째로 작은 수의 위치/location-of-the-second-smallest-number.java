import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        //1. copy 배열을 정렬한다.
        int [] copy = Arrays.copyOf(arr,n);
        System.out.println(solution(arr, copy, n));
    }

    static int solution(int[] arr, int[] copy , int n){
        Arrays.sort(copy);
        int min_value = copy[0];
        boolean check = false;
        //먼저 두번째로 작은게 두개 이상이거나 없으면 -1을 리턴해줘야함
        int result = 0; //두번째로 작은 정답
        int idx = -1;
        for(int i = 1; i < n ; i++){
            if (copy[i] > min_value){
                result = copy[i];
                idx = i; //두개 이상인지도 체크해야함
                check = true;
                break;
            }
        }
        if (!check){ //이게 false 면 두번째로 작은게 없다는 것
            return -1;
        }

        //이게 터지면 두번째로 작은수가 여러개인 것
        for(int i = idx+1; i < n; i ++){
            if (result == copy[i]){
                return -1;
            }
        }

        //이제 idx 찾기
        for(int i = 0 ; i < n ; i ++){
            if (result == arr[i]){
                return i + 1;
            }
        }
        return -1;
    }
}
