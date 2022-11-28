package cursojava.principioderesponsabilidade;

public class TesteContaBancaria {
	
	
	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("ocnta do Mauricio");
		
		System.out.println(bancaria);
		
		bancaria.Diminuir100Reais();
		System.out.println(bancaria);
		
		bancaria.SacarDinheiro(500);
		System.out.println(bancaria);
		
		bancaria.DepositarDineheiro(1000);
		System.out.println(bancaria);
		
		
	}

}
