package innlevering1;
import static javax.swing.JOptionPane.*;
public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tallTxt = showInputDialog("Bruttolonn:");
int lonn = Integer.parseInt(tallTxt);

		
		
double Trinnskatt0 = 0;
double Trinnskatt1 = 0.0093;
double Trinnskatt2 = 0.0241;
double Trinnskatt3 = 0.1152;
double Trinnskatt4 = 0.1452;


if (lonn >=0 && lonn<=164100) {
	showMessageDialog(null, "Din lønn etter skatt:" + lonn*Trinnskatt0);	
}
if (lonn >=164099 && lonn<=230950){
	showMessageDialog(null, "Din lønn etter skatt:" + lonn*Trinnskatt1);
	
}
if (lonn>=230949 && lonn<=580650) {
	showMessageDialog(null, "Din lønn etter skatt:" + lonn*Trinnskatt2);
	
}
if (lonn>=580649 && lonn<=934050){
	showMessageDialog(null, "Din lønn etter skatt:" + lonn*Trinnskatt3);

}
if (lonn>=934049) {
	showMessageDialog(null, "Din lønn etter skatt:" + lonn*Trinnskatt4);
}
	}

}
