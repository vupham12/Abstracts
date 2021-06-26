package advance.dev;

public class Circle extends Shape{
    double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}
    @Override
   public String toString() {
   	// TODO Auto-generated method stub
   	return String.format("dien tich cua hinh tron la : r=%f ", r);
   }
}
