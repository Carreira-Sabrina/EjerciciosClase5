package ejemploCarritoEjercicio_1;


//Similar a ItemCarrito aca hay que instanciar DescuentoMedioPago para obtener el descuento

public class Carrito {
	private ItemCarrito item1;
	private ItemCarrito item2;
	private ItemCarrito item3;
	private int cantItems = 0;
	private ItemCarrito [] arrayItemsCarrito =  new ItemCarrito[3] ;
	
	private String medioDePago;
	private DescuentoMedioPago descuento; // aca voy a instanciar la clase
	
	private float precioSinDto;
	private float dtoAplicado;
	private float total;
	
	//Constructor (no deberia sobrecargarlo? Veremos...)
	public Carrito(ItemCarrito item1, ItemCarrito item2, ItemCarrito item3, String medioDePago) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		//Cuidado con la asignacion de la array, no asignar hasta tanto se hayan
		//asignado los items porque si no son todos null !
		this.arrayItemsCarrito[0] = item1;
		this.arrayItemsCarrito[1] = item2;
		this.arrayItemsCarrito[2] = item3;
		this.medioDePago = medioDePago;
	}//end of constructor
	
	
	public ItemCarrito[] getArrayDeItemsCarrito() {
		return this.arrayItemsCarrito;
	}
	
	public float getPrecioSinDto() {
		for(ItemCarrito articulo : arrayItemsCarrito) {
			if(articulo != null) {
				this.precioSinDto +=articulo.getSubtotal();				
			}	
		}
		return precioSinDto;
	}
	
	public String getMedioDePago() {
		return this.medioDePago;
	}
	
	public float getDescuentoaplicado() {
		this.descuento = new DescuentoMedioPago(this.medioDePago);
		this.dtoAplicado = descuento.calcularDtoMedioPago();
		return dtoAplicado;
	}
	
	public float getTotal() {
		this.total = this.precioSinDto - ((this.dtoAplicado*this.precioSinDto)/100);
		return this.total;
	}
	
	
	//Esto sirve para mostrar por pantalla los items en un loop
	public int getCantItems() {
		for(ItemCarrito item :this.arrayItemsCarrito) {
			if(item != null) {
				this.cantItems=+1;
			}
		}
		return cantItems;
				
	}//end of getCantItems
	
	
	
}//end of class


