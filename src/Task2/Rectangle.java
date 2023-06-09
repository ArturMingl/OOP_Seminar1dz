package Task2;
/*Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
Класс должен обладать следующими методами:
Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).*/
public class Rectangle {
    private double wight;
    private double height;

    public Rectangle(){
        wight = height = 1.0;
    }

    public Rectangle(double wight, double height){
        this.wight = wight;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public double getWight() {
        return wight;
    }

    public double calculateArea(){
        return wight * height;
    }

    public double calculatePerimeter(){
        return 2 * (wight + height);
    }
}
