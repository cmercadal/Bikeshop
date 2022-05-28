package cl.camila.EnsayoPTD_Bikeshop;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import cl.camila.calculadora.CalculadoraCompleja;
import cl.camila.calculadora.CalculadoraSimple;

@DisplayName("Test de calculo de stock de seguridad")
public class AppTest 
{
	private static Logger logger = Logger.getLogger("cl.camila.calculadora.CalculadoraStockSeguridad");
	private final CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
	private final CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
	
	
    @Test
    public void testCalculoSimple() {
		logger.info("Test calculadora simple");
		
		List<Integer> stock = new ArrayList<Integer>(Arrays.asList(10,20));
		
		List<Integer> respuesta = calculadoraSimple.calcula(stock);
		assertEquals(new ArrayList(Arrays.asList(2,2)),respuesta);
		
	}
    
    @Test
    public void testCalculoComplejo() {
		logger.info("Test calculadora compleja");
		
		List<Integer> stock = new ArrayList<Integer>(Arrays.asList(30,15));
		
		List<Integer> respuesta = calculadoraCompleja.calcula(stock);
		assertEquals(new ArrayList(Arrays.asList(5,2)),respuesta);
		
	}
    
    
    @Test
    public void testCalculoSimpleBordes() {
		logger.info("Test calculadora simple con condiciones borde");
		
		List<Integer> stock = new ArrayList<Integer>(Arrays.asList(50,0));
		
		List<Integer> respuesta = calculadoraSimple.calcula(stock);
		assertEquals(new ArrayList(Arrays.asList(2,2)),respuesta);
		
	}
    
    
    @Test
    public void testCalculoComplejoBordes() {
		logger.info("Test calculadora compleja");
		
		List<Integer> stock = new ArrayList<Integer>(Arrays.asList(0,50));
		
		List<Integer> respuesta = calculadoraCompleja.calcula(stock);
		assertEquals(new ArrayList(Arrays.asList(2,7)),respuesta);
		
	}
    
}
