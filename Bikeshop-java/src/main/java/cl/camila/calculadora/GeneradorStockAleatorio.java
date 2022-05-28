package cl.camila.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneradorStockAleatorio {
	
	public List<Integer> ventasRandom(){
		
		ArrayList<Integer> stock = new ArrayList<Integer>();
		Random claseRandom = new Random();
		for (int i = 0; i<5; i++) {
			int stockTemp = 0 + claseRandom.nextInt(51-0);
			stock.add(stockTemp);
		}

		return stock;
	}
	
	

}
