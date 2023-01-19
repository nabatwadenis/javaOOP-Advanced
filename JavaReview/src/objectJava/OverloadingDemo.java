package objectJava;

public class OverloadingDemo {
	public int Multiply(int x, int y) {
		return ( x * y);
	}
	public int Multiply(int x, int y, int z) {
		return ( x * y* z);
	}
	public double Multiply( double x, double y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		OverloadingDemo demo = new OverloadingDemo();
		System.out.println(demo.Multiply(34.5, 67.30));
	}

}
