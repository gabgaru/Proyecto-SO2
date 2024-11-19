/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JFrame;
/**
 *
 * @author gabgaru
 */
public class CPU {
    private LinkedList<Characters> Winners;
    private SO SOPointer;
    private Boolean HaveaWinner;
    MainUI main;
    
    public CPU(SO Pointer){
        this.Winners= new LinkedList();
        this.SOPointer=Pointer;
        this.HaveaWinner=false;
    }

    public LinkedList<Characters> getWinners() {
        return Winners;
    }
    
    public void SelectConditions(Characters Fighter1, Characters Fighter2) {
        Random rand = new Random();
        int prob = rand.nextInt(101);
//        System.out.println(prob);
//        System.out.println(Fighter1);
//        System.out.println(Fighter2);
        if (Fighter1 != null && Fighter2 != null) {
            if (27 < prob && prob <= 67) {
                //Ejecutar selector de ganador
                //System.out.println("Combate");
                this.SelectWinner2(Fighter1, Fighter2);
                //System.out.println("Combate"+"\n");
            }
            if (prob <= 27) {
                //Condicion de empate
                //Se iran a la cola de nuevo, con prioridad 1
                Fighter1.setPriority(1);
                Fighter2.setPriority(1);
                //System.out.println("Empate");
                this.SOPointer.add2toQueue(Fighter1, Fighter2);
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
                this.SOPointer.add2toQueue(Fighter1, Fighter2);
                this.SOPointer.StartRound();
            }
        }else{
            System.out.println("Upa, paso uno null"+"\n");
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
    
    //Esta mal hecho hay q arreglarlo
    private void SelectWinner2(Characters C1, Characters C2){
        int AgilityDiff=0;
        Characters R1=null;
        Characters R2=null;
        if (C2.getAgility()>C2.getAgility()){
            AgilityDiff= C2.getAgility()-C2.getAgility();
            R1=C2;
            R2=C2;
        }else{
            AgilityDiff= C2.getAgility()-C2.getAgility();
            R1=C2;
            R2=C2;
        }
        while(R1.getHealth()>0 || R2.getHealth()>0){
            //System.out.println("Vida 1: "+R1.getHealth()+" Vida 2: "+R2.getHealth());
            //El primero ataca si no murio
            if (R1.getHealth()>0){
//                System.out.println("El combatiente 1 ataca!, Damage: ");
                R2.setHealth(R2.getHealth()-R1.getStrength());
            }else{
                main.setStarTrek();
                this.Winners.add(R2);
                
//                System.out.println("Ha ganado el combatiente 2 (ID: "+R2.getID()+")");
            }
            //El segundo ataca si no murio
            if (R2.getHealth()>0){
//                System.out.println("El combatiente 2 ataca!");
                R1.setHealth(R1.getHealth()-(R2.getStrength()*(R2.getSkills()/100)-AgilityDiff));
            }else{
                main.setStarWars();
                this.Winners.add(R1);
//                System.out.println("Ha ganado el combatiente 1 (ID: "+R1.getID()+")");
            }
        }
//        this.SOPointer.updatePcounter();
        this.SOPointer.StartRound();
    }
    
    private void SelectWinner(Characters Fighter1, Characters Fighter2){
        int AgilityDiff=0;
        Random rand= new Random();
        Boolean FirstTurn=false;
        if (Fighter1.getAgility()>Fighter2.getAgility()){
            AgilityDiff= Fighter1.getAgility()-Fighter2.getAgility();
            FirstTurn=true;
        }
        if (Fighter1.getAgility()<Fighter2.getAgility()){
            AgilityDiff= Fighter2.getAgility()-Fighter1.getAgility();
        }
        if (Fighter1.getAgility()==Fighter2.getAgility()){
            AgilityDiff=0;
            if (rand.nextBoolean()){
                FirstTurn=true;
            }
        }
        //Rondas 3
        while (Fighter1.getHealth()>0 || Fighter2.getHealth()>0){
            if(FirstTurn){
                //Atacante 1 empieza el turno
                Fighter2.setHealth(Fighter2.getHealth()-(Fighter1.getStrength()*(Fighter1.getSkills()/100))-AgilityDiff);
                int damage=Fighter2.getHealth()-(Fighter1.getStrength()*(Fighter1.getSkills()/100));
                if (Fighter2.getHealth()<=0){
                Winners.add(Fighter1);
                this.HaveaWinner=true;
                break;}   
//                System.out.println("El combatiente 2 (ID"+Fighter2.getID()+ ")ha resisido el ataque, vida: "+Fighter2.getHealth()+" Dano recibido: "+damage);
                //Atacante 2 continua el turno
                Fighter1.setHealth(Fighter2.getHealth()-(Fighter2.getStrength()*(Fighter2.getSkills()/100)-AgilityDiff));
                if (Fighter1.getHealth()<=0){
                Winners.add(Fighter2);
                this.HaveaWinner=true;
                break;}
//                System.out.println("El combatiente 1 (ID"+Fighter1.getID()+ ")ha resisido el ataque, vida: "+Fighter1.getHealth());
            }else{
                //Atacante 2 empieza el turno
                Fighter1.setHealth(Fighter2.getHealth()-(Fighter2.getStrength()*(Fighter2.getSkills()/100))-AgilityDiff);
                if (Fighter1.getHealth()<=0){
                Winners.add(Fighter2);
                this.HaveaWinner=true;
                break;}
//                System.out.println("El combatiente 1 (ID"+Fighter1.getID()+ ")ha resisido el ataque, vida: "+Fighter1.getHealth());
                //Atacante 1 contiuna el turno
                Fighter2.setHealth(Fighter2.getHealth()-(Fighter1.getStrength()*(Fighter1.getSkills()/100)-AgilityDiff));
                if (Fighter2.getHealth()<=0){
                Winners.add(Fighter1);
                this.HaveaWinner=true;
                break;}
//                System.out.println("El combatiente 2 (ID"+Fighter2.getID()+ ")ha resisido el ataque, vida: "+Fighter2.getHealth());
            }
        }
        if (HaveaWinner==null){
//            System.out.println("Empate tecnico, se decidira al ganador");
            //Condicion si no se pudo decirdir el ganador
            if(rand.nextBoolean()){
//                System.out.println("El ganador es el combatiente "+Fighter1.getID());
                this.Winners.add(Fighter1);
            }else{
                this.Winners.add(Fighter2);
//                System.out.println("El ganador es el combatiente "+Fighter2.getID());
            }
        }
    }
}
