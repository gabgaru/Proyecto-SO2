/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author gabgaru
 */
public class SO {

    //Cambiar para usar las colas de prioridad de java
    private int CharactersChecked;
    private ArrayList<Characters> StarWarsQueue1;
    private ArrayList<Characters> StarWarsQueue2;
    private ArrayList<Characters> StarWarsQueue3;
    private ArrayList<Characters> StarWarsTrainingQueue;
    private ArrayList<Characters> StarTrekQueue1;
    private ArrayList<Characters> StarTrekQueue2;
    private ArrayList<Characters> StarTrekQueue3;
    private ArrayList<Characters> StarTrekTrainingQueue;
    private CPU CPUPointer;
    private int Counter;
    private int STint;
    private int SWint;
    private int prob;
    private MainUI main;

    public SO() {
        Random rand = new Random();
        this.CharactersChecked = 0;
        //Van del 0 al 19
        this.StarWarsQueue1 = new ArrayList();
        this.StarWarsQueue2 = new ArrayList();
        this.StarWarsQueue3 = new ArrayList();
        this.StarWarsTrainingQueue = new ArrayList();
        this.StarTrekQueue1 = new ArrayList();
        this.StarTrekQueue2 = new ArrayList();
        this.StarTrekQueue3 = new ArrayList();
        this.StarTrekTrainingQueue = new ArrayList();
        this.CPUPointer = null;
        this.Counter = 2;
        this.STint = 20;
        this.SWint = 20;
        this.prob=rand.nextInt(101);
    }
    private void prueba(){
        //Revisar si sale o no un personaje de la cola de entrenamiento
        if (prob<=40&&this.StarTrekTrainingQueue.isEmpty()==false&&this.StarWarsTrainingQueue.isEmpty()==false){
            Characters Actual1=this.StarTrekTrainingQueue.removeFirst();
            Characters Actual2=this.StarWarsTrainingQueue.removeFirst();
            Actual1.setPriority(1);
            Actual2.setPriority(1);
            this.add1toQueue(Actual1);
            this.add1toQueue(Actual2);
        }
    }
    public void StartRound() throws InterruptedException {
        Characters Fighter1 = null;
        Characters Fighter2 = null;
        //Agregar nuevos jugadores para este ciclo
        if (this.Counter <= 0 && prob <= 80) {
            this.add1toQueue(new Characters(this.SWint + 1, true));
            this.SWint++;
//            System.out.println(this.SWint);
            this.add1toQueue(new Characters(this.STint + 1, false));
//            System.out.println("Nuevos jugadones agregados" + "\n");
            this.STint++;
            this.Counter = 2;
        } else {
            this.Counter--;
        }
        prueba();
        //Para el primer peleador
        if (this.StarTrekQueue1.isEmpty()) {
            //Revisar si la lista 2 esta vacia
            if (this.StarTrekQueue2.isEmpty()) {
                //Revisar si la lista 3 esta vacia
                if (this.StarTrekQueue3.isEmpty()) {
//                    System.out.println("Se han acabado todos los elementos de la lista 3, pasando elemnto de la lis training");
                    if (this.StarTrekTrainingQueue.isEmpty()) {
//                        System.out.println("Ya no hay nada");
                    } else {
//                        System.out.println("F1 Sacando elemento de la lista de entrenamiento");
                        Fighter1 = this.StarTrekTrainingQueue.removeFirst();
                    }//Saca elemento de la lista de entrenamiento
                } else {
//                    System.out.println("F1 Sacando elemento de la lista 3");
                    Fighter1 = this.StarTrekQueue3.removeFirst();
                }//Saca elemento de la lista 3
            } else {
//                System.out.println("F1 Sacando elemento de la lista 2");
                Fighter1 = this.StarTrekQueue2.removeFirst();
            }//Saca elemento de la lista 2
        } else {
//            System.out.println("F1 Sacando elemento de la lista 1");
            Fighter1 = this.StarTrekQueue1.removeFirst();
        }//Saca elemento de la lista 1
        //Para el segundo peleador
        if (this.StarWarsQueue1.isEmpty()) {
            //Revisar si la lista 2 esta vacia
            if (this.StarWarsQueue2.isEmpty()) {
                //Revisar si la lista 3 esta vacia
                if (this.StarWarsQueue3.isEmpty()) {
//                    System.out.println("Se han acabado todos los elementos de la lista 3, pasando elemnto de la lis training");
                    if (this.StarWarsTrainingQueue.isEmpty()) {
//                        System.out.println("Ya no hay nada");
                    } else {
//                        System.out.println("F2 Sacando elemento de la lista de entrenamiento" + "\n");
                        Fighter2 = this.StarWarsTrainingQueue.removeFirst();
                    }//Saca elemento de la lista de entrenamiento
                } else {
//                    System.out.println("F2 Sacando elemento de la lista 3" + "\n");
                    Fighter2 = this.StarWarsQueue3.removeFirst();
                }//Saca elemento de la lista 3
            } else {
//                System.out.println("F2 Sacando elemento de la lista 2" + "\n");
                Fighter2 = this.StarWarsQueue2.removeFirst();
            }//Saca elemento de la lista 2
        } else {
//            System.out.println("F2 Sacando elemento de la lista 1" + "\n");
            Fighter2 = this.StarWarsQueue1.removeFirst();
        }//Saca elemento de la lista 1

        if (Fighter1 == null && Fighter2 == null) {
            //System.out.println("No hay mas procesos, fin del programa.");
            //System.out.println(this.StarTrekQueue1.size()+","+this.StarTrekQueue2.size()+","+this.StarTrekQueue3.size()+","+this.StarTrekTrainingQueue.size()+","+this.StarWarsQueue1.size()+","+this.StarWarsQueue2.size()+","+this.StarWarsQueue3.size()+","+this.StarWarsTrainingQueue.size());
            System.out.println("\nGanadores\n");
            for (int i=0;i<=this.CPUPointer.getWinners().size();i++){
                Characters Actual=this.CPUPointer.getWinners().poll();
                String saga;
                if (Actual.getSaga()){saga="Star Wars";}else{saga="Star Trek";}
                System.out.println("Peleador #"+Actual.getID()+" Nombre: "+Actual.getNombre()+" Saga: "+saga);
            }
        } else {
            //1 start wars 2 star trek
            if((Fighter1.getSaga()&&Fighter2.getSaga())||(Fighter1.getSaga()==false&&Fighter2.getSaga()==false)){System.out.println("ERROR, NO PUEDEN SER DE LO MISMOOO");}
            if(Fighter1.getSaga()){
                this.main.setNanmeStarWars(Fighter1);
                this.main.setNanmeStarTrek(Fighter2);
            }else{
                this.main.setNanmeStarTrek(Fighter1);
                this.main.setNanmeStarWars(Fighter2);
            }
            this.CPUPointer.SelectConditions(Fighter1, Fighter2);
        }
    }

