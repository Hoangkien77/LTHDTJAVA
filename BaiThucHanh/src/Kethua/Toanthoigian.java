package Kethua;

import java.util.Scanner;

public class Toanthoigian  extends Nhanvienlam{
    public int Workdays;
    public Toanthoigian()
    {
        Position = "Nhan vien toan thoi gian";
        Salary = 500000;
    }
    public void Nhapngaylam()
    {
        Scanner sc = new Scanner(System.in);
        super.Nhapthongtin1();
        System.out.println("Nhap so ngay lam :");
        Workdays = sc.nextLong();
        sc.close();
    }
    public void Tinhluong1()
    {
        this.Salary = Salary * Workdays;
    }
}
