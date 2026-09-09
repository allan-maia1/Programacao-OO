package heranca;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(int numConta, String nomeCorrentista, double saldo, double limite) {
		super(numConta, nomeCorrentista, saldo);
		this.limite=limite;
		
	}

	double sacar(double valor) {
		if(valor>0 && valor<=(this.saldo+this.limite)) {
			this.saldo-=valor;
		}
		return this.saldo;
	}
}
