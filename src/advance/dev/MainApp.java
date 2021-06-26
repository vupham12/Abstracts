package advance.dev;

import java.util.Scanner;

public class MainApp {
	
    static final int NUMBER_TRIANGLE = 4;
    static final int NUMBER_CIRCLE = 3;
    static final int NUMBER_RECTANGLE = 3;
    
	static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hình tam giác: ");
		int i=0;
		for (; i < NUMBER_TRIANGLE; i++) {
			System.out.println("hình tam giác thứ "+(i+1));
			System.out.println("Nhập a: ");
			double a = sc.nextDouble();
			System.out.println("Nhập b: ");
			double b = sc.nextDouble();
			System.out.println("Nhập c: ");
			double c = sc.nextDouble();
			Triangle triangle = new Triangle(a, b, c);
			shapes[i] = triangle;
		}
		System.out.println("Nhập hình tròn");
		for (; i < NUMBER_TRIANGLE + NUMBER_CIRCLE; i++) {
			System.out.println("hình tròn thứ "+(i+1));
			System.out.println("Nhập r: ");
	        double r = sc.nextDouble();
			Circle circle = new Circle(r);
			shapes[i] = circle;
		}
		System.out.println("Nhập hình chữ nhật: ");
		for (; i < NUMBER_TRIANGLE + NUMBER_CIRCLE + NUMBER_RECTANGLE; i++) {
			System.out.println("hình chữ nhật thứ: "+(i+1));
			System.out.println("Nhập a : ");
			double a = sc.nextDouble();
			System.out.println("Nhập b : ");
			double b = sc.nextDouble();
			Rectangle rectangle = new Rectangle(a, b);
			shapes[i] = rectangle;
		}	
	}
	static void print(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}
	static void findmaxDienTich(Shape[] shapes) {
		Shape preMax = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if(preMax.dienTich() < shapes[i].dienTich()) {
				preMax=shapes[i];
			}
		}
		System.out.println("diện tích lớn nhất là:"+preMax.dienTich());
	}
	static void findmax(Shape[] shapes) {
		Shape preTri = shapes[0];
		Shape preCir = shapes[0];
		Shape preRec = shapes[0];
		int i=0;
		for (; i < NUMBER_TRIANGLE; i++) {
		if(preTri.dienTich() < shapes[i].dienTich()) {
			preTri = shapes[i];
		}
	}
		System.out.println("diện tích hình tam giác là: "+ preTri.dienTich());
		for (; i < NUMBER_CIRCLE; i++) {
		if(preCir.dienTich() < shapes[i].dienTich()) {
			preCir = shapes[i];
		}
	}
		System.out.println("diện tích hình tròn là: "+ preCir.dienTich());
		for (; i < NUMBER_RECTANGLE; i++) {
		if(preRec.dienTich() < shapes[i].dienTich()) {
			preRec = shapes[i];
		}
	}
		System.out.println("diện tích hình chữ nhật : "+ preRec.dienTich());
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Shape[] shapes = new Shape[NUMBER_TRIANGLE + NUMBER_CIRCLE + NUMBER_RECTANGLE];
		 input(shapes);
		 print(shapes);
		 findmaxDienTich(shapes);
		 findmax(shapes);
		}
}






