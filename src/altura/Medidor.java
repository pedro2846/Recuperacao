package altura;


public class Medidor {
	public static void main(String[] args) {
		Double alturaFulano = 1.5;
		Double alturaCiclano = 1.1;
		Integer ano = 0;
		for(int i = 1; alturaCiclano <= alturaFulano; i++) {
			alturaCiclano = alturaCiclano	+ 0.03;
			alturaFulano = alturaFulano 	+ 0.02;	
			System.out.println(i);
			ano = i;
		}
		System.out.println("Só depois de: " + ano + " anos.");

	
	
	
	}
}
