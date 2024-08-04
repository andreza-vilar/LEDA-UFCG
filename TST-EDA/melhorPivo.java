import java.util.Scanner;

public class MelhorPivot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da sequência de inteiros
        String[] input = scanner.nextLine().split(" ");
        int[] sequence = new int[input.length];

        for (int k = 0; k < input.length; k++) {
            sequence[k] = Integer.parseInt(input[k]);
        }

        // Leitura dos índices i e j
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        // Encontra a melhor escolha de pivô
        int melhorPivot = escolherMelhorPivot(sequence, i, j);

        // Imprime o índice do melhor pivô
        System.out.println(melhorPivot);

        scanner.close();
    }

    private static int escolherMelhorPivot(int[] array, int i, int j) {
        int numMenoresI = contarMenores(array, array[i]);
        int numMaioresI = array.length - contarMenores(array, array[i]) - 1;

        int numMenoresJ = contarMenores(array, array[j]);
        int numMaioresJ = array.length - contarMenores(array, array[j]) - 1;

        if (numMenoresI + numMaioresI < numMenoresJ + numMaioresJ) {
            return i;
        } else if (numMenoresI + numMaioresI > numMenoresJ + numMaioresJ) {
            return j;
        } else {
            return i; // Se houver empate, retorna i
        }
    }

    private static int contarMenores(int[] array, int pivot) {
        int count = 0;
        for (int value : array) {
            if (value < pivot) {
                count++;
            }
        }
        return count;
    }
}

