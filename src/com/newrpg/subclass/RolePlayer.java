package com.newrpg.subclass;

import com.newrpg.face.UseDrug;
import com.newrpg.superclass.Role;

import java.util.Random;

public class RolePlayer extends Role implements UseDrug {
    private byte drugNum;

    public RolePlayer() {
        setHp(10000);
        setAtk(2500);
        setDef(0.3);
        drugNum = (byte) 3;
    }

    public byte getDrugNum() {
        return drugNum;
    }

    @Override
    public void useDrug(Drug drug) {
        if (drugNum > 0) {
            Random random = new Random();
            int temp = (int) (drug.curativeDose * ((random.nextInt(41) + 80) / 100.0));
            setHp(getHp() + temp);
            System.out.println();
            System.out.println("已回复" + temp);
            drugNum--;
        } else {
            System.out.println();
            System.out.println("药已用光");
        }
    }
}
