package Hinhhoc;

import java.util.Scanner;

public class Hinhchunhat {
    public float chieudai;
    public float chieurong;
    public float chuvi;
    public float dientich;
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        System.out.println("Vui long nhap chieu dai : ");
        chieudai = sc.nextFloat();
        System.out.println("Vui long nhap chieu rong : ");
        chieurong = sc.nextFloat();
    }
    public void tinh(){
        chuvi = (chieudai + chieurong) * 2 ;
        dientich = chieudai * chieurong ;
    }
    public void inThongTin(){
        System.out.println("Chu vi hinh chu nhat la : " + chuvi );
        System.out.println("Dien tich hinh chu nhat la : " + dientich );
    }
}
