package bai_on_tap;

import java.util.Scanner;

public class câu_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("nhập số thứ nhất: ");
        int a = s.nextInt();
        System.out.print("nhập số thứ hai: ");
        int b = s.nextInt();
        System.out.print("nhập số thứ ba: ");
        int c = s.nextInt();
        if (a > 2 && b > 2 && c > 2) {
            if (a > b && a > c) {
                System.out.print("Số lớn nhất trong 3 số là: " + a);
            }
            if (b > a && b > c) {
                System.out.print("Số lớn nhất trong 3 số là: " + b);
            }
            if (c > b && c > a) {
                System.out.print("Số lớn nhất trong 3 số là: " + c);
            }
        } else {
            System.out.print("Yêu cầu cả 3 số phải đều phải lớn hơn 2.");
        }
    }
}

