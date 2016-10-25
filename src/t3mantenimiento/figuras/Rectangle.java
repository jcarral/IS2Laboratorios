package t3mantenimiento.figuras;

public class Rectangle extends Forma{

	@Override
	public double calculateArea(Figura fig) {
		return fig.getA()*fig.getB();
	}

	@Override
	public double calculatePerimeter(Figura fig) {
		return 2 * (fig.getA() + fig.getB());
	}

}
