package Kethua;

import java.util.Scanner;

public class Nhanvienlam  extends Nguoi{
    public String Employeecode;
    public String Position;
    public long Salary;
    public void Nhapthongtin1()
    {
        Scanner sc = new Scanner(System.in);
        super.Nhapthongtin();
        System.out.println("Nhap ma nhan vien");
        Employeecode = sc.nextLine();
    }
    public void Xuatthongtin1()
    {
        super.Xuatthongtin();
        System.out.println("\nChucvu" +Position);
        System.out.println("\nManhanvien"+Employeecode);
        System.out.println("\nLuong" +Salary);
    }
}
