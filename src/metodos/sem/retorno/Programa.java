package metodos.sem.retorno;

public class Programa {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 500.0;
		conta1.titular = "Ronney";
		conta1.sacar(20);
		
		System.out.println(conta1.saldo);
		
//		public	  geral
//		private   classe
//		protected pacote
	}
	
}
