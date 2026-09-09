package polimorfismo;

public class Pix extends MeioPagamento implements OpenFinance{
	
	public void processar(double valor) {
		System.out.println("[PIX] Processando pagamento de R$ "+ valor);
		System.out.println("[PIX] QR Code gerada. Chave pix validada... Pagamento realizado");
	}

	@Override
	public void transferir() {
		System.out.println("[PIX] Implementação da OpenFinance");
		
	}

}
