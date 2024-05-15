package HashSet;

import java.util.HashSet;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class demo1 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>()
        Scanner sc = new Scanner(System.in);
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        System.out.println("Cac phan tu trong HashSetInterger");
        System.out.println(HashSetInterger);
        System.out.println("Nhap phan tu can them ");
        number = sc.nextInt();
        if (!HashSetInterger.contains(number)){
            hashSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu HashSet sau khi them ");
            System.out.println(HashSetInterger);
        }else {
            System.out.println("Phan tu " +number "da ton tai");
        }

    }
}
