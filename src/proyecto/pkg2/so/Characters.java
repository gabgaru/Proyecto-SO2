/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

import java.util.Random;

/**
 *
 * @author gabga
 */
public class Characters {

    private Boolean Saga;
    private int ID;
    private int Health;
    private int MaxHealth;
    private int Strength;
    private int Agility;
    private int Skills;
    private int Special;
    private int Priority;
    private int clock;
    private Random rand = new Random();
    private String Nombre;
    private String[] StarWarsCharacters = 
        {"Luke Skywalker", "Darth Vader", "Han Solo", "Princess Leia", "Yoda", "Obi-Wan Kenobi", "Anakin Skywalker", 
        "Padmé Amidala", "Chewbacca", "R2-D2", "C-3PO", "Lando Calrissian", "Boba Fett","Qui-Gon Jinn", "Mace Windu", 
        "Rey Skywalker", "Kylo Ren", "Finn", "Poe Dameron", "Jabba the Hutt"};
    private String[] StarTrekCharacters=
        { "James T. Kirk", "Spock", "Leonard McCoy", "Montgomery Scott", "Nyota Uhura", "Hikaru Sulu", 
        "Pavel Chekov", "Jean-Luc Picard", "William Riker", "Data", "Worf", "Beverly Crusher", "Deanna Troi", "Geordi La Forge", "Benjamin Sisko", "Kathryn Janeway", "Seven of Nine", "T'Pol", "Jonathan Archer", "Quark" };

    public Characters(int id, Boolean saga) {
        int special = 0;
        //Si al menos dos habilidades son excepsionales,entonces el personaje es de calidad, si es una, promedio, si ninguna, deficiente
        if (saga){this.Nombre=StarWarsCharacters[rand.nextInt(20)];}else{this.Nombre=StarTrekCharacters[rand.nextInt(20)];}
        this.ID = id;
        this.Saga = saga;
        this.clock = 8;
        this.Special = -1; 
        //Habilidades se dividen entre 100 y se multiplican a los puntos de ataque
        if (rand.nextInt(101) <= 60) {
            special = 2;
            if (this.Special < 1) {
                this.Special++;
            }
        } else {
            special = 1;
        }
        this.Skills = rand.nextInt(10, 51) * special;
        //Vida se le restan los puntos de ataque del oponente
        if (rand.nextInt(101) <= 70) {
            special = 2;
            if (this.Special < 1) {
                this.Special++;
            }
        } else {
            special = 1;
        }
        this.MaxHealth = rand.nextInt(100, 221) * special + 100;
        this.Health = MaxHealth;
        //Fuerza, se le multiplica la habilidad
        if (rand.nextInt(101) <= 50) {
            special = 2;
            if (this.Special < 1) {
                this.Special++;
            }
        } else {
            special = 1;
        }
        this.Strength = rand.nextInt(50, 101) * special;
        //Agilidad, la diferencia entre las agilidades se resta a los puntos de ataque de aquel con la menor agilidad
        if (rand.nextInt(101) <= 40) {
            special = 2;
            if (this.Special < 1) {
                this.Special++;
            }
        } else {
            special = 1;
        }
        this.Agility = rand.nextInt(1, 101) * special;
        //Prioridad para la cola
        switch (this.Special) {
            case 1:
                this.Priority = 1;
                break;
            case 0:
                this.Priority = 2;
                break;
            case -1:
                this.Priority = 3;
                break;
        }
    }

    public int getHealth() {
        return Health;
    }

    public void setPriority(int NewPrior) {
        if (NewPrior == 0) {
            if (this.Priority != 1) {
                this.Priority++;
            }
        } else {
            this.Priority = NewPrior;
        }

    }

    public int getID() {
        return ID;
    }

    public Boolean getSaga() {
        return Saga;
    }

    public int getClock() {
        return clock;
    }

    public void setHealth(int NewHealth) {
//        System.out.println("Vida anterior: "+this.Health+"; Nueva vida: "+NewHealth);
        this.Health = NewHealth;
    }

    public int getStrength() {
        return Strength;
    }

    public int getAgility() {
        return Agility;
    }

    public int getSkills() {
        return Skills;
    }

    public int getSpecial() {
        return Special;
    }

    public void setClock(int C) {
        this.clock = C;
    }

    public int getPriority() {
        return Priority;
    }

    public String getNombre() {
        return Nombre;
    }
}
