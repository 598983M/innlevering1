package innlevering1;
import static java.lang.Integer.parseInt;
import static javax. swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	final int N = 10;
	
	for(int j=1; j<=N; j++) {
	int poeng = parseInt(showInputDialog("Din poengsum:"));
	
	while (poeng >100 || poeng < 0 ) {
		poeng = parseInt(showInputDialog("ugyldig poengsum, skriv på nytt:"));	
	}
	if(poeng >= 0 && poeng <=39) {
		System.out.println("F");
	}else if (poeng <=40 && poeng <=49) {
		System.out.println("E");
	}else if (poeng <=50 && poeng <=59) {
		System.out.println("D");
	}else if (poeng <=60 && poeng <=79) {
		System.out.println("C");
	}else if (poeng <=80 && poeng <=89) {
		System.out.println("B");
	}else if (poeng <=90 && poeng <=100) {
		System.out.println("A");
		
	}
	
	
	}

	}

	
	


}