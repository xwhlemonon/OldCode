package com.tedu.system.person;

public class TeacherChargeClass extends Person {
    public TeacherChargeClass() {
    }

    public TeacherChargeClass(String name, int age, int salary) {
        this.name = name;
        this.age = (byte) age;
        this.salary = salary;
    }

    @Override
    public void finishWork(Person person) {
        System.out.println(person.name + "完成了工作");
    }
}
