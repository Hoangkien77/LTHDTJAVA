package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        Set<String> LinkedHashSet = new LinkedHashSet<String>()
        LinkedHashSet.add("JAVA");
        LinkedHashSet.add("PHP");
        LinkedHashSet.add("C++");
        LinkedHashSet.add("PHP");
        for (String str :LinkedHashSet){
            System.out.println(str);
        }

    }
}
