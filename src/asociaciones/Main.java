package asociaciones;

public class Main {

	public static void main(String[] args) {
		
		//Declaración

		
		Profesor profe1 = new Profesor(10120322, "Juan", "Peralta", "Masculino",  "juanperalta@gmail.com", 1);
		Profesor profe2 = new Profesor(14120582, "Renee", "Magritte", "No Binario",  "magreitterene@gmail.com", 2);
		

		
		
		
		Alumno alumno1 = new Alumno (45356987, "Maria", "Perez", "Femenino", "maria@perez.com.ar", 1);
		Alumno alumno2 = new Alumno (38656322, "Marcelo", "Tinelli", "Masculino", "zabecacuervo@tinelli.com", 2);
				
		//Asignacion
		
		alumnos = new Alumno [3];
		alumnos [0] = alumno1;
		alumnos [1] = alumno2;
		alumnos [2] = alumno3;
		
		
		System.out.println("La cantidad de alumnos es: " + alumnos.length );
		
		
		//Composición
		Curso curso1 = new Curso(1, "Introduccion al lenguiaje Java", 3, profe1,);
		

	}

}
