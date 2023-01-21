public class Main {
    public static void main(String[] args) {
        System.out.println("Ciclo For");

        /*
         * CICLO FOR:
         *
         * - Ciclo for
         *
         * - For annidati
         *
         * - Versione Enhanced/foreach
         *
         * - Break e Continue
         */

/*

- La struttura di iterazione permette di ripetere un’istruzione finchè un’espressione è vera.
- Si possono dichiarare anche più variabili all’interno del for, più aggiornamenti e più condizioni.

- Generalmente usato per ciclare gli array! Perchè di norma si usa quando sappiamo quanto sono i cicli massimi

     Ciclo for infinito.
for (;true;){
istruzione ripetuta all’infinito}

L’istruzione si può riscrivere come:
for (; ; ;){
istruzione da ripetere all’infinito}
 */

/*---------------------------------------------------------------------------------------------------------*/

        // CICLO FOR:

        for (int i = 0; i < 5; i++) {
            /* A differenza del ciclo while nel for si mette tutto all'interno della prima parentesi
               dopo for (inizializzo, condizione, incremento) */
            System.out.println(i);

            /* Il ciclo for partirà da 0: seguendo la condizione i < 5; genererà cicli da o a 4, questo
               sarà permesso da i++; l'incremento di uno ad ogni ciclo. */

        }

/*---------------------------------------------------------------------------------------------------*/

        // FOR ANNIDATI:

        for (int j = 0; j < 5; j++) {
            /* Controlla le righe= per la riga 0 stamperà da 0 a 4 colonne e poi il ciclo ripartirà
               in egual modo per la riga 1 e così via fino alla 4. */
            System.out.println("Riga " + j);
            for (int y = 0; y < 5; y++) { // Controlla le colonne
                System.out.println("Colonna " + y);

                // Il ciclo farà esattamente questo:
                // riga 0: colonna 0 1 2 3 4
                // riga 1: colonna 0 1 2 3 4
                // riga 2: colonna 0 1 2 3 4
                // riga 3: colonna 0 1 2 3 4
                // riga 4: colonna 0 1 2 3 4
            }
        }

/*-------------------------------------------------------------------------------------------------------*/

        // VERSIONE ENHANCED/FOREACH:

        int[] numeri = {10, 20, 30, 40, 50}; /* Creazione di un array per sviluppare foreach che si usa
                                                esclusivamente con gli array */

        for (int numero : numeri){ /* La variabile numero chiede al ciclo di stampare per ogni
                                      numero (comando) un numero dell'array quindi "numeri" */

            System.out.println(numero);
        }

/*-------------------------------------------------------------------------------------------------------*/

        // BREAK e CONTIUE:

        // Break= mettere uno stop al ciclo dando una condizione specifica

        for (int x= 0; x < 5; x++){
            if (x == 4){ // Diamo una condizione nell'if che permetterà al break di interrompere il ciclo
                break; // Rompe il programma
            }
            System.out.println(x);
        }

/*------------------------------------------------------------------------------------------------------*/

        // Continues:

        // Continues= permette al ciclo di continuare dopo aver saltato la condizione immessa nell'if

        for (int z= 0; z < 5; z++){
            if (z == 4){ // Diamo la condizione che verrà omessa dal ciclo
                continue; // Permette al programma di finire il ciclo
            }
            System.out.println(z);
        }
    }
}