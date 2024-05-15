package Arraylist;

public class Test {
    public static void main(String[] args) {
        Arraylist<String> ArraylistString = new Arraylist<>()
        ArraylistString.add("JAVA");
        ArraylistString.add("PHP");
        ArraylistString.add("C#");
        

        System.out.println("Cac phan tu đó là ")
        for (int i = 0 ; i <ArraylistString.size(); i++){
            System.out.println(ArraylistString.get(i) + "/t")
        }
    }
}
