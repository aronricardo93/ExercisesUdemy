package fixacao6.entities;

public class PessoaJuridica extends Pessoa{

	private Integer numeroDeFuncionarios;
	
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double imposto() {

		return (getNumeroDeFuncionarios() <= 10) ? getRendaAnual() * 0.16 : getRendaAnual() * 0.14;
		
	}

}
