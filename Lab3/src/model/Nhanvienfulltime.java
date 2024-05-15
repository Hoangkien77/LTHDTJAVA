package model;

import util.config;

public class Nhanvienfulltime  extends Nhanvien{
    private int Workdays;
    public Nhanvienfulltime(String Name , int Workdays){
        this.Name = Name;
        this.Workdays = Workdays;
    }
    @Override
    public String loaiNhanvien(){
        return"Nhan vien toan thoi gian";
    }
    public void tinhluongnhanvienlinh(){
        Salary = config.NHAN_VIEN_LAM_THEM_MOI_NGAY * Workdays;
    }
}
