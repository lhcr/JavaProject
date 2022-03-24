

public class Controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUTOR
    public Controle(){
        this.setVolume(50);
    }

    //METODOS
    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }

    public void abrirMenu(){
        if(this.getLigado()){
            System.out.println("=====MENU======");
            System.out.println(this.getLigado());
            System.out.println(this.getVolume());
            for (int i=0; i<=this.getVolume();i+=10){
                System.out.println("[]");
            }
            System.out.println(this.getTocando());
        }

    }

    public void fecharMenu(){
        if(this.getLigado()){
            System.out.println("Menu Fechado!");
        }

    }

    public void maisVolume(){
        if (this.getLigado() && this.getVolume() != 100){
            this.setVolume(this.getVolume()+1);
        }
    }

    public void menosVolume(){
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(this.getVolume()-1);
        }

    }

    public void ligarMudo(){
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if(this.getLigado() && this.getVolume()== 0){
            this.setVolume(50);
        }
    }

    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }

    }

    public void pause(){
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