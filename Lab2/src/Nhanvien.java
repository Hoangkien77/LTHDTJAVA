import java.util.Scanner;

public class Nhanvien {
    public String HotenNhanVien;
    public String ChucvuNhanVien;
    public int TuoiNhanvien;
    public int Namsinhnhanvien;

void Nhaphotennhanvien()
{
    System.out.println("Nhap ho ten cua ban:");
    Scanner sc = new Scanner(System.in);
    HotenNhanVien = sc.nextLine();
}
void Nhapchucvu()
{
    System.out.println("Nhap chuc vu cua ban:");
    Scanner sc = new Scanner(System.in);
    ChucvuNhanVien = sc.nextLine();
}
void Nhapnamsinh()
{
    System.out.println("Nhap nam sinh cua ban :");
    Scanner sc = new Scanner(System.in);
    Namsinhnhanvien = sc.nextInt();
}
void Tinhtuoinhanvien()
{
    TuoiNhanvien = 2024 - Namsinhnhanvien;
}

void Inthongtin()
{
    System.out.println("Ho va ten nhan vien la :" +HotenNhanVien);
    System.out.println("Chuc vu cua nhan vien " +ChucvuNhanVien);
    System.out.println("Tuoi cua nhan vien la : " +TuoiNhanvien);
}

}
