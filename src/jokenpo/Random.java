package jokenpo;
public class Random {
	public static int randInt(int min, int max) { 
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum; 
	}

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
