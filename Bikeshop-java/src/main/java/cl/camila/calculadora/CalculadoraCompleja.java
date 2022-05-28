package cl.camila.calculadora;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraCompleja implements CalculadoraStockSeguridad {

	@Override
	public List<Integer> calcula(List<Integer> stock) {
		List<Integer> stockSeguridad = new ArrayList<Integer>();
		
		for (int i = 0; i< stock.size(); i++) {
			int stockTemp = stock.get(i);
			
			if (stockTemp >20){
				stockSeguridad.add(2+ ((int)(stockTemp*0.1)));
			} else if (stockTemp >=10 && stockTemp<20) {
				stockSeguridad.add(2+ ((int)(stockTemp*0.05)));
			} else {
				stockSeguridad.add(2);
			}
		}

		return stockSeguridad;
	}

}
