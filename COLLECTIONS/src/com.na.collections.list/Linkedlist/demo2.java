package Linkedlist;

import java.util.HashSet;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>()
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lleow");
        hashSetString.add("Mazda");
        System.out.println("Hiển thị phần tử trong hashsetString");
        System.out.println(hashSetString);
        System.out.println("Nhập phần tử cần xóa:");
        name = sc.nextLine();
        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Xóa thành công");
            System.out.println("Các phần tử còn lại hashsetString");
            System.out.println(hashSetString);
        }else {
            System.out.println("Xóa không thành công!");
        }
    }
}
