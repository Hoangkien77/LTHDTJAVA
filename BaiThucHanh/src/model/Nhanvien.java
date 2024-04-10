package model;

public class Nhanvien {
    protected String Name;
    protected long Salary;
    public Nhanvien(){
    
    }
    public Nhanvien(String Name){
        this.Name = Name;
    }
    protected String loaiNhanvien(){
        return "";
    }
    public void XuatthongTin(){
        System.out.println("Nhan vien :" + Name);
        System.out.println("Loai nhan vien" +loaiNhanvien());
        System.out.println("Luong" +Salary);
    }

}
