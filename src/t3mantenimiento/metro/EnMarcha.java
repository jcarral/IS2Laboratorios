package t3mantenimiento.metro;

public class EnMarcha extends Estado{

	@Override
	public int miEstado() {
		return Metro.EN_MARCHA;
	}

	@Override
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.PARANDO);
	}

	@Override
	public String visualizarEstado() {
		return "En marcha";
	}

}
