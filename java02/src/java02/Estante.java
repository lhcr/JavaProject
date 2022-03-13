package java02;

public class Estante {
    private float altura;
    private float largura;
    private String modelo;
    public int nroPrateleira;
    public String cor;
    private String material;


    public Estante(){
        this.altura = 2.00f;
        this.largura = 3.00f;
    }


    public void setTamanho(float a, float l){
        this.altura = a;
        this.largura = l;
    }

    public void setCaracteristica(String m,int np, String c){

        this.modelo = m;
        this.nroPrateleira = np;
        this.cor = c;
        
    }

    public void setMaterial(String m){
        this.material = m;
    }


    public String getMaterial(){
        return this.material;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public int getNroPrateleira(){
        return this.nroPrateleira;
    }

    public float getAltura(){
        return this.altura;
    }

    public float getLargura(){
        return this.largura;
    }

    public void colocar(){

    }

    public void tirar(){

    }


}
