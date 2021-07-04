package trabalhoqt1;

public class Fatura {
	
	//atributos
	
	private String dataFatura, nomeCliente;
	private double valorFatura;
	public boolean pago;
	
	//construtor
	
	public Fatura(String dataFatura, String nomeCliente, double valorFatura){
		
		this.dataFatura = dataFatura;
		this.nomeCliente = nomeCliente;
		this.valorFatura = valorFatura;
		
	}
	
	//getters e setters
	
	public String getDataFatura(){
	
		return this.dataFatura;
		
	}
	
	public void setDataFatura(String datafatura){
		
		this.dataFatura = datafatura;
		
	}

	public String getNomeCliente(){
		
		return this.nomeCliente;
		
	}
	
	public void setNomeCliente(String nomecliente){
		
		this.nomeCliente= nomecliente;
		
	}
	
	public double getValorFatura(){
		
		return this.valorFatura;
		
	}
	
	public void setValorFatura(double valorfatura){
		
		this.valorFatura = valorfatura;
		
	}
	
	/*public void pagamento(Boleto bol) {
		
		double boleto = bol.getValorPago();
		System.out.println("O valor da fatura era "+ getValorFatura());
		this.setValorFatura(getValorFatura()-boleto);
		verificaDivida();
		System.out.println("O valor da fatura agora é: "+ getValorFatura());
		if (this.pago == true) {
			
			System.out.println("A fatura está paga");
			
		}else {
			
			System.out.println("A fatura não está paga");
			
		}
		
	}*/
	
	public void verificaDivida() {
		
		if (getValorFatura()>0) {
			
			this.pago = false;
			
		}else {
			
			this.pago = true;
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
