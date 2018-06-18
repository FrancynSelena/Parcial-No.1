import java.util.Scanner;

public class Problema3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y=0;
		
		Scanner reander = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		
		x = reander.nextInt();
		
		for(int i=1; i<=x; ++i){ 
		   if(x%i==0){
			   ++y;
		   }	
	    }
		if(y==2){
			System.out.println("Es primo");
		}
		else{
			System.out.println("No es primo");
		reander.close();	
		}
    }
}