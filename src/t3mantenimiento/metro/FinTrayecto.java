package t3mantenimiento.metro;

public class FinTrayecto extends Estado{

	@Override
	public int miEstado() {
		return Metro.FIN_TRAYECTO;
	}

	@Override
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.PARADO);
	}

	@Override
	public String visualizarEstado() {
		return "Fin trayecto";
	}

}
