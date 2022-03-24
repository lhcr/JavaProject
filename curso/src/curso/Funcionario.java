public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(boolean trabalhando){
        if(this.getTrabalhando()!=trabalhando){
            this.setTrabalhando(trabalhando);
        }
    }
    
    public String getSetor() {
        return this.setor;
    }

    public boolean getTrabalhando(){
        return this.trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}