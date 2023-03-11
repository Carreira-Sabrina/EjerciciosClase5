package ejemploCarritoEjercicio_1;

public class Implementacion {

	public static void main(String[] args) {
		//Se instancian los productos
		//Cada producto tiene un nombre y un precio
		
		Producto prod1 = new Producto("jabon",1);
		Producto prod2 = new Producto("papas fritas",10);
		Producto prod3 = new Producto("cafe",100);
		Producto prod4 = new Producto("helado",1000);
		
		//Se instancian algunos itemsCarrito (c/u tiene un producto y una cantidad)
		//Cada ItemCarrito tiene "internamente" una instancia de DescuentoCantidad
		
		ItemCarrito item1= new ItemCarrito(prod1,10);
		ItemCarrito item2= new ItemCarrito(prod4,1);
		ItemCarrito item3= new ItemCarrito(prod2,5);
		
		//Se arma un carrito de compras. El precio de los ItemCarrito con dto. se calcula en su clase
		//La clase Carrito tiene "internamente" una instancia de DescuentoMedioPago
		//pasa saber si se aplica algún descuento
		//Cada carrito recibe hasta 3 artìculos ItemCarrito
		
		//ATENCION !! De momento el constructor del carrito no fue sobrecargado de modo que los
		//ItemsCarrito vacíos se pasan como null
		
		Carrito carrito1 = new Carrito(item1,item2,null,"efectivo");
		
		
		mostrarCompra(carrito1);

		
	}//end of main
	
	//Metodo de "display" por consola del carrito
	public static void mostrarCompra(Carrito carrito) {
		System.out.println("**** SUPERMERCADO EL AMANCECER ****");
		System.out.println("Cantidad de articulos en carrito " + carrito.getCantItems());
		//Loop para mostrar los ItemCarrito
		for(ItemCarrito articulo : carrito.getArrayDeItemsCarrito()) {
			if(articulo !=null) {
				System.out.print("Articulo: " +  articulo.getProducto().getNombre());
				System.out.print("	precio unitario: " + articulo.getPrecioUnitario());
				System.out.print("	cantidad:  " + articulo.getCantidad());
				System.out.print("	descuento aplicado:  " + articulo.getPorcentajeDto() +"%");
				System.out.print("	subtotal:  " + articulo.getSubtotal());
				System.out.println();
			}
						
		}//end of for
		System.out.println();
		System.out.println("		Usted abona con: " + carrito.getMedioDePago());
		System.out.println("			Total sin descuento: " + carrito.getPrecioSinDto());
		System.out.println("			Descuento aplicado: " + carrito.getDescuentoaplicado() + "%");
		System.out.println("			Usted abona: " + carrito.getTotal());
		
		
		
	}//end of mostrarCompra
	

}//end of class
