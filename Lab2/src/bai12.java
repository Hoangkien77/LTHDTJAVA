import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so dong cua ma tran: ");
        int a = sc.nextInt();
        System.out.println("Vui long nhap so cot cua ma tran: ");
        int b = sc.nextInt();
        int A [][] = new int [a][b];
        System.out.println("Vui long nhap cac phan tu cua ma tran");
        for(int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                System.out.println("A[" + i + "]" + "[" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for(int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                if ( max < A[i][j] ){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang :");
    }
}
    

