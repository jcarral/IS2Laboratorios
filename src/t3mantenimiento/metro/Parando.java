package t3mantenimiento.metro;

public class Parando extends Estado{

	@Override
	public int miEstado() {
		return Metro.PARANDO;
	}

	@Override
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.FIN_TRAYECTO);
	}

	@Override
	public String visualizarEstado() {
		return "Parando";
	}

}
