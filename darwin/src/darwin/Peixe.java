public class Peixe extends Animal{
    String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltaBolha(){

    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comento algas");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
        
    }
}
