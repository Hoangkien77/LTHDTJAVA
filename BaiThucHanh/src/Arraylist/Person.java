package Arraylist;

import java.util.Scanner;

public class person {
    public String PersonID;
    public String FullName;
    public void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in)
        System.out.println("Vui long nhap ID :");
        PersonID = sc.nextLine()
        System.out.println("Vui long nhap ten :");
        FullName = sc.nextLine()
    }
}
