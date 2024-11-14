package com.example.enemies;
import com.example.Enemy;

public class Goblin extends Enemy {
    private static final double evadeChance = 0.3;

    public Goblin(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        if (Math.random() > evadeChance) {
            super.takeDamage(damage);
        }
        else
            System.out.println("Гоблин уклонился!");
    }

    @Override
    public int dealDamage() {
        return (int) (super.dealDamage());
    }
}