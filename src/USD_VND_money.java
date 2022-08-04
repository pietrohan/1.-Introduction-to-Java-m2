import java.sql.SQLOutput;
import java.util.Scanner;

public class USD_VND_money {
    public static void main(String[] args) {
        int uSD;
        int vND;
        double result;
        Scanner sc = new Scanner(System.in);
          System.out.println("Bạn muốn quy đổi tiền tệ?");
        System.out.println("nhấn 1: from USD to VND or" +
                " Nhấn 2: from VND to USD");
        int test = sc.nextInt();
        while (test !=1 && test != 2) {
            System.out.println("mời bạn nhập lại");
            test = sc.nextInt();
        }
            if (test == 1) {
                System.out.println("Mời bạn nhập số tiền (USD): ");
                uSD = sc.nextInt();
                result = 23000 * uSD;
                System.out.println("Số VND bạn quy đổi được là: " + result + "VND");
            } else if (test == 2) {
                System.out.println("Mời bạn nhập số tiền (VND): ");
                vND = sc.nextInt();
                result = vND / 23000;
                System.out.println("Số VND bạn quy đổi được là: " + result + " USD");
            }
        }

    }

