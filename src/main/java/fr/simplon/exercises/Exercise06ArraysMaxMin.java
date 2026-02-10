package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 6: Tableaux - Recherche du maximum et minimum
 * 
 * Objectif: Apprendre à trouver le plus grand et le plus petit élément d'un
 * tableau
 */
public class Exercise06ArraysMaxMin {

    /**
     * Trouve le maximum dans un tableau
     * 
     * @param array le tableau
     * @return la valeur maximale
     */
    public int findMax(int[] array) {

        Arrays.sort(array);
        return array[array.length - 1];

        // throw new UnsupportedOperationException();

    }

    /**
     * Trouve le minimum dans un tableau
     * 
     * @param array le tableau
     * @return la valeur minimale
     */
    public int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];

        // throw new UnsupportedOperationException();

    }

    /**
     * Trouve l'index du maximum dans un tableau
     * 
     * @param array le tableau
     * @return l'index de la valeur maximale (le premier si plusieurs)
     */
    public int findMaxIndex(int[] array) {
        if (array.length == 0)
            return -1;

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;

        // throw new UnsupportedOperationException();

    }

    /**
     * Trouve l'index du minimum dans un tableau
     * 
     * @param array le tableau
     * @return l'index de la valeur minimale (le premier si plusieurs)
     */
    public int findMinIndex(int[] array) {
        if (array.length == 0)
            return -1;

        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;

        // throw new UnsupportedOperationException();

    }

    /**
     * Calcule la différence entre le max et le min
     * 
     * @param array le tableau
     * @return la différence max - min
     */
    public int range(int[] array) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
       
        for (int i = 0; i < array.length; i++) {
        if (array[i] > maxVal)
            maxVal = array[i];
        if (array[i] < minVal)
            minVal = array[i];
    }


        return maxVal-minVal;

        }
       // throw new UnsupportedOperationException();

}
