package Baitapslide.Person;

import java.util.Scanner;

public class Congnhan {
    public String Hotencongnhan;
    public int Tuoicongnhan;
    public float Namkinhnghiem;

    void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap ho ten cua ban :");
        Hotencongnhan = sc.nextLine();
        System.out.println("Vui long nhap tuoi cua ban :");
        Tuoicongnhan = sc.nextInt();
        System.out.println("Vui long nhap so nam kinh nghiem:");
        Namkinhnghiem = sc.nextFloat();

    }
    void Inthongtin()
    {
        System.out.println("Ten cua ban la :" +Hotencongnhan);
        System.out.println("Tuoi cua ban la :" +Tuoicongnhan);   
        System.out.println("Nam kinh nghiem cua ban la :" +Namkinhnghiem);
    }
    void Inthongtin(String name , int age , float years)
    {
        System.out.println("Ten cua ban la :" +name);
        System.out.println("Tuoi cua ban la :" +age);   
        System.out.println("Nam kinh nghiem cua ban la :" +years);
    }
}
