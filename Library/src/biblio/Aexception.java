package biblio;
import javax.swing.JOptionPane;
public class Aexception extends Exception{

	    public Aexception(String message) {
	        super(message);
	        JOptionPane.showMessageDialog(null, message, "Informations", JOptionPane.PLAIN_MESSAGE);
	    }
	    
	    public Aexception(Throwable cause) {
	        super(cause);
	    }
	    
	    public Aexception(String message, Throwable cause) {
	        super(message, cause);
	    }
	    
	    
	}


