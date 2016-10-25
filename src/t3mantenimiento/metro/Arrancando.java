package t3mantenimiento.metro;

public class Arrancando extends Estado{

	@Override
	public int miEstado() {
		return Metro.ARRANCANDO;
	}

	@Override
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.EN_MARCHA);
	}

	@Override
	public String visualizarEstado() {
		return "Arrancando";
	}

}
