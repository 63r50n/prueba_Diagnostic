package primaria;

public class Computadora {
	
	private int idcomputadora;
	private String nombre;
	private monitor Monitor;
	private teclado Teclado;
	private mouse Raton;
	public static int compu=1;
		
	
	public Computadora(int idcomputadora, String nombre,monitor Monitor,teclado Teclado,mouse Raton) {
		this.idcomputadora=compu++;
		this.nombre=nombre;
		this.Monitor=Monitor;
		this.Teclado=Teclado;
		this.Raton=Raton;
		
	}
	public String ToString() {
		return "ID" + this.idcomputadora+ "Nombre:" + this.nombre + "Monitor:" + this.Monitor.toString() + "Teclado:" + this.Teclado.toString() + "Raton" + this.Raton.toString();
	
	}

	public int getIdcomputadora() {
		return idcomputadora;
	}


	public void setIdcomputadora(int idcomputadora) {
		this.idcomputadora = idcomputadora;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public monitor getMonitor() {
		return Monitor;
	}


	public void setMonitor(monitor monitor) {
		Monitor = monitor;
	}


	public teclado getTeclado() {
		return Teclado;
	}


	public void setTeclado(teclado teclado) {
		Teclado = teclado;
	}


	public mouse getRaton() {
		return Raton;
	}


	public void setRaton(mouse raton) {
		Raton = raton;
	}


	public static int getCompu() {
		return compu;
	}


	public static void setCompu(int compu) {
		Computadora.compu = compu;
	}
	
	
	
	
	
	
	
	

}
