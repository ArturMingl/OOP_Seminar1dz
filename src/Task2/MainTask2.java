package Task2;

public class MainTask2 {
    public static void main(String[] args){

        Rectangle rect1 = new Rectangle();
        System.out.println("rect1:");
        System.out.printf("Площадь - %.2f, Периметр - %.2f%n", rect1.calculateArea(), rect1.calculatePerimeter());

        Rectangle rect2 = new Rectangle(125.12, 14.02);
        System.out.println("rect2:");
        System.out.printf("Площадь - %.2f, Периметр - %.2f%n", rect2.calculateArea(), rect2.calculatePerimeter());

    }
}
