package innlevering1;
import static java.lang.Integer.parseInt;
import static javax. swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = parseInt(showInputDialog("Vennligst anngi et tall:"));
		int resultat =1;
		
		if(n>0) {
			for(int f =2; f <=n; f++) {
				resultat*=f;
			}
			System.out.println(resultat);	
			} else {
				System.out.println("skriv tallet på nytt:");
		
	}
	}
}
