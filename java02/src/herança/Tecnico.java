import javafx.animation.ScaleTransition;

public class tecnico extends aluno{
    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void pratica(){
        System.out.println("Está praticansdo!");
    }
}
