package polimorfismo;

class Checkout {
	
	public void finalizarCompra(MeioPagamento meioEscolhido, double total) {
		System.out.println("INICIANDO FECHAMENTO DO PEDIDO");
		
		//Aqui acontece o polimorfismo
		meioEscolhido.processar(total);
		
		System.out.println("\nPEDIDO FINALIZADO COM SUCESSO");
	}
	
}
