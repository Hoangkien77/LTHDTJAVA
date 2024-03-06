package Person;

import java.util.Scanner;

public class Hocsinh {
    public String Hotenhocsinh;
    public int Tuoi;
    public int Masinhvien;
    public void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten cua ban:");
        Hotenhocsinh = sc.nextLine();
        System.out.println("Nhap tuoi cua ban :");
        Tuoi = sc.nextInt();
        System.out.println("Nhap ma sinh vien :");
        Masinhvien = sc.nextInt();
    }
    public void Inthongtin()
    {
        System.out.println("Ten cua ban la :" +Hotenhocsinh);
        System.out.println("Tuoi cua ban la " +Tuoi);
        System.out.println("Ma sinh vien cua ban la" +Masinhvien);
    }
    public void Inthongtin(String name , int age , int Studentcode)
    {
        System.out.println("Ten cua ban la :" +name);
        System.out.println("Tuoi cua ban la " +age);
        System.out.println("Ma sinh vien cua ban la" +Studentcode);
    }
}
