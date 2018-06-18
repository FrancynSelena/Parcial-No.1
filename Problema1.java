import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double iva=0.21, pr, prt; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el precio del produto: "); 
		pr=scan.nextFloat();
		prt=(pr*iva)+pr;
		System.out.println("El precio total del producto con el IVA es de: " +prt);
		scan.close();
	}

}