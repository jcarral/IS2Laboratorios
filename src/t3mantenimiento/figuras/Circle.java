package t3mantenimiento.figuras;

public class Circle extends Forma{

	@Override
	public double calculateArea(Figura fig) {
		return Math.PI*fig.getR()*fig.getR();
	}

	@Override
	public double calculatePerimeter(Figura fig) {
		return 2*Math.PI*fig.getR();
	}

}
