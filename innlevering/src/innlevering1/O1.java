package innlevering1;
import static javax.swing.JOptionPane.*;
public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tallTxt = showInputDialog("Bruttolønn:");
int lønn = Integer.parseInt(tallTxt);

		
		
double Trinnskatt0 = 0;
double Trinnskatt1 = 0.0093;
double Trinnskatt2 = 0.0241;
double Trinnskatt3 = 0.1152;
double Trinnskatt4 = 0.1452;


if (lønn <=0 && lønn>=164100) {
	showMessageDialog(null, "Din lønn etter skatt:" + lønn*Trinnskatt0);	
}
if (lønn <=164099 && lønn>=230950){
	showMessageDialog(null, "Din lønn etter skatt:" + lønn*Trinnskatt1);
	
}
if (lønn<=230949 && lønn>=580650) {
	showMessageDialog(null, "Din lønn etter skatt:" + lønn*Trinnskatt2);
	
}
if (lønn<=580649 && lønn>=934050){
	showMessageDialog(null, "Din lønn etter skatt:" + lønn*Trinnskatt3);

}
if (lønn<=934049) {
	showMessageDialog(null, "Din lønn etter skatt:" + lønn*Trinnskatt4);
}
	}

}
