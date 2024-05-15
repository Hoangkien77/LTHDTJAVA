package TreeMap;

import java.util.TreeMap;

public class demo1 {
    public static void main(String[] args) {
        TreeMap<Integer, Charater> treeMap = new TreeMap<>()
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');
        Set<Entry<Integer, Charater>> setTreeMap = treeMap.entrySet();
        System.out.println("Cac Entry co trong setTreeMap");
        System.out.println(setTreeMap);

    }
}
