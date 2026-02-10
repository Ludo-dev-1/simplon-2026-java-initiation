package fr.simplon.exercises;

/**
 * Exercice 7: Tableaux - Somme et moyenne
 * 
 * Objectif: Apprendre à calculer la somme et la moyenne des éléments d'un
 * tableau
 */
public class Exercise07ArraysSumAverage {

    /**
     * Calcule la somme de tous les éléments d'un tableau
     * 
     * @param array le tableau
     * @return la somme de tous les éléments
     */
    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
        // throw new UnsupportedOperationException();

    }

    /**
     * Calcule la moyenne des éléments d'un tableau
     * 
     * @param array le tableau
     * @return la moyenne (arrondie à l'entier inférieur)
     */
    public double average(int[] array) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / array.length;
        }

        return average;
        // throw new UnsupportedOperationException();

    }

    /**
     * Compte combien d'éléments sont supérieurs à la moyenne
     * 
     * @param array le tableau
     * @return le nombre d'éléments supérieurs à la moyenne
     */
    public int countAboveAverage(int[] array) {
        int sum = 0;
        int average = 0;
        int countAboveAverage = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / array.length;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                countAboveAverage++;
            }

        }
        return countAboveAverage;
        // throw new UnsupportedOperationException();

    }

    /**
     * Calcule la somme des nombres pairs dans un tableau
     * 
     * @param array le tableau
     * @return la somme des nombres pairs
     */
    public int sumEvenNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

    /**
     * Calcule le produit de tous les éléments d'un tableau
     * 
     * @param array le tableau
     * @return le produit de tous les éléments
     */
    public int product(int[] array) {

        int product = 1;
        for (int i = 0; i < array.length; i++) {
          product = array[i] * product;
        }
        return product;

        // throw new UnsupportedOperationException();

    }
}
