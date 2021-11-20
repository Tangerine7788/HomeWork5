package com.company;

public class Main {


    public static void main(String[] args) {

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getDamage());
            System.out.println(createHeroes()[i].getHealth());
            System.out.println(createHeroes()[i].getSuperpower());
        }

	Boss boss = new Boss();
    boss.setHealth(600);
        System.out.println(boss.getHealth());
        boss.setDamage(50);
        System.out.println(boss.getDamage());
        boss.setProtectType("Magical!");
        System.out.println(boss.getProtectType());
    }
    public static Hero[] createHeroes() {
        Hero WonderWoman = new Hero(700,70,"super strength");
        Hero SuperGirl = new Hero(500,70,"super speed");
        Hero SuperWoman = new Hero(600,70,"super jump");

        Hero[] heroes ={WonderWoman,SuperWoman,SuperGirl};

        return heroes;
    }
}
