package fr.simplon.exercises;

/**
 * Exercice 11: Tableaux à deux dimensions
 * 
 * Objectif: Apprendre à manipuler des tableaux à deux dimensions (matrices)
 */
public class Exercise11TwoDimensionalArrays {

    Exercise07ArraysSumAverage ex07 = new Exercise07ArraysSumAverage();
    Exercise06ArraysMaxMin ex06 = new Exercise06ArraysMaxMin();

    /**
     * Crée une matrice remplie de zéros
     * 
     * @param rows nombre de lignes
     * @param cols nombre de colonnes
     * @return une matrice rows x cols remplie de 0
     */
    public int[][] createMatrix(int rows, int cols) {

        return new int[rows][cols];

        // throw new UnsupportedOperationException();

    }

    /**
     * Calcule la somme de tous les éléments d'une matrice
     * 
     * @param matrix la matrice
     * @return la somme de tous les éléments
     */
    public int sumMatrix(int[][] matrix) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;

        // throw new UnsupportedOperationException();

    }

    /**
     * Trouve le maximum dans une matrice
     * 
     * @param matrix la matrice
     * @return la valeur maximale
     */
    public int findMaxInMatrix(int[][] matrix) {

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
        // throw new UnsupportedOperationException();

    }

    /**
     * Transpose une matrice (lignes ↔ colonnes)
     * 
     * @param matrix la matrice à transposer
     * @return la matrice transposée
     */
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
        // throw new UnsupportedOperationException();

    }

    /**
     * Retourne la diagonale principale d'une matrice carrée
     * 
     * @param matrix la matrice carrée
     * @return un tableau contenant les éléments de la diagonale
     */
    public int[] getDiagonal(int[][] matrix) {

        int[] tab = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            tab[i] = matrix[i][i];
        }

        return tab;

        // throw new UnsupportedOperationException();

    }

}
