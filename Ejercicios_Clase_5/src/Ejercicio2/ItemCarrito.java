package Ejercicio2;

public class ItemCarrito {
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public int getCantidad() {
		return this.cantidad;
	}
	
	public float getPrecioUnitario() {
		return this.producto.getPrecio();
	}
	
	public String getNombreProducto() {
		return this.producto.getNombre();
	}
	
	public float subtotalItem() {
		return this.cantidad * this.getPrecioUnitario();
	}

}
