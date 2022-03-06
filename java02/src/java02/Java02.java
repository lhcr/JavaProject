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
        c1.modelo = "Crystal";
        c1.marca = "Bic";
        //c1.tampar();
       /* Caneta c2 = new Caneta();
        c2.marca = "Rsa";
        c2.modelo = "Rost";
        c2.cor = "Preta";
        Caneta c3 =new Caneta();
        c3.marca= "Brig";
        c3.modelo= "Vert";
        c3.cor = "Verde";*/
        c1.status();
        //c2.status();
        //c3.status();
         
    }
    
}
