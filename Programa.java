package banco;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta sergio;
		sergio = new Conta();
		
	
		
		sergio.setNome("Sergio R dos Santos");
		sergio.getSaldo();
		sergio.setSaldo(50 * 4);
		sergio.getNumConta();
		sergio.setNumConta(14962-5);
		sergio.setLimite(1.354000);
		sergio.getLimite();
		
		
		System.out.println(sergio.getNome());
		System.out.println(sergio.getSaldo());
		System.out.println(sergio.getNumConta());
		System.out.println(sergio.getLimite());
		
	
	}
	

}
