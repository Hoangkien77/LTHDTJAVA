package Linkedlist;

import java.util.HashSet;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Int number;
        HashSet<Integer> hashSetInteger = new HashSet<>()
        Scanner sc = new Scanner(System.in);
        hashSetInteger.add(1);
        hashSetInteger.add(2);
        hashSetInteger.add(3);
        hashSetInteger.add(4);
        hashSetInteger.add(5);
        System.out.println("Hiển thị phần tử trong hashsetString");
        System.out.println(hashSetInteger);
        System.out.println("Nhập phần tử cần xóa:");
        name = sc.nextInt();
        if(hashSetString.contains(number)){
            hashSetString.remove(number);
            System.out.println("Xóa thành công");
            System.out.println("Các phần tử còn lại hashsetString");
            System.out.println(hashSetInteger);
        }else {
            System.out.println("Phần tử " + number + "đã tồn tại");
        }
    }
}

