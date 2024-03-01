import java.util.Scanner;

public class Sinhvien {
    public String TenSinhVien;
    public int NamSinhSinhVien;
    public int Tuoisinhvien;
    public float Chieucao;
    public float CanNang;

void Nhapthongtin()
{
    System.out.println("Nhap ten cua ban :");
    Scanner sc = new Scanner(System.in);
    TenSinhVien = sc.nextLine();
}
void Nhapnamsinhsinhvien()
{
    System.out.println("Nhap nam sinh cua ban:");
    Scanner sc = new Scanner(System.in);
    NamSinhSinhVien = sc.nextInt();
}

void Nhapchieucaosinhvien()
{
    System.out.println("Nhap chieu cao cua ban (cm):");
    Scanner sc = new Scanner(System.in);
    Chieucao = sc.nextInt();
}
void Nhapcannangsinhvien()
{
    System.out.println("Nhap can nang cua ban (kg):");
    Scanner sc = new Scanner(System.in);
    CanNang = sc.nextInt();
}
void tinhtuoi()
{
    Tuoisinhvien = 2024 - NamSinhSinhVien;
}
void inthongtinsinhvien()
{
    System.out.println("Ten cua ban la :" +TenSinhVien);
    System.out.println("Tuoi cua ban la: " +Tuoisinhvien);
    System.out.println("Chieu cao cua ban la :" +Chieucao);
    System.out.println("Can nang cua ban la : " +CanNang);
}
}