public class Professor extends Funcionario {
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAumento(float aumento){
        if (aumento>0){
            this.setSalario(this.getSalario()+aumento);
        }
        System.out.println("O novo salário de "+this.getNome()+ " é "+this.getSalario());
    }
}
