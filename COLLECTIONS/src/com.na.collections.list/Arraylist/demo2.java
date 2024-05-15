package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInterger = new ArrayList<>()
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhập số phần tử array ");
        int n = sc.nextInt();
        for(int i = 0 , i < n , i++)
            System.out.println("Nhập phần tử thứ " + i + ":");
            number = sc.nextInt();
            arrayListInterger.add(number);

        int max = arrayListInterger.get(0);

        for(int i = 1; i < arrayListInterger.size(); i++){
            if (arrayListInterger.get(i).compareTo(max)>0){
                max = arrayListInterger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong array = " + max);
    }
}
