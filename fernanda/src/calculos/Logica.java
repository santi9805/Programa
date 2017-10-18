package calculos;


import javax.swing.JOptionPane;

public class Logica {
	
		// DECLARACION DE VARIABLES
		private float xa, xb, ya, yb; 
		private double beta, alfa, Xp, Yp, Xb, cotangentealfa, cotangentebeta, betar, alfar; 
		private int opcion,respuesta=0;
		
	public void calculos(){
		// CICLO PARA REPETIR CON RESPUESTA "SI"
		do {
			// SALIDA EN PANTALLA DEL MENÚ
			
			opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hallar? \n \t1.- Xp\n \t2.- Yp\n \t3.- Xb " ));

			// RESTRICCIÓN PARA NO ESCRBIR UN NUMERO MENOR A 1 Y MAYOR DE 3
			while (opcion <= 0 || opcion > 3) {
				opcion=Integer.parseInt(JOptionPane.showInputDialog("Intente Nuevamente \n \t1.- Xp\n \t2.- Yp\n \t3.- Xb " ));
				
			}

			// SWITCH PARA CADA CASO DEL MENÚ
			switch (opcion) {
			// CASO Xp
			case 1:
				    entrada(1);
					//CONVERSION ALFA Y BETA A RADIANES
					betar= Math.toRadians(beta);
					alfar=Math.toRadians(alfa);
				
					//CALCULO COTANGENTE DE ALFA Y BETA
					 cotangentebeta=(Math.cos(betar)/Math.sin(betar));
					 cotangentealfa=(Math.cos(alfar)/Math.sin(alfar));
					 
					 // OPERACION MATEMATICA	
					 Xp= ((xa*cotangentebeta)+(xb*cotangentealfa)+(yb-ya))/(cotangentebeta+cotangentealfa);

				// IMPRESION EN PANTALLA RESULTADO
				JOptionPane.showMessageDialog(null, "Xp ="+Xp);

				break;

			// CASO Yp
			case 2:
				
				entrada(1);
				//CONVERSION ALFA Y BETA A RADIANES
				betar= Math.toRadians(beta);
				alfar=Math.toRadians(alfa);
				 
				//CALCULO COTANGENTE DE ALFA Y BETA
				cotangentebeta=(Math.cos(betar)/Math.sin(betar));
				cotangentealfa=(Math.cos(alfar)/Math.sin(alfar));
				
				//OPERACION MATEMATICA
				Yp= (((ya*cotangentebeta)+(yb*cotangentealfa))+(xa-xb))/(Math.cos(alfar)/(cotangentebeta+cotangentealfa));

			// IMPRESION EN PANTALLA RESULTADO
			JOptionPane.showMessageDialog(null, "Yp ="+Yp);
			
				break;

			// CASO Xb
			case 3:
				
				entrada(0);	
				//CONVERSION ALFA Y BETA A RADIANES
				betar= Math.toRadians(beta);
				alfar=Math.toRadians(alfa);
				
				//CALCULO COTANGENTE DE ALFA Y BETA
				cotangentebeta=(Math.cos(betar)/Math.sin(betar));
				cotangentealfa=(Math.cos(alfar)/Math.sin(alfar));
				
				//OPERACION MATEMATICA
				Xb= (((xb*cotangentealfa)+(xa*cotangentebeta))+(ya-yb))/(Math.cos(alfar)/(cotangentebeta+cotangentealfa));

			// IMPRESION EN PANTALLA RESULTADO
			JOptionPane.showMessageDialog(null, "Xb ="+Xb);
			
				break;
			}
				
			// PREGUNTA PARA REALIZAR UN NUEVO CALCULO
			respuesta=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para realizar un nuevo calculo, digite cualquier numero para terminar"));
			
		} while (respuesta == 1);
	}
	
	public void entrada(int j){
		
		if (j==1){
		xa=Integer.parseInt(JOptionPane.showInputDialog("Digite xa:"));
		xb=Integer.parseInt(JOptionPane.showInputDialog("Digite xb:"));
		ya=Integer.parseInt(JOptionPane.showInputDialog("Digite ya:"));
		yb=Integer.parseInt(JOptionPane.showInputDialog("Digite yb:"));
		beta=Integer.parseInt(JOptionPane.showInputDialog("Digite beta(grados):"));
		alfa=Integer.parseInt(JOptionPane.showInputDialog("Digite alfa(grados):"));
		}else{
			xa=Integer.parseInt(JOptionPane.showInputDialog("Digite xa:"));
			xb=Integer.parseInt(JOptionPane.showInputDialog("Digite xp:"));
			ya=Integer.parseInt(JOptionPane.showInputDialog("Digite ya:"));
			yb=Integer.parseInt(JOptionPane.showInputDialog("Digite yp:"));
			beta=Integer.parseInt(JOptionPane.showInputDialog("Digite beta(grados):"));
			alfa=Integer.parseInt(JOptionPane.showInputDialog("Digite alfa(grados):"));
		}
		
	}

}
