package OODay02;

class People {
    public static void main(String[] args) {
        Person zl = new Doctor("张力", '男', 22, 5000);
        Person xwh = new Teacher("熊文浩", '男', 24, 10000);
        Person mft = new Parent();
        introduction(zl);
        introduction(xwh);
        introduction(mft);
    }

    public static void introduction(Person name) {
        name.hello();
        name.eatFood();
        name.sleep();
        name.work();
        name.salary();
        System.out.println();
    }
}
