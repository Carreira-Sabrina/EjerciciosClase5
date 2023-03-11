package ejemploCarritoEjercicio_1;

public class DescuentoCantidad extends Descuento {
	private int cantArticulos;
	private ItemCarrito item;
	private float porcentajeDto;

	public DescuentoCantidad(ItemCarrito item) {
		//super();
		this.item = item;
		this.cantArticulos = item.getCantidad();
	}
	
	
	public float getPorcentajeDescuento() {
		//Tabla de descuento: 3-5 art, 5% dto // 6-11 art 10%// 12 ó + 15%
		if(cantArticulos<3) {
			this.porcentajeDto = 0;
		}else if (cantArticulos >=3 && cantArticulos<6) {
			this.porcentajeDto = 5;
		}else if (cantArticulos >=6 && cantArticulos<12) {
			this.porcentajeDto = 10;
		}else if (cantArticulos >=12) {
			this.porcentajeDto = 15;
		}
		return this.porcentajeDto;
						
	}		
	
}//end of class
