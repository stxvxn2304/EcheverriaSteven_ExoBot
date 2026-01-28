package esBusinessComponent.esEntities;

import java.util.Scanner;

public class esAutomata {

    static final Integer er = -10;
    static final Integer ok = 100;
    static final String esAlfabeto = "a,b,c,d,t, ";
    static final Integer[][] esMt = { // a b c d t esp
            { 1, er, er, er, er, er }, // q0
            { er, 2, er, er, er, ok }, // q1
            { er, 2, 3, er, er, ok }, // q2
            { er, er, er, 4, er, er }, // q3
            { er, er, er, er, 5, er }, // q4
            { er, er, er, er, 5, ok } // q5
    };

    @SuppressWarnings("resource")
    private int esGetIndexAlfabeto(String esCaracter) {
        Scanner esScAlfa = new Scanner(esAlfabeto).useDelimiter(",");
        for (int i = 0; esScAlfa.hasNext(); i++)
            if (esCaracter.equals(esScAlfa.next()))
                return i;
        return er;
    }

    public boolean esCheckTipoArsenal(String esArsenal) {
        int q = 0;
        // System. out.println("Evaluando: " + esArsenal);
        for (int i = 0; i < esArsenal.length(); i++) {
            int esIndexAlfa = esGetIndexAlfabeto(esArsenal.charAt(i) + "");
            if (esIndexAlfa == er || esMt[q][esIndexAlfa].equals(er))
                return false;
            q = esMt[q][esIndexAlfa];
        }
        return (q == ok);
    }

}