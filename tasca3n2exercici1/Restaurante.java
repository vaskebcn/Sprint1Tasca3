package tasca3n2exercici1;

import java.util.Objects;

public class Restaurante {

	private String nombre;
	private int puntuacion;

	public Restaurante() {

	}

	public Restaurante(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, puntuacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(nombre, other.nombre) && puntuacion == other.puntuacion;
	}

	@Override
	public String toString() {
		return "Restaurante [nombre=" + this.nombre + ", puntuacion=" + this.puntuacion + "]";
	}

}
