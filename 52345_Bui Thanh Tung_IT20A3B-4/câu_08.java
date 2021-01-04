package bai_on_tap;

import java.util.Scanner;

public class câu_08 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + UCLN(a, b));
    }
    public static int UCLN ( int a, int b){
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int ucln = temp1;
        return ucln;
    }

}

