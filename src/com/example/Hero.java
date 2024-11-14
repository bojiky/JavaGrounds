package com.example;

public abstract class Hero implements Mortal {
    protected String name;
    protected int health;
    protected int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public int dealDamage() {
        return damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}