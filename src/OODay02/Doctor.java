package OODay02;

public class Doctor extends Person {
    protected int salary;

    Doctor() {
        super();
        salary = 0;
    }

    Doctor(String name, char sex, int age, int salary) {
        super(name, sex, age);
        this.salary = salary;
    }

    @Override
    void work() {
        System.out.println("工作是治病···");
    }

    @Override
    void salary() {
        System.out.println("工资是：" + salary);
    }
}
