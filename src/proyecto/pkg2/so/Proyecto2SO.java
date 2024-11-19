/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2.so;

import javax.swing.JFrame;
/**
 *
 * @author gabgaru
 */
public class Proyecto2SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //True StarWars
        //False StarTrek
         MainUI main = new MainUI();
        main.setVisible(true);
        SO TestSO= new SO();
        CPU TestCPU=new CPU(TestSO);
        TestCPU.setMain(main);
        TestSO.SetCPUPointer(TestCPU);

        for ( int i=0;i<21;i++){
            TestSO.add1toQueue(new Characters(i,true));
        }
        for ( int i=0;i<21;i++){
            TestSO.add1toQueue(new Characters(i+21,false));
        }
       
        TestSO.setMain(main);
        TestSO.StartRound();
    }
    
}

