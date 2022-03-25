import java.util.Scanner;

public class Java012 {

    //dentro do main só pode ser chamado classes ou metodos(procedimentos ou funções) estáticos
    static void teste(){
        System.out.println("Teste de procedimentos");
    }

    static String testeFuncao(){
        return "Teste de Função";
    }

    //tratamento de exceção por meio de throw
    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r =new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Cachorro ca = new Cachorro();
        Arara ar = new Arara();
        Canguru can = new Canguru();
        Cobra co = new Cobra();
        GoldFish go = new GoldFish();
        Tartaruga ta = new Tartaruga();
        double num=0f;

        try {
            num = leNumero();
            System.out.println(num);
        } catch (Exception e1) {
            System.out.println("Entrada Invalida!");
            e1.printStackTrace();
        }
        
        // tratamento de exceção simples
        try (Scanner teclado = new Scanner(System.in)) {
            String nome = teclado.nextLine();
            int idade = teclado.nextInt();
            System.out.printf(nome,idade);
        } catch (Exception e) {
            System.out.println("Erro ao informar dados");
            e.printStackTrace();//mostra onde aconteceu o erro
        }

        //tratamento e exceções multiplas; tratar diversas exceções diferentes
        try (Scanner teclado = new Scanner(System.in)){
            String nome1 = teclado.nextLine();
            System.out.println(nome1);
        } catch (Exception e) {
            System.out.println(e.getMessage());//mostra que erro aconteceu
            e.printStackTrace();//mostra onde aconteceu o erro
        } catch (Throwable e){
            System.out.println(e.getMessage());//mostra que erro aconteceu
            e.printStackTrace();//mostra onde aconteceu o erro

        }

        //tratamento de exceção finally
        try (Scanner teclado = new Scanner(System.in)) {
            String nome2 = teclado.nextLine();
            System.out.println(nome2);
            System.exit(0);//termina a execução do programa
        } catch (Exception e) {
            System.out.println(e.getMessage());//motra que erro aconteceu
            e.printStackTrace();//mostra onde aconteceu o erro
        } finally {//Sempre executado após o try ou catch; Exceto quando é dado o System.exit(0).
            System.out.println("Erro Finally");
        }

        //tratamento de exceção throw obrigando tratamento de erro; Criando tratamento de erro personalizado
        if(num>0){
            throw new IllegalArgumentException("ERRO THROW");
        }

        

        m.locomover();
        r.locomover();
        a.locomover();
        p.locomover();
        ca.locomover();
        ar.locomover();
        can.locomover();
        co.locomover();
        go.locomover();
        ta.locomover(); 

        ca.reagir(11,45);
        ca.reagir("comida");
        ca.reagir(true);
        ca.reagir(5,10f);
    }
}
