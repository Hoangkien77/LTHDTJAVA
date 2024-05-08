public class Cat extends Animal {
    @Override
    void Run(){
        System.out.println("meo chay rat nhanh");
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.run();
        cat1.eat();
    }
}
