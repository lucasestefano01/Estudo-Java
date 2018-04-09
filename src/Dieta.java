import javax.swing.JOptionPane;

public class Dieta {
	public void calcular () {
		
		 int confir  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de refeições: "));
		
			int n = 0; int cal = 0;
			for (int i=0; i<confir;i++){
				String[] choices = {"Ovo - 1 unidade","Carne - 100g","Frango - 100g",
					"Queijo - 50g","Atum - 100g","Arroz Integral - 100g"};
				Object input =  JOptionPane.showInputDialog(null, "TABELA DE ALIMENTOS\n\nSelecione um Alimento:",
					"Green Project", JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
				Output output = new Output();
				output.imprimir("voce escolheu "+input);
				n= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de calorias do alimento"));
				cal+=n;
			}
			
			Output output = new OutputWindow();
			output.imprimir("Você Ingeriu "+cal+" Calorias!");
	}
}
