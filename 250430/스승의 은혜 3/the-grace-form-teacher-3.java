import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람 수
        int b = sc.nextInt(); // 선물 살 수 있는 예산
        int ans = 0; //정답
        Student[] students = new Student[1001];

        for(int i = 0 ; i < n ; i ++){
            students[i] = new Student(sc.nextInt(),sc.nextInt());
        }

        for(int i = 0 ; i < n ; i ++){
            Student[] temp = new Student[n];
            for(int j = 0 ; j < n ; j ++){
                temp[j] = new Student(students[j].price,students[j].delivery);
            }
            temp[i].price /= 2;
            Arrays.sort(temp,0,n);

            int sum = 0 ;
            int count = 0 ;
            for(int j = 0 ; j < n ; j ++){
                sum += temp[j].delivery + temp[j].price;
                if (sum > b){
                    break;
                }
                count++;
            }
            ans = Math.max(ans,count);
        }
        System.out.println(ans);

    }
    static class Student implements Comparable<Student>{
        int price;
        int delivery;

        public Student(int price, int delivery) {
            this.price = price;
            this.delivery = delivery;
        }
        @Override
        public int compareTo(Student o){
            return (this.price+this.delivery) - (o.price+o.delivery);
        }
    }
}
