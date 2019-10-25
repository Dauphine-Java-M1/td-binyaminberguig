package fr.dauphine.ja.berguigbinyamin.shapes;

public class Circle {
private Point p;
private int rayon;

public Circle(Point pt, int r) {
	this.p= pt;
	this.rayon = r;
}

public String toString(){
	return this.p+" rayon : "+this.rayon+"et sa surface:"+ this.surface() ;
}

public void translate(int dx, int dy){
	this.p= this.p.translate(dx, dy);
}

public Point getCenter() {
	return this.p;
}

double surface() {
	return Math.PI*this.rayon*this.rayon;
}
}