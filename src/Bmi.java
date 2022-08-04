import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "bạn đang quá gày, hãy ăn nhiều vào mà lấy vợ!!!");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "bạn đẹp đấy, nhớ duy tr phong độ, chớ mê ăn uống nhé:D");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "bạn đang có hiện tượng béo phì, hãy giảm ăn, muốn lấy vợ thì nghe tôi");
        else
            System.out.printf("%-20.2f%s", bmi, "bạn đang quá béo, sẽ gây ra nhiều bệnh trong tương lai, tôi khuyên bạn nên ăn ít thôi, tập ăn rau quả đi");
    }
}
