/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java02;

/**
 *
 * @author Henrique
 */
public class Java02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 100;
        c1.cor = "azul";
        c1.material = "plastico";
       
        c1.tampada = true;
        Caneta c2 = new Caneta();
       
        c2.cor = "Preta";
        Caneta c3 =new Caneta();
       
        c1.status();
        c2.status();
        c3.status();
         
    }
    
}
