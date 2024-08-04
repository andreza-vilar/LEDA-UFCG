import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da sequência de inteiros
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        // Imprimir o array inicial
        System.out.println(Arrays.toString(array));

        // Chamada para ordenar usando merge sort
        mergeSort(array, 0, array.length - 1);

        scanner.close();
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Ordenar a metade esquerda
            mergeSort(array, left, mid);
            // Ordenar a metade direita
            mergeSort(array, mid + 1, right);
            // Mesclar as duas metades
            merge(array, left, mid, right);

            // Imprimir o estado após a mesclagem de cada nível
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, left, right + 1)));
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        // Tamanho das duas sub-arrays
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        // Criação de arrays temporários para as duas metades
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copiar dados para os arrays temporários
        for (int i = 0; i < sizeLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < sizeRight; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Mesclar os arrays temporários de volta para o array original
        int i = 0, j = 0, k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copiar os elementos restantes de leftArray, se houver
        while (i < sizeLeft) {
            array[k++] = leftArray[i++];
        }

        // Copiar os elementos restantes de rightArray, se houver
        while (j < sizeRight) {
            array[k++] = rightArray[j++];
        }
    }
}

