
public class ProjetoPessosas{
    
    public static void main(String[] args){
        //Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();
        Tecnico p6 = new Tecnico();
        Visitante p7 = new Visitante();

       // p1.setNome("Luis");
        p2.setNome("Nayra");
        p3.setNome("Henrique");
        p4.setNome("Antonio");
        p5.setNome("Grazielle");
        p6.setNome("Silvia");
        p7.setNome("Cristina");

        p2.setIdade(25);
        p2.setSexo("F");
        p2.setCurso("Informática");
        p2.setMatricula(1);

        p3.setIdade(18);
        p3.setSexo("M");
        p3.setEspecialidade("POO");
        p3.setSetor("Programação");
        p3.setTrabalhando(true);
        p3.setSalario(5000.85f);
        
        p4.setIdade(30);
        p4.setSexo("M");
        p4.setSetor("Computação");
        p4.setTrabalhando(true);

        p5.setIdade(22);
        p5.setSexo("F");
        p5.setBolsa(1500.00f);
        p5.setCurso("Programação");
        p5.setMatricula(2);

        p6.setIdade(35);
        p6.setSexo("F");
        p6.setRegistroProfissional(1);
        p6.setCurso("Manutenção Computadores");
        p6.setMatricula(3);

        p7.setIdade(56);
        p7.setSexo("F");

        //System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());


    }

}