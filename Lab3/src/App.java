import java.io.ObjectInputFilter.Config;

import model.Nhanvienfulltime;
import model.Nhanvienparttime;

public class App {
    public static void main(String[] args) throws Exception {
        Nhanvienfulltime sep = new Nhanvienfulltime("Hoang Trung Kien", 18);
       sep.setLoaichucvu(Config.NHAN_VIEN_SEP);
       Nhanvienfulltime linh1 = new Nhanvienfulltime("Hoang Van Linh", 012);
       Nhanvienfulltime linh2 = new Nhanvienfulltime("Hoang Gia Bao", 020);
       Nhanvienparttime thoivu1 = new Nhanvienparttime("Nguyen Thuy Linh", 200);
       sep.tinhluongnhanvienlinh();
       linh1.tinhluongnhanvienlinh();
       linh2.tinhluongnhanvienlinh();
       thoivu1.tinhluongnhanvienthoivu();
       sep.XuatthongTin();
       linh1.XuatthongTin();
       linh2.XuatthongTin();
       thoivu1.XuatthongTin();
    }
}
