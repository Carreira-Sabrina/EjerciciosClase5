package ejemploCarritoEjercicio_1;


public class Producto {
	private String nombre;
	private float precio;
	
	
	//Constructor
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public float getPrecio() {
		return this.precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
		
	
}//end of class
