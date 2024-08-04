import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da sequência de inteiros
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        // Chamada para ordenar usando quick sort
        quickSort(array, 0, array.length - 1);

        scanner.close();
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Particiona o array
            int pivotIndex = partition(array, low, high);

            // Ordena as partes antes e depois do pivô
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // Escolher o primeiro elemento como pivô
        int pivot = array[low];
        int left = low + 1;
        int right = high;

        while (left <= right) {
            // Encontrar um elemento maior que o pivô a partir da esquerda
            while (left <= right && array[left] <= pivot) {
                left++;
            }

            // Encontrar um elemento menor que o pivô a partir da direita
            while (left <= right && array[right] > pivot) {
                right--;
            }

            // Trocar os elementos
            if (left < right) {
                swap(array, left, right);
            }
        }

        // Colocar o pivô na posição correta
        swap(array, low, right);

        // Imprimir o estado atual do array após o particionamento
        printArray(array);

        return right;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(array[i]);
        }
        System.out.println(sb.toString());
    }
}

