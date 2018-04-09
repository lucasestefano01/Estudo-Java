import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Teste{
	
  public static void main(String[] a){
	  JDialog.setDefaultLookAndFeelDecorated(true);
	    Object[] selectionValues = { "Cadastrar Novo Usuário", "Calcular Calorias"};
	    String initialSelection = "Cadastrar Novo Usuário";
	    Object selection = JOptionPane.showInputDialog(null, "\t MENU DE SELEÇÃO"
	    		+ "\n\nEscolha uma opção abaixo:",
	        "Green Project", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
	    
	    if(selection == "Cadastrar Novo Usuário"){
	    	Usuario user1 = new Usuario();
	    	user1.cadastrar();
	    }
	    
	    else if(selection =="Calcular Calorias"){
	    	Dieta d1 = new Dieta();
			d1.calcular();	
	    }
  	}
}