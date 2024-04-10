package model;

import util.config;

public class Nhanvienparttime extends Nhanvien {
    private int Workhours;
    public Nhanvienparttime(String Name , int Workhours){
        this.Name = Name;
        this.Workhours = Workhours;
    }
    @Override
    public String loaiNhanvien(){
        return"Nhan vien thoi vu";
    }
    public void tinhluongnhanvienthoivu(){
        Salary = config.NHAN_VIEN_LAM_THEM_MOI_GIO * Workhours;
    }

}
