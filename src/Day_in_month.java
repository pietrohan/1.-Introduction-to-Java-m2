import java.util.Scanner;

public class Day_in_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập tháng: ");
        int month = scanner.nextInt();
        System.out.println("nhập năm: ");
        int year = scanner.nextInt();
        switch (month) {
            case 2:
                if((year % 4==0 && year %100 !=0)||(year %400==0)) {
                    System.out.println("Có 29 ngày");
                }else {
                    System.out.println("Có 28 ngày");
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            default:
                System.out.println("nhập dữ liệu sai");
        }
    }
}
