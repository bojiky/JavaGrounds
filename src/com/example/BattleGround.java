package com.example;

import com.example.enemies.Goblin;
import com.example.heroes.Warrior;
import com.example.enemies.Zombie;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Боб");
        Enemy enemy = new Goblin(100);

        while (enemy.isAlive()) {
            System.out.println("\nТекущее состояние:");
            System.out.println("Здоровье " + hero.getName() + " : " + hero.getHealth());
            System.out.println("Здоровье врага: " + enemy.getHealth());

            hero.attackEnemy(enemy);

            if (!hero.isAlive()) {
                System.out.println(hero.getName() + " погибает!");
                break;
            }

            if (enemy.isAlive()) {
                System.out.println("Враг контратакует!");
                int dealtDamage = enemy.dealDamage();
                hero.takeDamage(dealtDamage);
                System.out.println("Герой получает " + dealtDamage + " урона!");
            } else {
                System.out.println("Враг повержен!");
            }
        }
    }
}