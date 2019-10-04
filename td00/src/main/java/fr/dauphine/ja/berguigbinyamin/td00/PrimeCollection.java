package fr.dauphine.ja.berguigbinyamin.td00;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{ 
	java.util.ArrayList<Integer> numbers;
	
    public PrimeCollection(ArrayList<Integer> numbers) {
		super();
		this.numbers = numbers;
	}
    
    public void initRandom(int n, int m) {
    	for (int i = 0; i<n; i++) {
    		this.numbers.add((int)Math.floor(Math.random() * (m - 0 + 1)) + 0);
    	}

    }
    
    public Boolean isPrime(int p) {
    	if (p==0) {
    		return false;
    	}
    	for(int i=2; i<p; i++) {
    		if(p%i==0) {
    			return false;
    		}	
    	}
    	return true;
    }
    
    public void printPrimes() {
    	for(int i=0; i<this.numbers.size();i++) {
    		if (isPrime(this.numbers.get(i))) {
    			System.out.println(this.numbers.get(i));
    		}
    	}
    	
    }

	public static void main( String[] args )
    {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		PrimeCollection a = new PrimeCollection(numbers);
		a.initRandom(100,2000);
		System.out.println(a.numbers);
        System.out.println( "Bonjour!" );
        System.out.println(a.isPrime(4));
        a.printPrimes();
    }
}
