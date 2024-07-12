package HomeWork.OoDay03.OODay03_2;

import HomeWork.OoDay03.OODay03_1.Animal;
import HomeWork.OoDay03.OODay03_1.Dog;
import HomeWork.OoDay03.OODay03_1.Fish;

public class OODay03_2 {
    public static void main(String[] args) {
        Animal[] dogs = new Dog[3];
        dogs[0] = new Dog("莫子", 2.1, "彩虹");
        dogs[1] = new Dog("茧子", 2.5, "绿");
        dogs[2] = new Dog("陈子", 2.0, "黄");

        Animal[] chicks = {
                new Fish("许子", 2.5, "橙"),
                new Fish("徐子", 2.4, "紫")
        };

        Animal[] fish;
        fish = new Fish[1];
        fish[0] = new Fish("张子", 2.1, "红");

        for (int i = 0; i < dogs.length; i++) {
            ((Dog) dogs[i]).swim();
        }
    }
}
