package day07;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("班上有几个学生：");
        int size = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[size];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("请输入第" + (i + 1) + "名学生姓名：");
            students[i].setName(scanner.nextLine());
            System.out.println("请输入第" + (i + 1) + "名学生年龄：");
            students[i].setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("请输入第" + (i + 1) + "名学生班级名称：");
            students[i].setClassName(scanner.nextLine());
            System.out.println("请输入第" + (i + 1) + "名学生学号：");
            students[i].setStuId(scanner.nextLine());
        }
        for (Student student : students) {
            System.out.print(student.getName() + "\t");
            System.out.print(student.getAge() + "\t");
            System.out.print(student.getClassName() + "\t");
            System.out.println(student.getStuId() + "\t");
        }
    }
}
