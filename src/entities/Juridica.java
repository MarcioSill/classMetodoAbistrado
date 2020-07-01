package entities;

public class Juridica extends Imposto {
	private Integer funcionario;
	
	public Juridica() {
		super();
	}	

	public Juridica(String name, Double rendaAno, Integer funcionario) {
		super(name, rendaAno);
		this.funcionario = funcionario;
	}
	
	
	public Integer getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Integer funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public Double impostoPago() {
	   if (funcionario > 10) {
		  return rendaAno * 0.14; 
	   }
	   else
		return rendaAno * 0.16;
	}

}
