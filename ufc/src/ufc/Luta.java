

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(){

    }

    //GETTERS
    private Lutador getDesafiado(){
        return this.desafiado;
    }

    private Lutador getDesafiante(){
        return this.desafiante;
    }

    private int getRounds(){
        return this.rounds;
    }

    private boolean getAprovado(){
        return this.aprovada;
    }

    //SETTERS
    private void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    private void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    private void setRounds(int rounds){
        this.rounds = rounds;
    }

    private void setAprovado(boolean aprovada){
        this.aprovada = aprovada;
    }

    //METODO
    public void marcarLuta(Lutador l1, Lutador l2){
        /**Lutadores da mesma categoria
         * desafia e desafiante serem diferentes
         * só pode acontecer se for aprovada
         * só pode vitória de ums dos lutadores ou empate
         */
        System.out.println(l1);
        if(l1.getCategoria()==l2.getCategoria()){
            if(l1!=l2){
                this.setAprovado(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2);
            } else {
                this.setAprovado(false);
                this.setDesafiado(null);
                this.setDesafiante(null);
            }
        }
    }

    public void lutar(){
        /** */
        if(this.getAprovado()){
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                System.out.println("Empate");
                desafiado.empartarLuta();
                desafiante.empartarLuta();
                break;
                case 1:
                System.out.println("Wim by Nocaut "+desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
                case 2:
                System.out.println("Win by TKO "+desafiante.getNome());
                desafiado.perderLuta();
                desafiante.ganharLuta();
                break;
            }

        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
}
