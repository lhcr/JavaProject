public class Reptil extends Animal{
    String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("rastejando");        
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil se alimentando");        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
        
    }

}
