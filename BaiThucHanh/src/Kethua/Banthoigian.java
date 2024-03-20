package Kethua;

import java.util.Scanner;


public class Banthoigian extends Nhanvienlam{
    public long Workhours;
    public Banthoigian()
    {
        Position = "Nhan vien ban thoi gian";
        Salary = 200000;
    }
    public void Nhapconglam()
    {
        Scanner sc = new Scanner(System.in);
        super.Nhapthongtin1();
        System.out.println("Nhap so gio lam :");
        Workhours = sc.nextLong();
        sc.close();
    }
    public void Tinhluong()
    {
        this.Salary = Salary * Workhours;
    }
}
