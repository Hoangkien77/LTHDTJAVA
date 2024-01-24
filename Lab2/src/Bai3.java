import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        String Name;
        int Age ;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap ten cua ban");
    Name = scanner.nextLine();
    System.out.println("Nhap tuoi cua ban");
    Age = scanner.nextInt();
    if (Age <16) {
        System.out.println("Ban o do tuoi vi thanh nien");
    }
    if (Age >=16 && Age < 18 ) {
        System.out.println("Ban o do tuoi truong thanh");
    }
    else{
        System.out.println("Ban da gia ");
    }
    }
}