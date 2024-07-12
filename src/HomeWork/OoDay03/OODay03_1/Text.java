package HomeWork.OoDay03.OODay03_1;

public class Text {
    public static void main(String[] args) {
        Animal dog = new Dog("海盗狗", 2, "黑白");
        Animal chick = new Chick("坤坤", 2.5, "黑白");
        Animal fish = new Fish("大鲤鱼", 2, "红白");
        dog.drink();
        dog.eat();
        ((Dog) dog).swim();
        ((Dog) dog).lookHome();
        chick.drink();
        chick.eat();
        ((Chick) chick).layEggs();
        fish.drink();
        fish.eat();
        ((Fish) fish).swim();
    }
}
