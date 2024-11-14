package com.example.heroes;

import com.example.Enemy;
import com.example.Hero;

public class Mage extends Hero {
    private int mana;

    public Mage(String name) {
        super(name, 8); // 8 damage points for mage
        this.mana = 4;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive()) {
            if (mana > 0) {
                int dealtDamage = dealDamage() * 4;
                enemy.takeDamage(dealtDamage);
                mana--;
                System.out.println(getName() + " кастует заклинание и наносит " + dealtDamage + " урона!");
            }
            else {
                int dealtDamage = dealDamage();
                enemy.takeDamage(dealtDamage);
                System.out.println(getName() + " атакует врага и наносит " + dealtDamage + " урона!");
            }
        }
    }
}
