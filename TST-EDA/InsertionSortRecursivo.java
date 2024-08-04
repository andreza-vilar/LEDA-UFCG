import java.util.Arrays;
import java.util.Scanner;

public class Solucao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];

        // Convertendo a entrada para um array de inteiros
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        // Chama a função recursiva para ordenar usando Insertion Sort
        insertionSortRecursive(arr, 1);
    }

    private static void insertionSortRecursive(int[] arr, int n) {
        // Base case: if n is greater than or equal to the length of the array, we are done
        if (n >= arr.length) {
            return;
        }

        // Insert arr[n] into the sorted sequence arr[0...n-1]
        int key = arr[n];
        int i = n - 1;

        while (i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = key;

        // Print the array after each insertion
        System.out.println(Arrays.toString(arr));

        // Recursive call for the next element
        insertionSortRecursive(arr, n + 1);
    }
}

