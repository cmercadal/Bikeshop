package cl.camila.calculadora;

import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------\n"
				+ "Demostración de calculo de Stock de Seguridad\n"
				+ "---------------------------------------------\n");
		
		List<Integer> stockAleatorio = impresionGeneradorValoresAleatorios();
		
		
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		System.out.print("Stocks de seguridad con algoritmo simple ");
		System.out.println(calculadoraSimple.calcula(stockAleatorio));
		
		CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
		System.out.print("Beneficio Stocks de seguridad con algoritmo complejo");
		System.out.println(calculadoraCompleja.calcula(stockAleatorio));
		

	}

	
	public static List<Integer> impresionGeneradorValoresAleatorios() {
		System.out.println("Tomando valores aleatrios\n");
		
		GeneradorStockAleatorio generador = new GeneradorStockAleatorio();
		
		List<Integer> ventasAleatorias = generador.ventasRandom();
		
		for (int i = 0; i<ventasAleatorias.size(); i++) {
			System.out.print(ventasAleatorias.get(i) + " ");
		}
		
		System.out.println("\n\n");
		
		return ventasAleatorias;
	}
}
