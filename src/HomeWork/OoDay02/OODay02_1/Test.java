package HomeWork.OoDay02.OODay02_1;

public class Test {
    public static void main(String[] args) {
        Person zl = new Person("张力", 24, "厕所");
        Student zlStudent = new Student("张力", 24, "厕所", "达内教学班", "604");
        Teacher zlTeacher = new Teacher("张力", 24, "厕所", 1000);
        Doctor zlDoctor = new Doctor("张力", 24, "厕所", "鸿福诊所");
        zl.eat();
        zl.sleep();
        zl.sayHi();
        zlStudent.study();
        zlStudent.sayHi();
        zlTeacher.teach();
        zlTeacher.sayHi();
        zlDoctor.cut();
    }
}
