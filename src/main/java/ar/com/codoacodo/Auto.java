package ar.com.codoacodo;

public class Auto {
	
	//atributos
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	
	//todas las clases tienen un constructor por defecto
	//constructor por defecto/explicito
	
	Auto(){
		encendido = false;
	}
	
	//metodos
	
	void encender() {
		encendido = true;
	};
	void apagar() {
		encendido = false;
		
	};
	void acelerar() {
		if (encendido = true) {
			this.velocidad++; 
		}
	};
	void frenar() {
		
	};
	
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);
	}
	
}
