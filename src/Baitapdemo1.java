import java.util.Date;
import java.util.Scanner;

public class Baitapdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Nhập tên của bạn");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của bạn");
        int old = sc.nextInt();
        System.out.println("Chào Bạn "+ name + "Tôi năm nay"+" " + old);

         */
       /* int a = 10, b = 30;
        int tong = a + b;
        int hieu = b - a;
        int thuong = b / a;
        int tich = a * b;
        int cs2 = b % a;
        System.out.println("Tổng = " + tong +"\n" + "Hiệu = " + hieu +"\n" + "Thương = " + thuong + "\n" + "Tích = " + tich +"\n" + "Số Dư = " + cs2);
        */
        /*Date now = new Date();
        System.out.println("Thời gian" + now);
         */
        /*int a = 5, b = 7, c = a++ + ++b ;
        System.out.printf("%d",c);

         */

        //Bài tập 1:Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
        int a = sc.nextInt();
        System.out.println("Nhập số a");
        int b = sc.nextInt();
        System.out.println("Nhập số b");
        if(a % b == 0){
            System.out.printf("a chia hết cho b");
        }else {
            System.out.printf("a không chia hết cho b");
        }

    }
}

