package entities;

public class Fisica extends Imposto {
	private Double gastoSaude;
	
	public Fisica() {
		super();
	}	

	public Fisica(String name, Double rendaAno, Double gastoSaude) {
		super(name, rendaAno);
		this.gastoSaude = gastoSaude;
	}
		

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double impostoPago() {
		
	 if (rendaAno >= 20000.00){
		 return (rendaAno * 0.25) - (gastoSaude * 0.5);
	 }
	 else
	 {
		 return (rendaAno * 0.15) - (gastoSaude * 0.5);
	 }
	}
	
}
