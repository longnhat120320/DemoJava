import java.util.Scanner;

public class chuyendoisochuu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = input.nextInt(); // 123
        int hangNghin = number / 1000;
        readNumber(hangNghin);
        System.out.printf(" Nghìn ");
        int hangTram = (number / 100) % 10;
        readNumber(hangTram);
        System.out.printf(" Trăm ");
        int hangChuc = (number / 10) % 10; // 123 / 10 = 12 % 10 = 2; 198 => 198 / 10 = 19 /
        readNumber(hangChuc);
        System.out.printf(" Mươi ");
        int hangDonVi = number % 10;
        readNumber(hangDonVi);
    }

    public static void readNumber(int number) {
        switch (number) {
            case 0:
                System.out.print(" Không ");
                break;
            case 1:
                System.out.print(" Một ");
                break;
            case 2:
                System.out.print(" Hai ");
                break;
            case 3:
                System.out.print(" Ba ");
                break;
            case 4:
                System.out.print(" Bốn ");
                break;
            case 5:
                System.out.printf(" Năm");
                break;
            case 6:
                System.out.printf(" Sáu ");
                break;
            case 7:
                System.out.printf(" Bảy ");
                break;
            case 8:
                System.out.printf(" Tám ");
                break;
            case 9:
                System.out.printf(" Chín ");
                break;
        }
    }

}
