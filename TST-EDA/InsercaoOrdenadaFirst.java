import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];

        // Convertendo a entrada para um array de inteiros
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        // Inserção do primeiro elemento na posição correta usando Insertion Sort
        insertionSortFirstElement(arr);

        // Imprimindo o array ordenado
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSortFirstElement(int[] arr) {
        int n = arr.length;
        int firstElement = arr[0];
        int i = 1;

        // Movendo elementos menores que o primeiro elemento uma posição para trás
        while (i < n && arr[i] < firstElement) {
            arr[i - 1] = arr[i];
            i++;
        }
        // Colocando o primeiro elemento na posição correta
        arr[i - 1] = firstElement;
    }
}

