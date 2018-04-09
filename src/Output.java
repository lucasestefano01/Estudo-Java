
public class Output {
	public void imprimir(String mensagem) {
		System.out.println(mensagem);
		
	}
	
	public void imprimir(String... mensagens) {
		for(String mensagem : mensagens) {	
			System.out.println(mensagem);
		}
	}

}
