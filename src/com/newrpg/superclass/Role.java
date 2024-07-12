package com.newrpg.superclass;

import com.newrpg.face.Attacked;

import java.util.Random;

public class Role implements Attacked {
    private int hp;
    private int atk;
    private double def;

    public Role() {
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

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(double def) {
        this.def = def;
    }

    @Override
    public void attacked(Role emery) {
        Random random = new Random();
        int inflict = (int) ((atk * ((random.nextInt(41) + 80) / 100.0)) * (1 - emery.getDef()));
        emery.hp -= inflict;
        System.out.println();
        System.out.println("已造成" + inflict);
    }
}
