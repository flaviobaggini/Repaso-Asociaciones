package asociaciones;

import java.util.Arrays;


public class Universidad {

	private String nombre;
	private int cantAlumnos, cantDocentes;
	
	//arrays 
	
	private Alumno [] alumnos;
	private Curso [] cursos;
	private Profesor [] profesores;
	

/**
 * 	Contructor completo de la Clase universidad con todos sus campos (lo genero /** y  ENTER	
 * @param nombre
 * @param cantAlumnos
 * @param cantDocentes
 * @param alumnos
 * @param cursos
 * @param profesores
 */
	public Universidad(String nombre, int cantAlumnos, int cantDocentes, Alumno[] alumnos, Curso[] cursos,
			Profesor[] profesores) {
		super();
		this.nombre = nombre;
		this.cantAlumnos = cantAlumnos;
		this.cantDocentes = cantDocentes;
		this.alumnos = alumnos;
		this.cursos = cursos;
		this.profesores = profesores;
	}
	

	
	// GETTER AND SETTER

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCantAlumnos() {
		return cantAlumnos;
	}



	public void setCantAlumnos(int cantAlumnos) {
		this.cantAlumnos = cantAlumnos;
	}



	public int getCantDocentes() {
		return cantDocentes;
	}



	public void setCantDocentes(int cantDocentes) {
		this.cantDocentes = cantDocentes;
	}



	public Alumno[] getAlumnos() {
		return alumnos;
	}



	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}



	public Curso[] getCursos() {
		return cursos;
	}



	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}



	public Profesor[] getProfesores() {
		return profesores;
	}



	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}





	// METODOS TO STRING
	
	@Override
	public String toString() {
		return "Universidad [nombre=" + nombre + ", cantAlumnos=" + cantAlumnos + ", cantDocentes=" + cantDocentes
				+ ", alumnos=" + Arrays.toString(alumnos) + ", cursos=" + Arrays.toString(cursos) + ", profesores="
				+ Arrays.toString(profesores) + "]";
	}

	

	
}
