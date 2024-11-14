package com.example.heroes;

import com.example.Enemy;
import com.example.Hero;

public class Archer extends Hero {
    public Archer(String name) {
        super(name, 18); 
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive()) {
            int dealtDamage = dealDamage();
            enemy.takeDamage(dealtDamage);
            System.out.println(getName() + " выстрелил по врагу и нанёс " + dealtDamage + " урона!");
        }
    }
}
