package OODay02;

public class Teacher extends Person {
    protected int salary;

    Teacher() {
        super();
        salary = 0;
    }

    Teacher(String name, char sex, int age, int salary) {
        super(name, sex, age);
        this.salary = salary;
    }

    @Override
    void work() {
        System.out.println("工作是教人···");
    }

    @Override
    void salary() {
        System.out.println("工资是：" + salary);
    }

}
