package trabalhoqt1;

public class Processador {
	
	public Processador (){
			
			
			
	}
	
	public boolean pagamentoProcessador(Boleto bol, Fatura fat) {
		
		double boleto = bol.getValorPago();
		fat.setValorFatura(fat.getValorFatura()-boleto);
		fat.verificaDivida();
		if (fat.pago == true) {
			
			System.out.println("A fatura está paga");
			
		}else {
			
			System.out.println("A fatura não está paga");
			
		}
		
		return true;
		
	
	
	
	}


	
}
