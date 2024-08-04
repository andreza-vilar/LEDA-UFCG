import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura da sequência de inteiros
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        
        // Ordenar o array usando Quick Sort
        quickSort(array, 0, array.length - 1);
        
        // Imprimir os primeiros n elementos em ordem crescente
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

//Quick Sort é a escolha mais adequada para este problema devido à sua eficiência na ordenação e ao fato de que não requer estruturas auxiliares além do espaço necessário para a recursão. Isso atende às restrições do problema e fornece uma solução eficiente para encontrar e imprimir os n menores elementos de uma sequência de inteiros.
