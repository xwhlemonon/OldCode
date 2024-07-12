package OODay03;

public class RefArrayDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Chick("茧子", 2, "红"), new Dog("张力", 1, "绿"), new Fish("熊文浩", 2, "红")};
        for (int i = 0; i < 3; i++) {
            animals[i].drink();
        }

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小绿", 1, "绿");
        dogs[1] = new Dog("小黄", 2, "黄");
        dogs[2] = new Dog("小红", 3, "红");

        Chick[] chicks = new Chick[2];
        chicks[0] = new Chick("小绿", 1, "绿");
        chicks[1] = new Chick("小黄", 2, "黄");

        Fish[] fish = new Fish[4];
        fish[0] = new Fish("小绿", 1, "绿");
        fish[1] = new Fish("小黄", 2, "黄");
        fish[2] = new Fish("小红", 3, "红");
        fish[3] = new Fish("小紫", 3, "紫");
    }
}
