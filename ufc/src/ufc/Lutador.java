

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
        this.setCategoria();
        
    }
    
    //GETTER
    public String getNome(){
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

    public String getCategoria(){
        return this.categoria;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public int getEmpates(){
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
        this.setCategoria();
    }

    private void setCategoria(){
        if (this.getPeso()<=83.9){
            this.categoria = "Médio";
        }else if (this.getPeso()<=93){
            this.categoria = "Meio-Pesado";
        }else if(this.getPeso()<=120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }
    

    //METODOS
    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+" anos");
        System.out.println("Altura: "+this.getAltura()+"cm");
        System.out.println("Peso: "+this.getPeso()+" Kg");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println(this.getVitorias()+" Wins");
        System.out.println(this.getDerrotas()+" Losses");
        System.out.println(this.getEmpates()+" Draws");

    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("W: "+this.getVitorias());
        System.out.println("L: "+this.getDerrotas());
        System.out.println("D: "+this.getEmpates());
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empartarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
}