import java.util.Scanner;

public class câu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = sc.nextInt();
        if (n > 2) {
            if (n % 2 == 0) {
                System.out.println(n + "la so chan");
            } else {
                System.out.println(n + "la so le");
            }
        }
    }
}
