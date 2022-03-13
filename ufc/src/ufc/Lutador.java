package ufc;

public class Lutador implements ControladorLutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    

    //CONSTRUTOR
    public Lutador(String nome,
                    String nacionalidade,
                    int idade,
                    float altura,
                    float peso,
                    int vitorias,
                    int derrotas,
                    int empates){

        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setCategoria(peso);
        
    }
    
    //GETTER
    private String getNome(){
        return this.nome;
    }

    private String getNacionalidade(){
        return this.nacionalidade;
    }

    private int getIdade(){
        return this.idade;
    }

    private float getAltura(){
        return this.altura;
    }

    private float getPeso(){
        return this.peso;
    }

    private String getCategoria(){
        return this.categoria;
    }

    private int getVitorias(){
        return this.vitorias;
    }

    private int getDerrotas(){
        return this.derrotas;
    }

    private int getEmpates(){
        return this.empates;
    }
    
    
    //SETTER
    private void setNome(String nome){
        this.nome = nome;
    }

    private void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    private void setIdade(int idade){
        this.idade = idade;
    }

    private void setAltura(float altura){
        this.altura = altura;
    }

    private void setPeso(float peso){
        this.peso = peso;
    }

    private void setCategoria(float peso){
        if (peso<=70.3){
            this.categoria = "Leve";
        }else if (peso<=83.9){
            this.categoria = "Médio";
        }else if(peso<=120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido"
        }
    }

    private void setVirotiras(int vitorias){
        this.vitorias = vitorias;
    }

    private void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    private void setEmpates(int empates){
        this.empates = empates;
    }

    //METODOS
    public void apresentar(){
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getIdade());
        System.out.println(this.getAltura());
        System.out.println(this.getPeso());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias());
        System.out.println(this.getDerrotas());
        System.out.println(this.getEmpates());

    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println(this.getVitorias());
        System.out.println(this.getDerrotas());
        System.out.println(this.getEmpates());
    }

    public void ganharLuta(){
        this.setVirotiras(this.getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empartarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
}