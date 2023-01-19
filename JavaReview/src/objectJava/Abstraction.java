package objectJava;

public abstract class Abstraction {
	int x, y;
	
	void moveTo(int newX, int newY) {
		System.out.println("Move to x:" +x+ "and y to: " +y);
	}
	abstract void draw();
	abstract void resize();

}
