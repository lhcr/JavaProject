package banco;


public class Conta {
    public int numConta;
    protected String tipo; //Conta corrente (CC) ou Conta Poupança (CP)
    private String dono;
    private float saldo;
    private boolean status; //Aberta ou Fechada

    //CONSTRUTOR
    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
        this.setNumConta(1);
    }
    
    //GETTER
    public int getNumConta(){
        return this.numConta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public boolean getStatus(){
        return this.status;
    }
    
    //SETTER
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    
    //METODOS
    public void abrirConta(int numConta,String tipo){
        //mudar status para verdadeiro
        //informa tipo de conta
        // CC + 50 reais se  CP + 150 reais
        this.setStatus(true);
        this.setTipo(tipo);
        if (tipo== "CC"){
            this.setSaldo(50f);
        } else {
            this.setSaldo(150f);
        }
        System.out.println("Conta Aberta\nN: "+this.getNumConta());
    }

    public void fecharConta(int numConta){
        /*Não deve ter dinheiro na conta ou débito*/
        if(this.getSaldo()>0){
            System.out.println("Você possui saldo.");
        } else if (this.getSaldo()<0) {
            System.out.println("Você seu saldo é "+this.saldo+", para encerra a conta você deve realizar um deposito neste valor.");
            // deseja realizar um deposito?
            //if(x="sim"){
                //this.depositar();
                //}
            //}
        } else {
            this.setStatus(false);
            System.out.println("Sua conta foi encerrada!");
        }
    }

    public void depositar(int numConta, float valor){
        //status deve estar verdadeiro
        if(this.getStatus()){
            this.saldo+=valor;
            System.out.println("Foi depositado R$" + valor + "\nAgora seu saldo é de R$" + this.getSaldo());

        } else {
            System.out.println("Essa conta não foi encontrada.");
            //gostaria de abri uma nova conta?
            //if(x=="Sim"){
                //this.abrirConta();
            //}
        }
    }

    public void sacar(int numConta, float valor){
        //status verdadeiro
        //deve ter saldo
        //saldo deve ser maior que o saque
        if(this.getStatus()){
            if(this.getSaldo()>=valor){
                this.saldo-=valor;
            } else {
                System.out.println("Sem saldo!");
            }
        } else {
            System.out.println("Essa conta não foi encontrada!");

        }

    }

    public void pagarMensal(int numConta){
        //cobra do saldo
        //CC 12 reais, CP 20 reais
        if(this.getStatus()){
            if (this.getTipo() == "CC") {
                this.saldo -= 12f;
            } else if (this.getTipo() == "CP") {
                this.saldo -= 20f;
            }
        } else{
            System.out.println("Conta não encontrada!")
        }
    }
}
