
public class ComputadorPedrinho {
	public static void main (String[] args) {
		System.out.println("MSN");
		MSNMensager msn = new MSNMensager();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("Facebook");
		FacebookMensager fcb = new FacebookMensager();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("Telegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
