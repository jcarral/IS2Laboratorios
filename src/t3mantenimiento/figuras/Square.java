package t3mantenimiento.figuras;

public class Square extends Forma{

	@Override
	public double calculateArea(Figura fig) {
		return fig.getA()*fig.getA();
	}

	@Override
	public double calculatePerimeter(Figura fig) {
		return fig.getA()*4;
	}

}
