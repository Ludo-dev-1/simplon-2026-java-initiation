package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {

    /**
     * Calcule la somme des nombres de 1 à n
     * 
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;

        }
        return s;
        // throw new UnsupportedOperationException();

    }

    /**
     * Inverse un nombre (ex: 123 -> 321)
     * 
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int number) {
        int r = 0;
        while (number != 0) {
            r = r * 10;
            r = r + number % 10;
            number = number / 10;
        }
        return r;
        // throw new UnsupportedOperationException();

    }

    /**
     * Calcule la factorielle d'un nombre (n!)
     * 
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        return fact;
        // throw new UnsupportedOperationException();

    }

    /**
     * Compte le nombre de chiffres dans un nombre
     * 
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int number) {

        int chiffre = 0;

        if (number == 0) {
            return 1;
        }

        while (number != 0) {
            number = number / 10;
            chiffre++;
        }
        return chiffre;
        // throw new UnsupportedOperationException();

    }

    /**
     * Vérifie si un nombre est premier
     * 
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */
    public boolean isPrime(int number) {
       if (number <= 1) {
        return false;
       } else {
        boolean isPrim = true;
        for (int i =2; i< number; i++ ){
            if (number %i ==0){
                isPrim = false;
                break;
            }
        }
        if (isPrim){
            return true;
        } else {
            return false;
        }
       }

        // throw new UnsupportedOperationException();

    }
}
