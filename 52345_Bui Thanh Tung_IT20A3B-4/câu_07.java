package bai_on_tap;

import java.util.Scanner;

public class câu_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.print("Nhập số thứ nhất: ");
        a = s.nextInt();
        System.out.print("Nhập số thứ hai: ");
        b = s.nextInt();
        System.out.println("\ngiá trị ban dầu của 2 số là: " +a+"  "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("\ngiá trị của 2 số sau khi hoán vị là: "+a+"  "+b);


    }
}

