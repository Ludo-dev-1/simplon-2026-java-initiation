package fr.simplon.exercises;


/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {

    /**
     * Inverse une chaîne de caractères
     * 
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {

        if (str == null) {
            return str;
        }

        String reverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        return reverseString;

        // throw new UnsupportedOperationException();

    }

    /**
     * Vérifie si une chaîne est un palindrome
     * 
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {

        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data = buffer.toString();

        if (str.equals(data)) {
            return true;
        }
        return false;

        // throw new UnsupportedOperationException();

    }

    /**
     * Compte le nombre de voyelles dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        int voyel = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                voyel++;
            }
        }

        return voyel;
        // throw new UnsupportedOperationException();

    }

    /**
     * Compte le nombre de mots dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {

        String[] tableau = str.split(" ");
        int countWords = 0;

        for (int i = 0; i < tableau.length; i++) {
            countWords++;
        }

        return countWords;
        // throw new UnsupportedOperationException();
    }

    /**
     * Met la première lettre de chaque mot en majuscule
     * 
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {

        String[] tableau = str.toLowerCase().split(" ");

        for (int i = 0; i < tableau.length; i++) {
            String mot = tableau[i];
            tableau[i] = mot.substring(0, 1).toUpperCase()
                    + mot.substring(1).toLowerCase();
        }

        return String.join(" ", tableau);

        // throw new UnsupportedOperationException();

    }
}
