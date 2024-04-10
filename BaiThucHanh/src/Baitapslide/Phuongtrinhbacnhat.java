package Baitapslide;
import java.util.Scanner;

public class Phuongtrinhbacnhat {  
    public static void main(String[] args) {
        //1. Khai bao bien
        double HeSoA,HeSoB,x1;
        //2.Nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);
        //In thong bao nhap gia
        System.out.print("Nhap he so A:");
        HeSoA = sc.nextDouble();
        System.out.print("Nhap he so B:");
        HeSoB = sc.nextDouble();
        //3 . Tinh toan gia tri dau ra
        if(HeSoA == 0) {
            System.out.println("Khong phai phuong trinh bac 1");
        } else {
            System.err.println("Phuong trinh co nghiem x=" +(-HeSoB/HeSoA));
        }
        sc.close();
    }

}