package entities;

public abstract class Imposto {
	private String name;
	protected Double rendaAno;
	
	public Imposto() {
		
	}

	public Imposto(String name, Double rendaAno) {
		this.name = name;
		this.rendaAno = rendaAno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAno() {
		return rendaAno;
	}	
	
	public abstract Double impostoPago();

}
