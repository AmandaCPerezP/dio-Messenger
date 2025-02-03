package apps;

public class MSNMensager extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo MSN.");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo MSN.");
		
	}
	
}
