package Ejercicio2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/*En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una
lista de items, arme los objetos correspondientes y con el método de carrito “precio”,
retorne el resultado*/

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		Path rutaArchivo = Paths.get("orden_de_compra.txt");
		
		//Se crea un List de las lineas del archivo.Cada linea se separa en un array
			
		try {
			List <String> listaLineasArchivo = Files.readAllLines(rutaArchivo);
			//Se crean arrays de productos y de items carrito
			//La cantidad de elementos es menor a la cantidad de lineas porque la primera
			//linea es la cabecera de la tabla !
			
			Producto [] arrayDeProductos = new Producto [listaLineasArchivo.size() - 1];
			ItemCarrito [] arrayDeItemCarrito = new ItemCarrito[listaLineasArchivo.size() - 1];
			
			
			for(int i=0; i<listaLineasArchivo.size();i++) {
				if(i == 0) {
					//La primera linea se decarta porque es la cabecera de la tabla
					continue;
				}else {
					//Cada linea se convierte en una array de Strings (temporal)
					String [] deLineaAArray = listaLineasArchivo.get(i).split(",");
					
					//Ahora utilizo para crear los objetos de las clases
					//Primero se crean las instancias de Producto con los indices 1 y 2
					
					float tempPrecio = Float.parseFloat(deLineaAArray[1]);
					String tempNombre = deLineaAArray[2];
					arrayDeProductos[i-1] = new Producto(tempPrecio,tempNombre);
					//En el indice 0 está la cantidad de productos para ItemCarrito
					
					int tempCantidad = Integer.parseInt(deLineaAArray[0]);
					arrayDeItemCarrito[i-1] = new ItemCarrito(arrayDeProductos[i-1],tempCantidad);
					
				}
			}
			//Con la información obtenida del archivo se instanciaron Producto e ItemCarrito 
			//Armar el carrito
			Carrito carrito = new Carrito(arrayDeItemCarrito[0],arrayDeItemCarrito[1],arrayDeItemCarrito[2]);
			
			//Mostrar el carrito por pantalla
			
			System.out.println("**** MUCHAS GRACIAS POR SU COMPRA ****" + "\n");
			
			for(ItemCarrito articulo :carrito.getItemsEnCarrito()) {
				System.out.println("Articulo: " + articulo.getNombreProducto() + "	precio unitario:$" +
						articulo.getPrecioUnitario() + "	subtotal: $" + articulo.subtotalItem());
			}
			System.out.println("\n"+"		Usted abona: $" + carrito.precio());
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}//end of main

}//end of class
