package trabalhoqt1;

public class Boleto {
	
	//atributos
	
	String codigoBoleto, dataBoleto;
	double valorPago;
	
	//construtor
	
	public Boleto(String codigoBoleto, String dataBoleto, double valorPago){
		
		this.codigoBoleto = codigoBoleto;
		this.dataBoleto = dataBoleto; 
		this.valorPago = valorPago;
			
	}
	
	
	//getters e setters
	
	public String getCodigoBoleto(){
		
		return this.codigoBoleto;
		
	}
	
	public void setCodigoBoleto(String codigoboleto){
		
		this.codigoBoleto = codigoboleto;
		
	}

	public String getDataBoleto(){
		
		return this.dataBoleto;
		
	}
	
	public void setDataBoleto(String databoleto){
		
		this.dataBoleto= databoleto;
		
	}
	
	public double getValorPago(){
		
		return this.valorPago;
		
	}
	
	public void setValorPago(double valorpago){
		
		this.valorPago = valorpago;
		
	}


	
	
	
	
	
}
