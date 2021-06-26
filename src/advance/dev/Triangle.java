package advance.dev;


public class Triangle extends Shape{
    double a;
    double b;
    double c;
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi();
		return Math.sqrt(p*(p-a)+(p-b)+(p-c));
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return String.format("dien tich cua hinh tam giac la : a=%f - b=%f - c=%f", a,b,c);
    }
}