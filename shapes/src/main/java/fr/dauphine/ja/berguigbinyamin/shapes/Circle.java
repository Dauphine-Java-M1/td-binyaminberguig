package fr.dauphine.ja.berguigbinyamin.shapes;

public class Circle {
Point p;
int rayon;

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

public int getRadius() { 
return   this.rayon;
}

public Boolean contains(Point pt) {
	if(Math.sqrt(Math.pow(pt.getX()-p.getX(), 2)+Math.pow(p.getY()-pt.getY(), 2))<rayon) {
		return true;	
	}
	return false;
	}


public static boolean contains(Point p, Circle...circles){
	for(Circle c : circles){
		if(c.contains(p)){
			return true;
		}
	}
	return false;
}
}