package trabalhoqt1;

public class Fatura {
	
	//atributos
	
	private String dataFatura, nomeCliente;
	private double valorFatura;
	public boolean pago = false;
	
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
	
	public void verificaDivida() {
		
		if (getValorFatura()<=0) {
			
			this.setPago(true);
			
		}
		
	}
	
	public boolean getPago() {
		
		return this.pago;
		
	}
	
	public void setPago(boolean pagamento) {
		
		this.pago = pagamento;
		
	}
	
}
