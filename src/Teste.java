import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Teste{
	
  public static void main(String[] a){
	  JDialog.setDefaultLookAndFeelDecorated(true);
	    Object[] selectionValues = { "Cadastrar Novo Usu�rio", "Calcular Calorias"};
	    String initialSelection = "Cadastrar Novo Usu�rio";
	    Object selection = JOptionPane.showInputDialog(null, "\t MENU DE SELE��O"
	    		+ "\n\nEscolha uma op��o abaixo:",
	        "Green Project", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
	    
	    if(selection == "Cadastrar Novo Usu�rio"){
	    	Usuario user1 = new Usuario();
	    	user1.cadastrar();
	    }
	    
	    else if(selection =="Calcular Calorias"){
	    	Dieta d1 = new Dieta();
			d1.calcular();	
	    }
  	}
}