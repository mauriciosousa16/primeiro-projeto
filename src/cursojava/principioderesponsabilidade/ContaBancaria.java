package cursojava.principioderesponsabilidade;

public class ContaBancaria {
	
	private String descricao;
	private double saldo = 8000;
	
	
	public void soma100Reais () {
		saldo += 100;
	}
	
	public void Diminuir100Reais() { 
		saldo -= 100;
	}
	public void SacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void DepositarDineheiro(double  deposito) {
		saldo += deposito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	

}
