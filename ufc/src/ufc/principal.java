

public class principal {
    
    public static void main(String[] args){
        Campeao c = new Campeao("Anderson Silva", 
                    "brasileiro",
                    46,
                    1.88f,
                    83.9f,
                    34,
                    9,
                    1,
                    11,
                    true);
                    
        Lutador l[] = new Lutador[5];
        l[0] = new Lutador("Daniel Cormier",
                "estadunidense",
                42,
                1.80f,
                114f,
                22,
                3,
                1);
        l[1] = new Lutador("Jon Jones", 
                    "estadunidense",
                    34,
                    1.93f,
                    113f,
                    26,
                    1,
                    1);
        l[2] = new Lutador("Isarael Adesanya", 
                    "nigeriano",
                    32,
                    1.93f,
                    84.9f,
                    21,
                    1,
                    0);
        l[3] = new Lutador("Francis Ngannou", 
                    "camaronês",
                    35,
                    1.93f,
                    120f,
                    16,
                    3,
                    0);
        l[4] = new Lutador("Kamaru Usman", 
                    "nigeriano",
                    34,
                    1.83f,
                    83.9f,
                    17,
                    1,
                    0);
        l[5]= new Lutador ("Hector Lombardo", 
                    "cubano",
                    44,
                    1.77f,
                    84.9f,
                    19,
                    8,
                    3);

        c.apresentar();
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0],l[4]);
        UFC01.lutar();
        Luta UFC02 = new Luta();
        UFC02.marcarLuta(c, l[2]);
        UFC02.lutar();

    }
}
