package Tests.random;

import java.util.Random;

public class nomeRandom {

    public static void main (String[] args){
    String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";

    Random random = new Random ();

    String armazenaNome = "";
    int index = -1;
    for( int i = 0; i < 5; i++ ) {
        index = random.nextInt( letras.length() );
        armazenaNome += letras.substring( index, index + 1 );
    }

        System.out.println (armazenaNome);
    }
    public static String armazenaNome;

}
