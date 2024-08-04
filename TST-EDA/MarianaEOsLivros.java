import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] books = input.split(",\\s*");

        // Imprime o estado inicial
        printArray(books);

        // Aplicando o Insertion Sort e imprimindo os estados parciais
        insertionSortAndPrint(books);
    }

    private static void insertionSortAndPrint(String[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            // Move elementos que são maiores que a chave para uma posição a frente
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            // Imprime o estado atual após cada iteração
            printArray(array);
        }
    }

    private static void printArray(String[] array) {
        System.out.println(String.join(", ", array));
    }
}

