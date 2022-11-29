package cursojava.principioderesponsabilidade;

public class TesteContaBancaria {
	
	
	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("ocnta do Antonia mesquita");
		
		System.out.println(bancaria);
		
	//	bancaria.Diminuir100Reais();
	//	System.out.println(bancaria);
		
    	bancaria.SacarDinheiro(800);
		System.out.println(bancaria);
		
		bancaria.DepositarDineheiro(1500);
		System.out.println(bancaria);
		
		
	}

}
