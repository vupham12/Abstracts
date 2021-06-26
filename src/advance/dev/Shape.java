package advance.dev;

public  abstract class Shape {
    String name;
    abstract double chuVi();
    abstract double dienTich();
    
	public Shape(String name) {
		this.name = name;
	}
    

}
