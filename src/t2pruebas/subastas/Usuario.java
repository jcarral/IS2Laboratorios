package t2pruebas.subastas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Representa al usuario del sistema de subastas. Estos usuarios pueden pujar
 * por productos que ofrecen otros usuarios.
 * 
 */
public class Usuario {
	private final String nombre;
	private String email;
	private LocalDate fechaNacimiento;
	private double credito;
	private LinkedList<Subasta> subastasCreadas;

	public Usuario(String nombre, String email, LocalDate fechaNacimiento, int credito) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.credito = credito;
		this.subastasCreadas = new LinkedList<Subasta>();
	}

	public Usuario(String nombre, LocalDate fechaNacimiento) {
		this (nombre, null, fechaNacimiento, 0);
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public double getCredito() {
		return credito;
	}
	
	public List<Subasta> getSubastasCreadas() {
		return Collections.unmodifiableList(subastasCreadas);
	}
	
	public int getEdad(){
		LocalDate hoy = LocalDate.now();
		
		Period tiempoTranscurrido = Period.between(fechaNacimiento, hoy);
		
		return tiempoTranscurrido.getYears();
	}
	
	public void incrementarCredito(double cantidad){
		credito += cantidad;
	}

	public void decrementarCredito(double cantidad){
		credito -= cantidad;
	}
	
	public void addSubasta (Subasta subasta){
		subastasCreadas.add(subasta);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [nombre=" + nombre 
									+ ", email=" + email
									+ ", fechaNacimiento=" + fechaNacimiento 
									+ ", credito="+ credito
									+", subastasCreadas="+subastasCreadas.size()
									+ "]";
	}
	
	
}
