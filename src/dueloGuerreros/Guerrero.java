package dueloGuerreros;

import java.util.Random;

public class Guerrero {

    int attack;
    int defense;
    int lifePoints;
    String name;
    int speed;
    int dexterity;

    public Guerrero(int attack, int defense, int lifePoints, String name, int speed, int dexterity) {

        this.attack = attack;
        this.defense = defense;
        this.lifePoints = lifePoints;
        this.name = name;
        this.speed = speed;
        this.dexterity = dexterity;
    }

    public void showStats() {

        System.out.printf("\nNombre: %s\nVida: %d\nAtaque: %d\nDefensa: %d\nVelocidad: %d\nDestreza: %d\n",this.name, this.lifePoints, this.attack, this.defense, this.speed, this.dexterity);
    }

    public void atacar(Guerrero oponente) {
        Random random = new Random();
        int numeroRandom = random.nextInt(101);

        if (oponente.isAlive() == false) {
            System.out.printf("\n%s ya no puede atacar a %s porque está muerto", this.name, oponente.getName());
            return;
        } else {
            if (numeroRandom <= this.dexterity) {
                int damage = this.getAttack() - oponente.getDefense();
                if (damage <= 0) {
                    System.out.println("La defensa del enemigo es demasiado alta!");
                    return;
                } else {
                    int lifeBeforeAttack = oponente.getLifePoints() - damage;
                    oponente.setLifePoints(lifeBeforeAttack);
                    if (oponente.getLifePoints() <= 0) {
                        oponente.setLifePoints(0);
                    }
                    System.out.printf("\n%s ha realizado %d puntos de daño a %s y le queda %d de vida", this.name, damage, oponente.getName(), oponente.getLifePoints());
                }
            } else {
                System.out.printf("\n%s fallaste la tirada de destreza y fallaste el ataque", this.name);
            }
        }
    }

    public boolean isAlive() {

        if (this.getLifePoints() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getLifePoints() {
        return lifePoints;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

}
