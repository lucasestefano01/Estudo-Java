import javax.swing.JOptionPane;


public class Usuario extends Pessoa {
	Dieta dieta;
	String objetivo;
		
	public void cadastrar() {
		
		Usuario user1 = new Usuario();
				
		user1.nome = JOptionPane.showInputDialog("Digite seu Nome:");
		user1.peso = JOptionPane.showInputDialog("Digite seu Peso:");
		user1.altura = JOptionPane.showInputDialog("Digite sua Altura:");
		user1.objetivo = JOptionPane.showInputDialog("Digite seu Objetivo:");
		
		String tudo = "Seu Nome �:  "+ user1.nome + "\nSeu Peso �\t:  "+ user1.peso +" Quilos"+ 
				"\nSua Altura �:  "+ user1.altura+ " Centimetros" + "\nSeu Objetivo �:  "+ user1.objetivo 
				+ "\n\n Aperte OK para come�ar a calcular suas calorias!";
		
		Output output = new OutputWindow();
		output.imprimir(tudo);
		
		Dieta d1 = new Dieta();
		d1.calcular();
	}
}

	
	