import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Vui long nhap so phan tu :");
            n = sc.nextInt();
        }while (n < 0);
        double Tong = 0;
        for(int i = 0; i < n; i++){
            System.out.println("vui long nhap phan tu "+ i + "cua day:");
            int ly = sc.nextInt();
            Tong += ly;
        }
        System.out.println("Trung binh cong cua day :" +Tong/n);
    }
}
