package t3mantenimiento.metro;

public abstract class Estado {
	public abstract int miEstado();
	public abstract void siguienteEstado(Metro metro);
	public abstract String visualizarEstado();
}
