/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabgaru
 */
public class CPU {

    private LinkedList<Characters> Winners;
    private SO SOPointer;
    private Boolean HaveaWinner;
    MainUI main;
    String status = "";

    public CPU(SO Pointer) {
        this.Winners = new LinkedList();
        this.SOPointer = Pointer;
        this.HaveaWinner = false;
    }

    public LinkedList<Characters> getWinners() {
        return Winners;
    }

    public void SelectConditions(Characters Fighter1, Characters Fighter2) throws InterruptedException {
        Random rand = new Random();
        int prob = rand.nextInt(101);
//        System.out.println(prob);
//        System.out.println(Fighter1);
//        System.out.println(Fighter2);
        setStatus("Decidiedo");
        this.main.changeAIStatus(getStatus());
        if (Fighter1.getSaga()) {
            this.main.setNanmeStarWars(Fighter1);
            this.main.setNanmeStarTrek(Fighter2);
        } else {
            this.main.setNanmeStarTrek(Fighter1);
            this.main.setNanmeStarWars(Fighter2);
        }
        //Thread.sleep(5000 / 3);
        if (Fighter1 != null && Fighter2 != null) {
            if (27 < prob && prob <= 67) {
                //Ejecutar selector de ganador
                this.win(Fighter1, Fighter2);
                this.SOPointer.StartRound();
                //System.out.println("Combate"+"\n");
            }
            if (prob <= 27) {
                //Condicion de empate
                //Se iran a la cola de nuevo, con prioridad 1
                Fighter1.setPriority(1);
                Fighter2.setPriority(1);
                //System.out.println("Empate");
                this.SOPointer.add1toQueue(Fighter1);
                this.SOPointer.add1toQueue(Fighter2);
                //System.out.println("Empate"+"\n");
                this.SOPointer.StartRound();
            }
            if (67 < prob && prob <= 100) {
                //Condicion de cola 
                //Se iran a la cola de entrenamiento
                //System.out.println("Entrenamiento"+"\n");
                Fighter1.setPriority(4);
                Fighter2.setPriority(4);
                //System.out.println("No estan listos");
                this.SOPointer.add1toQueue(Fighter1);
                this.SOPointer.add1toQueue(Fighter2);
                this.SOPointer.StartRound();
            }
        } else {
            System.out.println("Upa, paso uno null" + "\n");
            System.out.println(Fighter1);
            System.out.println(Fighter2);
        }
    }

    public MainUI getMain() {
        return main;
    }

    public void setMain(MainUI main) {
        this.main = main;
    }
    
    
    private void win(Characters c1, Characters c2){
        //Variable del primero
        boolean c1first=false;
        Boolean saga=null;
        Random rand= new Random();
        //Damage de c/u
        int Dmgc1=c1.getStrength()+c1.getStrength()*(c1.getSkills()/100);
        int Dmgc2=c2.getStrength()+c2.getStrength()*(c2.getSkills()/100);
        
        //Decidir el primero
        if (c1.getAgility()>c2.getAgility()){
            c1first=true;
        }
        if (c1.getAgility()==c2.getAgility()){
            c1first=rand.nextBoolean();
        }
        
        //Combate
        while (true){
            if(c1first){
                c2.setHealth(c2.getHealth()-Dmgc1);
                //Muelto o no
                if(c2.getHealth()<=0){
                    this.Winners.add(c1);
                    saga=c1.getSaga();
                    break;
                }
            }else{
                c1.setHealth(c1.getHealth()-Dmgc2);
                //Muelto o no
                if(c1.getHealth()<=0){
                    saga=c2.getSaga();
                    this.Winners.add(c2);
                    break;
                }
            }
        }
        if(saga){
            main.setStarWars();
        }else{
            main.setStarTrek();
        }   
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printWinners() {
        LinkedList<Characters> winners = getWinners(); // Obtener la lista de ganadores

        if (winners.isEmpty()) {
            System.out.println("No hay ganadores en la lista.");
            return;
        }

        System.out.println("Lista de ganadores:");
        for (Characters winner : winners) {
            System.out.println("- " + winner.getNombre()); // Asumiendo que getNombre() devuelve el nombre
        }
    }
}
