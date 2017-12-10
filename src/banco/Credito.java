package banco;

import java.util.Scanner;
public class Credito {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double Sm;
		Double Cr;
		System.out.println("Qual foi o seu saldo médio no ultimo ano:");
		Sm = teclado.nextDouble();
		if(Sm <=200.) {
			Cr = 0.;
			System.out.println("Seu saldo médio foi de: " + Sm + " e seu crédito foi de: " + Cr);
		}
		if((Sm>200.) && (Sm<= 400.)) {
			Cr = Sm*20/100;
			System.out.println("Seu saldo médio foi de: " + Sm + " e seu crédito foi de: " + Cr);		
		}
		if((Sm>400.) && (Sm<= 600.)) {
			Cr = Sm*30/100;
			System.out.println("Seu saldo médio foi de: " + Sm + " e seu crédito foi de: " + Cr);		
		}
		if((Sm>600.)) {
			Cr = Sm*40/100;
			System.out.println("Seu saldo médio foi de: " + Sm + " e seu crédito foi de: " + Cr);		
		}
		}

	}

