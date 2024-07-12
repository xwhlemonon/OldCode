package com.tedu.system.person;

import com.tedu.system.face.EditBook;
import com.tedu.system.face.SolveProblem;
import com.tedu.system.face.TrainEnterpriseEmployees;

public class Lecturer extends Person implements SolveProblem, TrainEnterpriseEmployees, EditBook {
    public Lecturer() {
    }

    public Lecturer(String name, int age, int salary) {
        this.name = name;
        this.age = (byte) age;
        this.salary = salary;
    }

    public void solveProblem(Person person) {
        System.out.println(person.name + "解决了企业问题");
    }

    public void trainEnterpriseEmployees(Person person) {
        System.out.println(person.name + "培训了企业员工");
    }

    public void editBook(Person person) {
        System.out.println(person.name + "编辑了书籍");
    }

    @Override
    public void finishWork(Person person) {
        System.out.println(person.name + "完成了工作");
    }
}
