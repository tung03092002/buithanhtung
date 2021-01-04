package bai_on_tap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class câu_03 {
    public static void main(String[] args) {
        int a, b;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner s = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        a = s.nextInt();
        System.out.println("Nhập vào số b: ");
        b = s.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -b / a;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }
}

