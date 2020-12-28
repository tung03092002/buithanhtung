import java.util.Scanner;

public class câu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        //ý 1
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ" + i + ":");
        A[i] = sc.nextInt();
    }
    System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < n;i++) {
        System.out.print(A[i] + "\t");
    }

    //ý 2
        int dem = 0;
    for (int i = 0; i < n; i++) {
        if (A[i] % 5 == 0 && A[i] % 6 != 0) {
            dem++;
        }
    }
    System.out.println("co" + dem + "giá trị chia hết cho 5 mà không chia hết cho 6");

    //ý 3
        int D = 0;
        for (int i = 0; i < n;i++) {
            if (A[i] % 2 == 1){
                D++;
        }
    }
    System.out.println("co" + D + "so le trong mang");

        //ý 4
        int tong = 0;
        int TB = 0;
        for(int i = 0; i < n;i++) {
            tong += A[i];
        }
        TB = tong/n;
        int Dem = 0;
        for(int i = 0;i < n;i++) {
            if (A[i] >= TB) {
                Dem++;
            }
        }
        System.out.println("co" + Dem + "phan tu trong mang A co gia tri lơn hơn hoac bang gia tri trung binh");

        //ý 5
        int j = 0;
        int[] C = new int[n];
        for (int i = 0;i < n;i++) {
            if (A[i] % 2 == 1){
                C[j] = A[i];
                j++;
            }
        }
        System.out.println("Cac phan tu cua mang C la:");
        for(int i =0 ; i < j;i++) {
            System.out.print(C[i] + "\t");
        }

        //ý 6
        int a = 0;
        System.out.print("\nNhap so can kiem tra : ");
        int X = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (A[i] == X) {
                a++;
            }
        }
        if (a >= 2) {
            System.out.println("Co ton tai gia tri " + X + " lap lai trong mang.");
        } else {
            System.out.println("Khong ton tai gia tri " + X +" lap lai trong mang.");
        }
    }
}






