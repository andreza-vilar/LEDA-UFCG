import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];

        // Convertendo a entrada para um array de inteiros
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        // Reordenando o último elemento usando Insertion Sort
        int n = arr.length;
        int lastElement = arr[n - 1];
        int i = n - 2;

        // Movendo elementos maiores que o último elemento uma posição para a frente
        while (i >= 0 && arr[i] > lastElement) {
            arr[i + 1] = arr[i];
            i--;
        }
        // Colocando o último elemento na posição correta
        arr[i + 1] = lastElement;

        // Imprimindo o array ordenado
        System.out.println(Arrays.toString(arr));
    }
}
