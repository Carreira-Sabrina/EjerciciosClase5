package ejemploCarritoEjercicio_1;

//En cada ItemCarrito se instancia la clase DescuentoPorCantidad para saber si se aplica
//descuento de acuerdo a la cantidad del mismo artículo que se compra

public class ItemCarrito {
	private Producto producto;
	private int cantidad;
	private float subtotal;
	private DescuentoCantidad descuento;
	private float porcentajeDto;
	
	//Constructor
	public ItemCarrito(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
		//Se instancia la clase DescuentoCantidad y se la usa para calcular si hay dto
		//Si no se hacen en el constructor no funciona ! (por que, si en Carrito si?)
		this.descuento = new DescuentoCantidad(this);
		this.porcentajeDto =descuento.getPorcentajeDescuento();
	}//end of constructor
	
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public Producto getProducto() {
		return this.producto;
	}
	
	public float getPrecioUnitario() {
		return this.producto.getPrecio();
	}
	
	public float getSubtotal() {
		this.subtotal = this.cantidad * this.producto.getPrecio();
		return (this.subtotal) - ((this.porcentajeDto * this.subtotal)/100);
	}
	
	public float getPorcentajeDto() {
		return this.porcentajeDto;
	}
	
		
	
}// end of class
