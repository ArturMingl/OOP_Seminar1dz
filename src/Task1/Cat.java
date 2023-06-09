package Task1;/*Создайте класс "Кот" (Task1.Cat) со следующими свойствами:
Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида
"Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
    Дополнительное задание:
Создайте класс "Владелец" (Task1.Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот"
и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида
"Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".*/

public class Cat {
    private String name;
    private int age;
    private String ownerName;
    public Cat(){
        name = "CatName";
        age = 0;
    }

    public Cat(String name, int age, String ownerName){
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.%n", name, age, ownerName);
    }
}
