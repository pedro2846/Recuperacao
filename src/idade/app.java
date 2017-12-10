package idade;

import java.util.Scanner;

public class app {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String nome1,nome2,nome3;
		Integer idade1,idade2, idade3;
		
		System.out.print("Informe o nome da primeira pessoa: ");
		nome1 = scan.next();
		System.out.print("Informe a primeira idade: ");
		idade1 = scan.nextInt();
		System.out.print("Informe o nome da segunda pessoa: ");
		nome2 = scan.next();
		System.out.print("Informe a segunda idade: ");
		idade2 = scan.nextInt();
		System.out.print("Informe o nome da terceira pessoa: ");
		nome3 = scan.next();
		System.out.print("Informe a terceira idade: ");
		idade3 = scan.nextInt();
		
		scan.close();
		
		if ((idade1 > idade2) && (idade1 > idade3))
			System.out.println("O mais velho é :" + nome1);	
		if ((idade1 < idade2) && (idade1 < idade3))
			System.out.println("O mias novo é: " +nome1);
		if ((idade2 > idade1) && (idade2>idade3))
			System.out.println("O mais velho é: " +nome2);
		if ((idade2 < idade1) && (idade2<idade3))
			System.out.println("O mais novo é: " +nome2);
		if((idade3>idade1)&&(idade3>idade2))
			System.out.println("O mais velho é: " +nome3);
		if((idade3<idade1)&&(idade3<idade2))
			System.out.println("O mais novo é: " +nome3);
	}
}
