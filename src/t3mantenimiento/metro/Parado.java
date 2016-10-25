package t3mantenimiento.metro;

public class Parado extends Estado{

	@Override
	public int miEstado() {
		return Metro.PARADO;
	}

	@Override
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.ARRANCANDO);
	}

	@Override
	public String visualizarEstado() {
		return "Parado";
	}

}
