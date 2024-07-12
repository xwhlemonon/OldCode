package HomeWork.OoDay02.OODay02_1;

public class Student extends Person {
    public String className;
    public String stuId;

    public Student() {
        super();
    }

    public Student(String name, int age, String address, String className, String stuId) {
        super(name, age, address);
        this.className = className;
        this.stuId = stuId;
    }

    public void study() {
        System.out.println(className + "班，学号" + stuId + "的" + age + "岁" + "，家住" + address + "的" + name + "在学习···");
    }

    @Override
    public void sayHi() {
        System.out.println("我是" + className + "班的学号" + stuId);
    }
}
