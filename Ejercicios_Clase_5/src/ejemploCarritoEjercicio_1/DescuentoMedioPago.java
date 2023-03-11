package ejemploCarritoEjercicio_1;

public class DescuentoMedioPago extends Descuento {
	
	private String medioDePago;
	private float porcentajeDto;
	
	
	public DescuentoMedioPago(String medioDePago) {
		super();
		this.medioDePago = medioDePago;
	}

	//Pauta de descuentos: Con efectivo 20%, con tarjeta de débito 15%
	
	public float calcularDtoMedioPago() {
		switch (this.medioDePago) {
			case "efectivo":
				this.porcentajeDto = 20;
				break;
			case "debito":
				this.porcentajeDto = 15;
				break;
			default:
				this.porcentajeDto = 0;	
		}//end of switch
		return this.porcentajeDto;
	}

}//end of class
