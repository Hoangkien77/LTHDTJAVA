import java.util.Scanner;

public class phuongtrinhbachai {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhap he so a");
    double HeSoA = sc.nextDouble();
    System.out.println("Nhap he so b");
    double HeSoB = sc.nextDouble();
    System.err.println("Nhap he so c"); 
    double HesoC = sc.nextDouble();
    if (HeSoA != 0);
        double delta = HeSoB*HeSoB - 4*HeSoA*HesoC;

        if (delta>0);{
            double x1 = (-HeSoB +Math.sqrt(delta))/2/HeSoA;
            double x2 = (-HeSoB -Math.sqrt(delta))/2/HeSoA;

            System.out.println("x1 ="+x1);
            System.out.println("x2 ="+x2);

        }
         if (delta == 0) {
            System.out.println("x1 = x2 = " + (-HeSoB / 2 / HeSoA));
        }
        else {
            System.out.println("Phuong trinh vo nghiem.");
        }
     if (HeSoB != 0) {
         System.out.println("x = " + (-HesoC / HeSoB));
        }
    else if (HesoC != 0) {
         System.out.println("Phuong trinh vo nghiem.");
        }
    else {
         System.out.println("Phuong trinh vo so nghiem.");
        }
        sc.close();
    }
}