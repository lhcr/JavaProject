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
    private String marca;
    private String modelo;
    public String cor;
    private float ponta;
    public int carga;
    protected boolean tampada;
    protected String material;


    //CONSTRUTOR
    public void Caneta(){
        this.setMarca("BIC");
        this.setModelo("Cristal");
        this.setPonta(0.5f);
        this.setTampada(true);
        this.setCarga(100);
    }

    public void Caneta(String marca, String modelo, float ponta, boolean tampada, String material){
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setPonta(ponta);
        this.setTampada(tampada);
        this.setMaterial(material);
    }

    //GETTERS

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public float getPonta(){
        return this.ponta;
    }

    public int getCarga(){
        return this.carga;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public String getMaterial(){
        return  this.material;
    }

    //SETTERS
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    public void setCarga(int carga){
        this.carga = carga;
    }
    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    public void setMaterial(String material){
        this.material = material;
    }

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
