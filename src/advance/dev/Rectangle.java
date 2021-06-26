package advance.dev;

public class Rectangle extends Shape{
	double canhA;
	double canhB;
	
	
	public Rectangle(String name, double canhA, double canhB) {
		super(name);
		this.canhA = canhA;
		this.canhB = canhB;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2*(canhA+canhB);
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return canhA*canhB;
	}

	@Override
	public String toString() {
		return "Rectangle " + name+" [canhA=" + canhA + ", canhB=" + canhB + "]";
	}
}
	
	


