package advance.dev;

public class Rectangle extends Shape{
    double a;
    double b;
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2*(a+b);
	}
	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return a*b;
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return String.format("dien tich cua hinh chu nhat la : a=%f - b=%f ", a,b);
    }

		}

	
	


