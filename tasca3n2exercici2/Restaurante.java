package tasca3n2exercici2;

import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {

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
	
	@Override
    public int compareTo(Restaurante o) {
        if (this.getNombre().compareTo(o.getNombre()) == 0) {
            if (this.getPuntuacion() < o.getPuntuacion()) { 
                return 1;
            } else if (this.getPuntuacion() > o.getPuntuacion()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return this.getNombre().compareTo(o.getNombre());
        }
    }

//	@Override
//	public int compareTo(Restaurante o) {
//		
//		return puntuacion - o.puntuacion;
//	}

}

