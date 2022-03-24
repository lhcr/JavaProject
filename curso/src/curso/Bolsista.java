public final class Bolsista extends Aluno{//classe FINAL não pode ter filhos
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public final void renovarBolsa(){//metodo final não pode ser sobrescrito por suas subclasses, é somente herdado.
        System.out.println("Bolsa renovada!");
    }
    
    @Override//sobreposição de metodo
    public void pagarMensalidade(){
        System.out.println("Bolsista "+this.getNome()+" - mensalidade paga!");
    }
    
}
