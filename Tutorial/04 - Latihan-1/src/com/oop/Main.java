package com.oop;

// player
class Player{
    String name;
    double health;
    int level;

    // object memberb
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        
        // akan mengambil demage attack
        double demage;
        if(this.armor.defencePower < attackPower){
            demage = attackPower - this.armor.defencePower;
        } else {
            demage = 0;
        }

        this.health -= demage;
        System.out.println(this.name + " gets demage " + attackPower);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        this.weapon.display();
        this.armor.display();
    }
}

// weapon
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.attackPower = attackPower;
        this.name = name;
    }

    void display(){
        System.out.println("Weapon : " + this.name + ", attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.defencePower = defencePower;
        this.name = name;
    }

    void display(){
        System.out.println("Armor : " + this.name + ", defence : " + this.defencePower);
    }
}


public class Main{
    public static void main(String[] args){
        Player player1 = new Player("Adi", 100);
        Player player2 = new Player("Ahmad", 90);

        // membuat object waepon 
        Weapon pedang = new Weapon("pedang", 15);
        Weapon tombak = new Weapon("tombak", 25);

        // membuat object armor
        Armor bajuBesi = new Armor("baju Besi",10);
        Armor goldenHelment = new Armor("golden helment",40);

        // equip senjata dan armor
        // player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();
        
        // player 2
        player2.equipWeapon(tombak);
        player2.equipArmor(goldenHelment);
        player2.display();
        
        System.out.println("\nPertempuran");
        System.out.println("================================");
        System.out.println("\nEpisode - 1\n");
        System.out.println("============================================");
        player1.attack(player2);
        player1.display();
        player2.display();
        
        System.out.println("\nEpisode - 2\n");
        System.out.println("============================================");
        player2.attack(player1);
        player1.display();
        player2.display();



    }
}