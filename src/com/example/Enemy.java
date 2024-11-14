package com.example;

public class Enemy implements Mortal {
    private int health;
    private int maxHealth;

    public Enemy(int health) {
        this.health = health;
        this.maxHealth = health;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public int dealDamage() {
        return 10;
    }
}