import java.util.Scanner;

public class leap_year_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println(" mời bạn nhập năm: ");
        year = sc.nextInt();
        if (year %4==0){
            if(year%100==0) {
            if(year%400==0) {
                System.out.println("đây làm năm nhuận");
            }else {
                System.out.println("đây không phải là năm nhuận");
            }
            }else {
                System.out.println(" đây là năm nhuận");
            }
            }else{
                System.out.println("đây không phải là năm nhuận");
            }
        }
    }

