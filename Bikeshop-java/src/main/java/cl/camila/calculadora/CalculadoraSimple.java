package cl.camila.calculadora;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSimple implements CalculadoraStockSeguridad {

	@Override
	public List<Integer> calcula(List<Integer> stock) {
		
		List<Integer> stockSeguridad = new ArrayList<Integer>();
		
		for (int i = 0; i< stock.size(); i++) {
			stockSeguridad.add(2);
		}

		return stockSeguridad;
	}

}
