import java.util.Scanner;

public class Demo {
    public String Hoten;
    public int Tuoi;
    public int Nhapthongtin;
    public int Inthongtin;
    public void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        Hoten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        Tuoi = sc.nextInt();
    }
    public void Inthongtin()
    {
        System.out.println("Ten cua ban la :"+Hoten);
        System.out.println("Tuoi cua ban la : "+Tuoi);
    }
    public void Inthongtin(String name , int age)
    {
        System.out.println("Ten cua ban la :"+name);
        System.out.println("Tuoi cua ban la : "+age);
    }
}
