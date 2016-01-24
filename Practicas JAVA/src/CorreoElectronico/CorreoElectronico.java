package CorreoElectronico;

public class CorreoElectronico {
	private String origen;
	private String destino;
	private String asunto;
	private String mensaje;
	
	public CorreoElectronico() {
		origen = "desconocido";
		destino = "desconocido";
		asunto = "";
		mensaje = "";
	}
	
	public CorreoElectronico(String origen, String destino, String asunto, String mensaje) {
		this.origen = origen;
		this.destino = destino;
		this.asunto = asunto;
		this.mensaje = mensaje;
	}
	
	public void imprimeOrigen() {
		System.out.println("Origen: " + origen);
	}
	public void imprimeDestino() {
		System.out.println("Destino: " + destino);
	}
	public void imprimeAsunto() {
		System.out.println("Asunto: " + asunto);
	}
	public void imprimeMensaje() {
		System.out.println("Mensaje: " + mensaje);
	}
	public void imprimeCorreo() {
		imprimeOrigen();
		imprimeDestino();
		imprimeAsunto();
		imprimeMensaje();
		System.out.println("\n");
	}
}
