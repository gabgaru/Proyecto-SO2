/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

/**
 *
 * @author gabga
 */
public class Node{ 
    private Characters NextPointer;
    private Characters LastPointer;
    private Characters Slot;
    
    public Node(Characters next, Characters last, Characters slot){
        this.NextPointer=next;
        this.LastPointer=last;
        this.Slot=slot;
    }
}
