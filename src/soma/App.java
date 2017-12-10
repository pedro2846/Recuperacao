package soma;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class App {
	public static void main(String[] args){
		
		ArrayList<Double> num = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero diferente de 0: ");
		
		while (!num.contains(0.)) {
		num.add(scan.nextDouble());	
		}
		
		double soma = 0.;
		for (int i = 0; i<num.size(); i++) {
			soma = soma + num.get(i);
		}
		System.out.println("Ordem dos valores digitados: " + num);
		System.out.println("A soma dos valores é :"+soma);
		System.out.println("A media dos valores é :"+ (soma/(num.size()-1)));		
		}
			
		
		
		
	}

