package fr.simplon.exercises;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union,
 * intersection, différence)
 */
public class Exercise10SetOperations {

    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * 
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;

        // throw new UnsupportedOperationException();

    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {

        int[] tabNew = new int[array1.length + array2.length];
        int size = 0;

        for (int i = 0; i < array1.length; i++) {

            int value = array1[i];
            boolean exists = false;

            for (int j = 0; j < size; j++) {
                if (tabNew[j] == value) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                tabNew[size] = value;
                size++;
            }
        }

        for (int i = 0; i < array2.length; i++) {

            int value = array2[i];
            boolean exists = false;

            for (int j = 0; j < size; j++) {
                if (tabNew[j] == value) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                tabNew[size] = value;
                size++;
            }
        }

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = tabNew[i];
        }

        return result;

        // throw new UnsupportedOperationException();

    }

    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {
        // on créer un nouveau tableau avec la taille minimal d'un des deux tableaux
        int[] tabNew = new int[Math.min(array1.length, array2.length)];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            int value = array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (value == array2[j]) {
                    // On vérifie si on l'a déjà ajouté
                    boolean alreadyAdded = false;
                    for (int k = 0; k < count; k++) {
                        if (tabNew[k] == value) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        tabNew[count++] = value;
                    }
                    break;
                }
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = tabNew[i];
        }
        return result;
        // throw new UnsupportedOperationException();
    }

    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length + array2.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            int value = array1[i];
            boolean exists = false;

            for (int j = 0; j < array2.length; j++) {
                if (value == array2[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                newArray[count++] = value;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = newArray[i];
        }
        return result;
        // throw new UnsupportedOperationException();
    }

    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {

        int[] temp = new int[array1.length + array2.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            int value = array1[i];
            boolean existsInArray2 = false;

            for (int j = 0; j < array2.length; j++) {
                if (value == array2[j]) {
                    existsInArray2 = true;
                    break;
                }
            }

            if (!existsInArray2) {
                temp[count++] = value;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            int value = array2[i];
            boolean existsInArray1 = false;

            for (int j = 0; j < array1.length; j++) {
                if (value == array1[j]) {
                    existsInArray1 = true;
                    break;
                }
            }

            if (!existsInArray1) {
                temp[count++] = value;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {

        int[] newTab = difference(array1, array2);

        if (newTab.length > 0) {
            return false;
        }

        return true;
        // throw new UnsupportedOperationException();

    }

    /**
     * Supprime les doublons d'un tableau
     * 
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {

        int[] newArray = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (array[i] == newArray[j]) {
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate) {
                newArray[count++] = array[i];
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = newArray[i];
        }

        return result;

        // throw new UnsupportedOperationException();

    }

    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * 
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {

        int [] newArray = removeDuplicates(array);
        int count =0;

        for (int i=0; i<newArray.length; i++){
            count++;
        }

        return count;
        
        // throw new UnsupportedOperationException();

    }
}
