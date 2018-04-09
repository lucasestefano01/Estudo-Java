import javax.swing.JOptionPane;

public class OutputWindow extends Output {
	public void imprimir(String mensagem) {
		JOptionPane.showMessageDialog(null,mensagem);
		
	}
	
	public void imprimir(String... mensagens) {
		for(String mensagem : mensagens) {	
			JOptionPane.showMessageDialog(null,mensagem);
		}
	}

}
