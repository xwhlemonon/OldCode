package com.rpg.port;

public class Role {
    protected int hp;
    protected int atk;
    protected double def;
    protected int drugNum;

    public Role() {
        hp = 100;
        atk = 20;
        def = 0.3;
        drugNum = 0;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public double getDef() {
        return def;
    }

    public int getDrugNum() {
        return drugNum;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public void setDrug(int drugNum) {
        this.drugNum = drugNum;
    }

    public void attackEnemy(Role role) {
        int damage = (int) (this.atk * (1 - role.getDef())) + 1;
        role.setHp(role.getHp() - damage);
    }

    public void useDrug(Drug drug) {
        if (this.drugNum > 0) {
            this.hp += drug.getValue();
            this.drugNum -= 1;
        } else {
            System.out.println("药物不足···");
        }
    }
}
