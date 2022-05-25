package fixacao6.entities;

public class PessoaFisica extends Pessoa{

	private Double gastoSaude;
	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
		
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		
		Double impostoTotal;
		
		if(getRendaAnual() < 20000) {
			impostoTotal = getRendaAnual() * 0.15;
		}else {
			impostoTotal =  getRendaAnual() * 0.25;
		}
		
		if(getGastoSaude() > 0) {
			impostoTotal -= (getGastoSaude() * 0.5);
		}
		
		return impostoTotal;
		
	}

}
