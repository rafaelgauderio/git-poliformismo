package entities;

public class FuncionarioTercerizado extends Funcionario {
	
	private Double despesaAdicional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento()+ despesaAdicional*1.10;
	}

}
