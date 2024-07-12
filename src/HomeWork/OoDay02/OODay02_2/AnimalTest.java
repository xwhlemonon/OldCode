package HomeWork.OoDay02.OODay02_2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog zl1 = new Dog("张力一号", 2, "绿");
        Dog zl2 = new Dog("张力二号", 2, "绿");
        Dog zl3 = new Dog("张力三号", 2, "绿");
        Chick zl4 = new Chick("张力一号", 1, "绿");
        Chick zl5 = new Chick("张力二号", 1, "绿");
        Chick zl6 = new Chick("张力三号", 1, "绿");
        Fish zl7 = new Fish("张力一号", 1, "绿");
        Fish zl8 = new Fish("张力二号", 1, "绿");
        zl1.drink();
        zl2.eat();
        zl3.lookHome();
        zl4.drink();
        zl5.eat();
        zl6.layEggs();
        zl7.drink();
        zl8.eat();
    }
}
