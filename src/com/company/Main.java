package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setHealth(600);
        System.out.println(boss.getHealth());
        boss.setDamage(50);
        System.out.println(boss.getDamage());
        boss.setProtectType("Magical!");
        System.out.println(boss.getProtectType());
    }
}
