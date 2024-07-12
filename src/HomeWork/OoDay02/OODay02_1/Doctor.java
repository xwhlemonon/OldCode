package HomeWork.OoDay02.OODay02_1;

public class Doctor extends Person {
    public String title;

    public Doctor() {
        super();
    }

    public Doctor(String name, int age, String address, String title) {
        super(name, age, address);
        this.title = title;
    }

    public void cut() {
        System.out.println("家住" + address + "的" + age + "岁的" + name + "，标题为" + title);
    }
}
