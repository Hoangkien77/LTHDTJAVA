package Linkedlist;

import java.util.LinkedList;

public class demo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>()
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("JAVA");
        System.out.println("Ví dụ phương thức addall");
        System.out.println("-------");
        LinkedList<String> listA = new LinkedList<>()
        listA.addAll(list);
        System.out.println("List A:");
        showlist(listA);
        LinkedList<String> listB = new LinkedList<>()
        list.add("Java");
        listA.retainAll(listB);
        showlist(listA)
    }
}
