package OODay02;

public class Parent extends Person {
    protected int childNum;

    Parent() {
        super();
        childNum = 0;
    }

    Parent(String name, char sex, int age, int childNum) {
        super(name, sex, age);
        this.childNum = childNum;
    }

    @Override
    void work() {
        System.out.println("一般没有工作···");
    }

    @Override
    void salary() {
        System.out.println("有" + childNum + "个孩子···");
    }

}
