public class Campeao extends Lutador {


    int defesas;
    boolean campeao;
    public Campeao(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates, int defesas, boolean campeao) {
        super(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
        this.setDefesas(defesas);
        this.setCampeao(campeao);
    }

    //GETTERS
    public int getDefesas(){
        return this.defesas;
    }

    public boolean getCampeao(){
        return this.campeao;
    }

    //SETTERS
    private void setDefesas(int defesas) {
        this.defesas = defesas;
    }
    private void setCampeao(boolean campeao) {
        this.campeao = campeao;
    }

    
}
