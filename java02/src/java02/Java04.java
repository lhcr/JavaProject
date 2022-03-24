

public class Java04 {
    public static void main(String [] args){
        Estante e1 = new Estante();

        e1.setCaracteristica("Super Luxo", 5, "Mel");
        e1.setMaterial("Madeira maciça");

        e1.getAltura();
        e1.getLargura();
        e1.getMaterial();
        e1.getModelo();
        e1.getNroPrateleira();
    }
}
