package fr.simplon.exercises;


/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux
 * existants
 */
public class Exercise09ArrayTransformations {

    /**
     * Double tous les éléments d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {

        int[] tableau = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tableau[i] = array[i] * 2;
        }

        return tableau;

        // throw new UnsupportedOperationException();

    }

    /**
     * Filtre les nombres pairs d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        int[] tableau = new int[count];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                tableau[j] = array[i];
                j++;

            }
        }
        return tableau;

        // throw new UnsupportedOperationException();

    }

    /**
     * Copie un tableau dans l'ordre inverse
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {

        int[] tabReverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tabReverse[array.length - 1 - i] = array[i];
        }

        return tabReverse;

        // throw new UnsupportedOperationException();

    }

    /**
     * Concatène deux tableaux
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis
     *         ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {

        int len1 = array1.length;
        int len2 = array2.length;

        int res[] = new int[len1 + len2];

        System.arraycopy(array1, 0, res, 0, len1);
        System.arraycopy(array2, 0, res, len1, len2);
        return res;

        // throw new UnsupportedOperationException();

    }

    /**
     * Extrait une sous-partie d'un tableau
     * 
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end   l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {

        int [] table = new int [end-start];

        for (int i=start; i< end; i++){
            int detIndex = i - start;
            table[detIndex]=array[i];
        }

        return table;

        //throw new UnsupportedOperationException();

    }
}
