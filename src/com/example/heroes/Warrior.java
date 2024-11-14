package com.example.heroes;

import com.example.Enemy;
import com.example.Mortal;
import com.example.Hero;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name, 15); // 15 damage points for warrior
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive()) {
            int dealtDamage = dealDamage();
            System.out.println(getName() + " наносит удар мечом на " + dealtDamage + " урона!");
            enemy.takeDamage(dealtDamage);
        }
    }
}
