import apps.FacebookMensager;
import apps.MSNMensager;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main (String[] args) {
		ServicoMensagemInstantanea smi = null;
		/*
		 		NÃO SE SABE QUAL APP
		 		MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEN
		 */
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMensager();
		else if(appEscolhido.contentEquals("fbc"))
			smi = new FacebookMensager();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	
	}

}
