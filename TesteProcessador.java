package trabalhoqt1;
import org.junit.jupiter.api.*;


public class TesteProcessador {
	@Test
	public void testProcessador() {
			
		Fatura fat = new Fatura("04/07/2021","Paulo",500);
		Boleto bol = new Boleto("12","04/07/2021",500);
		Processador proc = new Processador();
		Assertions.assertEquals(true, proc.pagamentoProcessador(bol,fat));
		
	}
	
}
