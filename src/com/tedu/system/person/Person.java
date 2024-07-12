package com.tedu.system.person;

public abstract class Person {
    protected String name;
    protected byte age;
    protected int salary;

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void clockIn(Person person) {
        System.out.println(person.name + "已上班");
    }

    public void clockOut(Person person) {
        System.out.println(person.name + "已下班");
    }

    public abstract void finishWork(Person person);
}
