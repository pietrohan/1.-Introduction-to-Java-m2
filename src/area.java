import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        float width;
        float height;
//Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = sc.nextFloat();//Nhập chiều rộng

        System.out.println("Enter height: ");
        height = sc.nextFloat();//Nhập chiều dài
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
