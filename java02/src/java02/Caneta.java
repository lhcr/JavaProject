/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java02;

/**
 *
 * @author Henrique
 */
public class Caneta {
   public String marca;
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
   private String material;

    void status() {
        System.out.println("Marca: " +this.marca);
        System.out.println("Modelo da caneta: "+ this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho ponta: "+ this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Material do corpo: "+this.material);
    }
    
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("ERRO! Não consigo rabiscar com a caneta tampada.");
        } else{
            System.out.println("Estou Rabiscando!!!!");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void escrever(){
        if(this.tampada == true){
            System.out.println("ERRO! Caneta ainda está tampada.");
        } else{
            System.out.println("Estou escrevendo uma carta para você!");
        }
    }

    
    
}
