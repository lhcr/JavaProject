public class Cachorro extends Lobo{
    private String dono;

    public String getDono(){
        return this.dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando Rabo");
    }

    public void emitirSom(){
        System.out.println("Au Au!");
    }

    public void rosnar(){
        System.out.println("Rrrrrrrrr");
    }

    
    public void reagir(String frase){
        if (frase=="comida"){
            this.abanarRabo();
            this.emitirSom();
        } else {
            this.rosnar();
        }
    }

    public void reagir(int hora, int minutos){
        if(hora <= 11 && hora >=6){
            this.abanarRabo();
        } else if(hora>=12 && hora<=18){
            this.abanarRabo();
            this.emitirSom();
        }else{
            System.out.println("Ignorar!");
        }
    }

    public void reagir(boolean temDono){
        if(temDono){
            this.abanarRabo();
        } else{
            this.rosnar();
            this.emitirSom();
        }
    }

    public void reagir(int idade,float peso){
        if (idade<7 && peso<=5){
            this.abanarRabo();
        }else if(idade<7 && peso>=6){
            this.emitirSom();
        }else if(idade>7 && peso<=5){
            this.rosnar();
        }else if(idade>7 && peso>=6){
            System.out.println("Ignorando!");
        }
    }
}
