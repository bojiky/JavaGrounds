package com.example.enemies;
import com.example.Enemy;

public class Zombie extends Enemy {
    private static final double resurrectChance = 0.5;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);

        if (!isAlive()) {
            resurrect();
        }
    }

    private void resurrect() {
        if (Math.random() < resurrectChance) {
            setHealth(getMaxHealth()/2);
            System.out.println("Зомби возродился!");
        } else {
            System.out.println("Зомби не смог возродиться.");
        }
    }

    @Override
    public int dealDamage() {
        return (int) (super.dealDamage() * 1.2);
    }
}