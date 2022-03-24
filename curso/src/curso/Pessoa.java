public abstract class Pessoa {//classe abstrata não pode gerar objeto
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniv(){// método não pode ser sobrescrito em suas subclasses
        this.setIdade(this.getIdade()+1);
    }

    protected String getNome() {
        return nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        
        return "Pessoa{"+"nome= "+nome+" idade= "+idade+" sexo= "+sexo+"}";
    }


}