    public void SetCPUPointer(CPU pointer) {
        this.CPUPointer = pointer;
    }

    public void updatePcounter() {
        for (int i = 0; i <= this.StarTrekQueue1.size(); i++) {
            Characters Actual = this.StarTrekQueue1.get(i);
            Actual.setClock(Actual.getClock() + 1);

        }
        for (int i = 0; i <= this.StarTrekQueue2.size(); i++) {
            Characters Actual = this.StarTrekQueue2.get(i);
            Actual.setClock(Actual.getClock() + 1);
        }
        for (int i = 0; i <= this.StarTrekQueue3.size(); i++) {
            Characters Actual = this.StarTrekQueue3.get(i);
            Actual.setClock(Actual.getClock() + 1);
        }
        for (int i = 0; i <= this.StarWarsQueue1.size(); i++) {
            Characters Actual = this.StarWarsQueue1.get(i);
            Actual.setClock(Actual.getClock() + 1);
        }
        for (int i = 0; i <= this.StarWarsQueue2.size(); i++) {
            Characters Actual = this.StarWarsQueue2.get(i);
            Actual.setClock(Actual.getClock() + 1);
        }
        for (int i = 0; i <= this.StarWarsQueue3.size(); i++) {
            Characters Actual = this.StarWarsQueue3.get(i);
            Actual.setClock(Actual.getClock() + 1);
        }
    }

    public MainUI getMain() {
        return main;
    }

    public void setMain( MainUI main) {
        this.main = main;
    }

    public void add1toQueue(Characters C1) {
        int Queue = C1.getPriority();
        if (C1.getSaga()==true) {
          
            switch (Queue) {
                case 1:
                    this.StarWarsQueue1.add(C1);
                    break;
                case 2:
//                System.out.println("Se salio el personaje C: "+C1.getID()+" Caso: "+Queue);
                    this.StarWarsQueue2.add(C1);
                    break;
                case 3:
                    this.StarWarsQueue3.add(C1);
                    break;
                case 4:
                    this.StarWarsTrainingQueue.add(C1);
                    break;
            }
        } else {

            switch (Queue) {
                
                case 1:
                    this.StarTrekQueue1.add(C1);
                    break;
                case 2:
//                System.out.println("Se salio el personaje C: "+C1.getID()+" Caso: "+Queue);
                    this.StarTrekQueue2.add(C1);
                    break;
                case 3:
                    this.StarTrekQueue3.add(C1);
                    break;
                case 4:
                    this.StarTrekTrainingQueue.add(C1);
                    break;
            }

        }
    }

    public void printQueue1() {
        System.out.println(this.StarWarsQueue1);
        System.out.println(this.StarTrekQueue1);
        System.out.println("Tamano de SW: " + this.StarWarsQueue1.size());
        System.out.println("Tamano de ST: " + this.StarTrekQueue1.size());
    }

   

    public Characters peek(int Queue, Boolean Saga) {
        switch (Queue) {
            case 1:
                if (Saga) {
                    return (this.StarWarsQueue1.getFirst());
                } else {
                    return (this.StarTrekQueue1.getFirst());
                }
            case 2:
                if (Saga) {
                    return (this.StarWarsQueue2.getFirst());
                } else {
                    return (this.StarTrekQueue2.getFirst());
                }
            case 3:
                if (Saga) {
                    return (this.StarWarsQueue3.getFirst());
                } else {
                    return (this.StarTrekQueue3.getFirst());
                }
            case 4:
                if (Saga) {
                    return (this.StarWarsTrainingQueue.getFirst());
                } else {
                    return (this.StarTrekTrainingQueue.getFirst());
                }
        }
        System.out.println("Error, el caso no fue admitido");
        return (null);
    }

    public Characters poll(int Queue, Boolean Saga) {
        switch (Queue) {
            case 1:
                if (Saga) {
                    return (this.StarWarsQueue1.removeFirst());
                } else {
                    return (this.StarTrekQueue1.removeFirst());
                }
            case 2:
                if (Saga) {
                    return (this.StarWarsQueue2.removeFirst());
                } else {
                    return (this.StarTrekQueue2.removeFirst());
                }
            case 3:
                if (Saga) {
                    return (this.StarWarsQueue3.removeFirst());
                } else {
                    return (this.StarTrekQueue3.removeFirst());
                }
            case 4:
                if (Saga) {
                    return (this.StarWarsTrainingQueue.removeFirst());
                } else {
                    return (this.StarTrekTrainingQueue.removeFirst());
                }
        }
        System.out.println("Error, el caso no fue admitido");
        return (null);
    }

}
