import java.util.Scanner;

public class Hinhtron {
    public float BanKinh;
    public final float PI= 3.14f;
    public float ChuVi;
    public float DienTich;

    void NhapBanKinh()
    {
        System.out.println("Nhap R :");
        Scanner scanner = new Scanner(System.in);
        BanKinh = scanner.nextFloat();
    }
    void TinhChuVi()
    {
        ChuVi = 2*PI*BanKinh;
    
    }
    void TinhDienTich()
    {
        DienTich = PI*BanKinh*BanKinh;

    }
    void InThongtin()
    {
        System.out.println("Chu vi la" +ChuVi);
        System.out.println("Dien tich la" +DienTich);
    }
}
