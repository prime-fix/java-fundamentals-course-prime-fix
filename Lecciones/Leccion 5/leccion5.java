class Main {
	public static void main(String[] args)
	{
		Estudiante e1 = new Estudiante("Pablo", 23,"Sistemas");
		e1.mostrarInformacion();

		System.out.println("El nombre especifico es: " + e1.getNombre());

		e1.setNombre("Juan");

		System.out.println("El nombre cambiado es: " + e1.getNombre());		
	}
}

class Estudiante {

	String nombre;
	String carrera;
	int edad;

	//constructor
	public Estudiante(String nombre_e, int edad_e, String carrera_e)
	{
		this.nombre = nombre_e;
		this.edad = edad_e;
		this.carrera = carrera_e;
	}

	//Metodo
	public void mostrarInformacion(){
		System.out.println("El nombre del estudiante es " + nombre);
		System.out.println("La edad es: " + edad);
		System.out.println("La carrera es: " + carrera);	
	}

	//Getter
	public String getNombre(){
		return nombre;
	}

	//Setter
	public void setNombre(String nombre_nuevo)
	{
		this.nombre = nombre_nuevo;
	}
}