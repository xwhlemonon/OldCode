package day07;

class Student {
    private String name;
    private int age;
    private String className;
    private String stuId;

    public Student() {
        name = null;
        age = 0;
        className = null;
        stuId = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public String getStuId() {
        return stuId;
    }
}

class StudentEx extends Student {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getClassName() {
        return super.getClassName();
    }

    @Override
    public String getStuId() {
        return super.getStuId();
    }
}
