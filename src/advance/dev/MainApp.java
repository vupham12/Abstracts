package advance.dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

  public class MainApp {
	public static void  input(List<Shape> shapeList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số hình tròn: ");
		int ci = sc.nextInt();
		for(int i = 0; i <ci; i++) {
			System.out.println("Bắt đầu nhập thông tin: tên, bán kính hinh tron");
			String name = sc.next();
			double banKinh = sc.nextDouble();
			Shape Cir = new Circle(name, banKinh);
			shapeList.add(Cir);
	}
		
		System.out.println("nhập số hình chữ nhật: ");
		int Re = sc.nextInt();
		for(int i = 0; i <Re; i++) {
			System.out.println("Bắt đầu nhập thông tin: ten, canh A, canh B");
			String name = sc.next();
			double canhA = sc.nextDouble();
			double canhB = sc.nextDouble();
			Shape Rec = new Rectangle(name, canhA, canhB);
			shapeList.add(Rec);
	}
		

		System.out.println("nhập số hình tam giác: ");
		int Tr = sc.nextInt();
		for(int i = 0; i <Tr; i++) {
			System.out.println("Bắt đầu nhập thông tin: ten, canh A, canh B, canh C");
			String name = sc.next();
			double canhA = sc.nextDouble();
			double canhB = sc.nextDouble();
			double canhC = sc.nextDouble();
			Shape Tri = new Triangle(name, canhA, canhB, canhC);
			shapeList.add(Tri);
	}
		
	}
	
	static void print(List<Shape> shapeList) {
		for(Shape shapes : shapeList) {
			System.out.println(shapes.toString());
		}
	}
	
	static void findMaxChuVi(List<Shape> shapeList) {
		Iterator<Shape> it = shapeList.iterator();
		Shape max = shapeList.get(0);
		while(it.hasNext()) {
			Shape shape = it.next();
			if(max.chuVi()< shape.chuVi()) {
				max = shape;
			}
			
		}
		System.out.println("Hinh co chu vi lon nhat la: "+max.chuVi());
	
	}
	
	static void findMaxDienTich(List<Shape> shapeList) {
		Iterator<Shape> it = shapeList.iterator();
		Shape max = shapeList.get(0);
		while(it.hasNext()) {
			Shape shape = it.next();
			if(max.dienTich()< shape.dienTich()) {
				max = shape;
			}
			
		}
		System.out.println("Hinh co dien tich lon nhat la: "+max.name+"--"+max.dienTich());
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapeList = new ArrayList<Shape>();
		input(shapeList);
		print(shapeList);
		findMaxChuVi(shapeList);
		findMaxDienTich(shapeList);
	}
	
}





