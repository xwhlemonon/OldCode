package com.tedu.system.person;

import com.tedu.system.face.EditBook;

public class ProjectManager extends Person implements EditBook {
    public ProjectManager() {
    }

    public ProjectManager(String name, int age, int salary) {
        this.name = name;
        this.age = (byte) age;
        this.salary = salary;
    }

    public void editBook(Person person) {
        System.out.println(person.name + "设计了书籍");
    }

    @Override
    public void finishWork(Person person) {
        System.out.println(person.name + "完成了工作");
    }
}
