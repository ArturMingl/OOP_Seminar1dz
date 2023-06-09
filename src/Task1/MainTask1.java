package Task1;

public class MainTask1 {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.greet();
        cat1.setName("Yuri");
        cat1.setAge(4);
        cat1.greet();

        Owner oleg = new Owner();
        oleg.setName("Oleg");
        Cat cat2 = new Cat("Masha", 2, oleg.getName());
        cat2.greet();
    }
}