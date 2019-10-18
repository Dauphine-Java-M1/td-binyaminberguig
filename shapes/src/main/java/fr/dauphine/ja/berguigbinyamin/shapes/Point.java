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
    	Point p2=p1;
    	Point p3=new Point(1,2);
    	ArrayList<Point> list = new ArrayList<Point>();
    	list.add(p1);
    	
    	LigneBrisee l = new LigneBrisee(4);
    	Point p=new Point(1,2);
    	l.add(p);
    	
    	//System.out.println(p1.isSameAs(p2));
    	//System.out.println(p1.isSameAs(p3));
    	/*
    	LigneBrisee l = new LigneBrisee(4);
    	Point p=new Point(1,2);
    	l.add(p);
    	System.out.println(l.ligne.length);
    	for(int i = 0; i<l.ligne.length; i++) {
    		System.out.println(l.ligne[i]);
    	}
    	*/

    	
    	
    	
    }
	
}
