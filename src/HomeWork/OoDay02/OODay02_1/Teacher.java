package HomeWork.OoDay02.OODay02_1;

public class Teacher extends Person {
    public int salary;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public void teach() {
        System.out.println("家住" + address + "的" + age + "岁的" + name + "是老师工资为" + salary);
    }

    @Override
    public void sayHi() {
        System.out.println("工资为" + salary);
    }
}
