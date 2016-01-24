package Compra.Venta;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCompraVenta {
	private ArrayList<Compra> facturacion;
	
	public TestCompraVenta() {
		facturacion = new ArrayList<Compra>();
	}
	
	public void anadeCompra (Compra compra) {
		facturacion.add(compra);
	}

	public static void main(String[] args) {
		TestCompraVenta miFacturacion = new TestCompraVenta();
		
		Cliente cliente1 = new Cliente("111", "Luis", 24);
		Cliente cliente2 = new Cliente("222", "Marta", 32);
		Cliente cliente3 = new Cliente("333", "Roberto", 23);
		
		Vehiculo vehiculo1 = new Vehiculo("Mazda", "323", 1200);
		Vehiculo vehiculo2 = new Vehiculo("Toyota", "Prius", 1800);
		Vehiculo vehiculo3 = new Vehiculo("Seat", "León", 1400);
		
		Compra compra1 = new Compra(cliente1, vehiculo2, 12200);
		Compra compra2 = new Compra(cliente3, vehiculo1, 22200);
		Compra compra3 = new Compra(cliente2, vehiculo3, 2200);
		
		miFacturacion.anadeCompra(compra1);
		miFacturacion.anadeCompra(compra2);
		miFacturacion.anadeCompra(compra3);
		
		Iterator<Compra> it = miFacturacion.facturacion.iterator();
		while (it.hasNext())
			System.out.println("\nCompra:\n" + it.next().toString());
		
	}
}
