import java.util.Scanner;

public class tinhtongcacsonguyen {

    public static void main(String[] args) {
        int So , sum = 0; 
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen bat ki :");
            So = scanner.nextInt();
            sum += So;
            sum = sum + So;
        } while (sum < 100);
            System.out.println("tong cac so nguyen vua nhap =" +sum);
    }
}