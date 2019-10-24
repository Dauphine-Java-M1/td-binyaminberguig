package fr.dauphine.ja.berguigbinyamin.shapes;

import java.util.ArrayList;

public class Point {
	
	public int x,y;
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	
	public Point(Point pt){
		this.x=pt.x;
		this.y=pt.y;
	}
	
	public boolean isSameAs(Point pt) {
		return this.x==pt.x && this.y==pt.y;
	}
	
    public static void main( String[] args )
    {
    	Point p1=new Point(1,2);
    	Point p2=new Point(2,2);
    	Point p3=new Point(1,2);
    	
    	System.out.println(p1.isSameAs(p2));
    	System.out.println(p1.isSameAs(p3));
    	
    	/* Exercice 3 TD01
    	LigneBrisee l = new LigneBrisee(4);
    	l.add(p1);
    	l.add(p1);
    	l.add(p3);
    	l.add(null);
    	for(int i = 0; i<l.lesPoints.length; i++) {
    		System.out.println(l.lesPoints[i].x+" "+l.lesPoints[i].y);

    	}
    	l.pointCapacity();
    	l.nbPoints();
    	System.out.println(l.contains(null));
    	*/
    	
    	LigneBrisee l = new LigneBrisee();
    	l.lesPoints.add(p1);
    	l.lesPoints.add(p2);
    	l.lesPoints.add(p3);
    	
    	for(int i = 0; i<l.lesPoints.size(); i++) {
    		System.out.println(l.lesPoints.get(i).x+" "+l.lesPoints.get(i).y);

    	}
    	System.out.println(l.lesPoints.contains(p2));
    	System.out.println("il y a "+l.lesPoints.size()+" points dans notre ligne brisée");
    	
    }
	
}
