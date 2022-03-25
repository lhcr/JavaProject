public class Java012 {
    
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
