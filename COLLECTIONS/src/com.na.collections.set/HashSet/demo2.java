package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>()
        Scanner sc = new Scanner(System.in);
        hashSetInteger.add("wilson");
        hashSetInteger.add("Nike");
        hashSetInteger.add("Volvo");
        hashSetInteger.add("Kia");
        hashSetInteger.add("Lenovo");
        hashSetInteger.add("Lenovo");

        System.out.println("Cac phan tu trong HashSetString");
        System.out.println(HashSetString);
        System.out.println("Nhap phan tu can xoa ");
        name = sc.nextLine();
        if (!HashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("Cac phan tu HashSet sau khi xoa ");
            System.out.println(HashSetString);
        }else {
            System.out.println("Xoa khong thanh cong");
        }
    }
}
