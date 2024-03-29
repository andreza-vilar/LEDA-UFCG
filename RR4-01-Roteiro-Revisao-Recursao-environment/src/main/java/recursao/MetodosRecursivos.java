package recursao;

public class MetodosRecursivos {

	public int calcularSomaArray(int[] array, int tamanho){
		int result = 0;
		if (tamanho == 0) {
			return 0;
		} else {
			result = array[tamanho-1] + calcularSomaArray(array, tamanho -1);
		
		}
		return result;
	}

	
	public long calcularFatorial(int n) {
		long result = 1;
		if (n == 1){
			return result = 1;
		}

		else{
			result = n * calcularFatorial(n - 1);
		}

		return result;
	}

	public int calcularFibonacci(int n) {
		int result = 1;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR E IMPRIMIR
		// O N-ESIMO TERMO
		// DA SEQUENCIA DE FIBONACCI, QUE TEM A SEGUINTE LEI DE FORMACAO: O
		// PRIMEIRO E SEGUNDO NUMEROS
		// DA SEQUENCIA SÃO 1. A PARTIR DO TERCEIRO TERMO, CADA TERMO DA
		// SEQUENCIA É DADO
		// PELA SOMA DOS OUTROS DOIS ANTERIORES. OBSERVE QUE SENDO O METODO
		// RECURSIVO, O FIBONACCI DOS NUMEROS ANTERIORES TAMBEM VAO SER
		// IMPRESSOS
		return result;
	}

	public int countNotNull(Object[] array) {
		int result = 0;
		// TODO IMPLEMENTE AQUI O CODIGO QUE CONTA (USANDO RECURSAO) A
		// QUANTIDADE DE ELEMENTOS NAO NULOS
		// DE UM ARRAY DE OBJETOS RECEBIDO COMO PARAMETRO
		return result;
	}

	public long potenciaDe2(int expoente) {
		long result = 1;

		if (expoente == 0){
			return result = 1;
		}

		else{
			result = 2 * potenciaDe2(expoente - 1);
		}

		return result;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		double result = termoInicial;
		if(n ==1){
			return result = termoInicial;
		}
		else{
			result = progressaoAritmetica(termoInicial, razao, n - 1) + razao;
		}
		return result;
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		double result = termoInicial;
		if(n ==1){
			return result = termoInicial;
		}
		else{
			result = progressaoAritmetica(termoInicial, razao, n - 1) * razao;
		}
		return result;
	}
	
	
}
