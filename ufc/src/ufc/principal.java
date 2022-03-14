

public class principal {
    
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Anderson Silva", 
                    "brasileiro",
                    46,
                    1.88f,
                    83.9f,
                    34,
                    9,
                    1);
        l[1] = new Lutador("Jon Jone", 
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

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0],l[4]);
        UFC01.lutar();

    }
}
