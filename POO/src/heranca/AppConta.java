package heranca;

public class AppConta {

	public static void main(String[] args) {
		Conta c1 = new Conta(11, "Allan", 800.50);
		ContaEspecial c2 = new ContaEspecial(22, "Alberto", 900.80, 400.00);
		
//		System.out.println("ID: "+c1.numConta + "\nCorrentista: "+ c1.nomeCorrentista + "\nSaldo: "+ c1.saldo);
//		System.out.println("-------------");
//		System.out.println("ID: "+c2.numConta + "\nCorrentista: "+ c2.nomeCorrentista + "\nSaldo: "+ c2.saldo);
		
		c1.sacar(200);
		
		System.out.println("ID: "+c1.getNumConta() + "\nCorrentista: "+ c1.getNomeCorrentista() + "\nSaldo: "+ c1.getSaldo());
		System.out.println("-------------");
		c2.sacar(1200);
		System.out.println("ID: "+c2.getNumConta() + "\nCorrentista: "+ c2.getNomeCorrentista() + "\nSaldo: "+ c2.getSaldo());
		
	}

}
