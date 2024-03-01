public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hinh tron 1");
        Hinhtron ht = new Hinhtron();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.InThongtin();
        System.out.println("Hinh tron 2");
        Hinhtron ht2 = new Hinhtron();
        ht2.NhapBanKinh();
        ht2.TinhChuVi();
        ht2.TinhDienTich();
        ht2.InThongtin();
        
    }
}
