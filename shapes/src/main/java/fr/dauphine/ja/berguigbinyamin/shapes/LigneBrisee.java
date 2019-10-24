package fr.dauphine.ja.berguigbinyamin.shapes;

import java.util.LinkedList;

public class LigneBrisee {
	
	/* 
	static int compt = 0;
	Point[] lesPoints;
	
	public LigneBrisee(int max) {
		this.lesPoints = new Point[max];
		
	}
	
	public void pointCapacity() {
		System.out.println(this.lesPoints.length);
		
	}
	
	public void nbPoints() {
		System.out.println(compt);
		
	}
	public boolean contains(Point p) {
		for (Point p2: lesPoints) {
			if(p2.x==p.x & p2.y==p.y) {
				return true;
			}
		}
		return false;
		
	}
	
	public void add(Point p) {
		lesPoints[compt] = p;
		compt++;
	}
	*/
	
	LinkedList<Point> lesPoints;
	
	public LigneBrisee() {
		this.lesPoints = new LinkedList<Point>();
		
	}
	
}
