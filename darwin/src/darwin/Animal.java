public abstract class Animal {
    //polimorfismo
    float peso;
    int idade;
    int membros;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    

    public abstract void locomover();//método abstract somente em classe abstratas ou interfaces; não há a inplementação 
    public abstract void alimentar();
    public abstract void emitirSom();
}
