package java02;

public class Controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUTOR
    public Controle(){
        this.setVolume(50);
    }

    //METODOS
    public ligar(){
        this.setLigado(true);
    }

    public desligar(){
        this.setLigado(false);
    }

    public abrirMenu(){
        if(this.getLigado()){
            System.out.println("=====MENU======");
            System.out.println(this.getLigado());
            System.out.println(this.getVolume());
            for (i=0; i<=this.getVolume();i+=10){
                System.out.println("[]");
            }
            System.out.println(this.getTocando());
        }

    }

    public fecharMenu(){
        if(this.getLigado()){
            System.out.println("Menu Fechado!");
        }

    }

    public maisVolume(){
        if (this.getLigado() && this.getVolume() != 100){
            this.setVolume(this.getVolume()+1);
        }
    }

    public menosVolume(){
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(this.getVolume()-1);
        }

    }

    public ligarMudo(){
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    public desligarMudo(){
        if(this.getLigado() && this.getVolume()== 0){
            this.setVolume(50);
        }
    }

    public play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }

    }

    public pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    }

    //GETTERS
    private int getVolume(){
        return this.volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    //SETTERS
    private void setVolume(int volume){
        this.volume = volume;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
}
