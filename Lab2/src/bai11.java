import java.util.Arrays;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Vui long nhap so phan tu cua mang : ");
            n = sc.nextInt();
        } while(n <= 0);
        int[] a = new int[n];
        for(int i = 0;i < n; ++i){
            a[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau : ");
        for(int i = 0;i < n; ++i){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.print("Mang da sap xep tang dan : ");
        for(int i = 0;i < n; ++i)
            System.out.print(a[i] + " ");
    }
}
