package t3mantenimiento.figuras;

public class Figura {
	private double a;
	private double b;
	private double r;
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	static final public int SQUARE = 0;
	static final public int RECTANGLE = 1;
	static final public int CIRCLE = 2;

	public double calculateArea(int shape) {
		return getForma(shape).calculateArea(this);
	}

	public double calculatePerimeter(int shape) {
		return getForma(shape).calculatePerimeter(this);

	}
	
	private Forma getForma(int valorForma){
		switch(valorForma){
		case SQUARE:
			return new Square();
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		default:
			throw new RuntimeException("Forma desconocida");
		}
	}
	
}