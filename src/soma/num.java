package soma;
import java.util.ArrayList;

public class num {
	private Double num;


	public num() {
		
	}
	
	public void setNum(Double num) {
		this.num = num;
	}
	public Double getNum() {
		return num;
	}
	
	  public ArrayList<Double> lista(){  
	      ArrayList<Double> num = new ArrayList<Double>();
	      num.add(getNum());
	      System.out.println("\n Numeros da lista: " + num.size());
	      return num;
	   }

	public static void add(Double d) {
		// TODO Auto-generated method stub
		
	}

}