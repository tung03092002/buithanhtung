package bai_on_tap;

import java.util.Scanner;

public class câu_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int n = s.nextInt();
        if (n>2){
            if(n%2==0){
                System.out.print("\nĐây là số chẵn.");
            }
            if(n%2!=0){
                System.out.print("\nĐây là số lẻ.");
            }
        }else{
            System.out.print("\nYêu cầu số cần kiểm tra phải lớn hơn 2.");
        }
    }
}

