package fr.dauphine.ja.berguigbinyamin.shapes;


public class LigneBrisee {
	Point[] ligne;
	int a[] = new int[3];
	int b;
	
	public LigneBrisee(int max) {
		this.ligne = new Point[max];
		
	}
	
	public void add(Point p) {
		a[1]= 2;
		a[0]= 1;
		
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//Point[] ligne = ligne.push(p);

	}
	
	
}
