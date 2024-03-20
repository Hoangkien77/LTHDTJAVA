package Kethua;

import java.util.Scanner;

public class Nguoi {
    public String Name;
    public String Age;
    public String Gender;
    public void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban :");
        Name = sc.nextLine();
        System.out.println("Nhap tuoi  cua ban :");
        Age = sc.nextLine();
        System.out.println("Nhap gioi tinh cua ban :");
        Gender = sc.nextLine();
    }
    public void Xuatthongtin()
    {
        System.out.println(Name +""+ Age +"Tuoi gioi tinh" +Gender);
    }

}
