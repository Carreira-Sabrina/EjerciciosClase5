package Ejercicio2;

public class Carrito {
	
	private ItemCarrito item1;
	private ItemCarrito item2;
	private ItemCarrito item3;
	private ItemCarrito [] arrayItemsCarrito =  new ItemCarrito[3] ;
	private float precio;
	
	public Carrito(ItemCarrito item1,ItemCarrito item2,ItemCarrito item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		
		arrayItemsCarrito[0]= item1;
		arrayItemsCarrito[1]= item2;
		arrayItemsCarrito[2]= item3;
		
	}
	
	public float precio() {
		for (ItemCarrito item : arrayItemsCarrito) {
			float subtotalActual = item.subtotalItem();
			this.precio = this.precio + subtotalActual;
		}
		return precio;
	}
	
	public ItemCarrito [] getItemsEnCarrito() {
		return arrayItemsCarrito;
	}

}
