import static org.junit.jupiter.api.Assertions.*;
import junit.framework.TestCase;


import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author danaska
 *
 */
class Circulo_DAMTest extends TestCase {

	@Test
	public void AreaCirculo1() {
		Circulo_DAM circulo = new Circulo_DAM (7, "circulo");
		double area = circulo.area();
		assertEquals(153.9384, area);
		
	}
	
	@Test
	public void PerimetroCirculo1() {
		Circulo_DAM circulo = new Circulo_DAM (7, "circulo");
		double perimetro=circulo.perimetro();
		assertEquals(43.9824, perimetro);
	}
	
	@Test
	public void AreaCirculo2() {
		Circulo_DAM circulo = new Circulo_DAM (0, "circulo");
		double area = circulo.area();
		assertEquals(0.0, area);
		
	}
	
	@Test
	public void PerimetroCirculo2() {
		Circulo_DAM circulo = new Circulo_DAM (0, "circulo");
		double perimetro=circulo.perimetro();
		assertEquals(0.0, perimetro);
	}
	
	@Test
	public void AreaCirculo3() {
		Circulo_DAM circulo = new Circulo_DAM (-3, "circulo");
		double area = circulo.area();
		assertEquals(28.2744, area);
		
	}
	
	@Test
	public void PerimetroCirculo3() {
		Circulo_DAM circulo = new Circulo_DAM (-3, "circulo");
		double perimetro=circulo.perimetro();
		assertEquals(18.8496, perimetro);
	}
	

}
