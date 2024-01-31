import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Vui long nhap so nguyen duong:");
            n = sc.nextInt();
        }while(n<0);
        if (n==0){
            System.out.println("0! ="+n);
        }
        int gt = 1;
        for(int i = 1; i<= n; i++){
            gt *= i;
        }    
        System.out.println(n+ "! =" +gt);
    }
}