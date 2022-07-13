package primaria;

public class monitor {
	
	
		private int idmonitor;
		private  String marca;
		private double tamaño;
		private int contadormonitor;
		
		
		public monitor(int idmonitor,String marca,double tamaño,int contadormonitor) {
		this.idmonitor=idmonitor;
		this.marca=marca;
		this.tamaño=tamaño;
		this.contadormonitor=contadormonitor;
		
			
		}


		public int getMonitor() {
			return idmonitor;
		}


		public void setMonitor(int monitor) {
			this.idmonitor = monitor;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public double getTamaño() {
			return tamaño;
		}


		public void setTamaño(double tamaño) {
			this.tamaño = tamaño;
		}


		public int getContadormonitor() {
			return contadormonitor;
		}


		public void setContadormonitor(int contadormonitor) {
			this.contadormonitor = contadormonitor;
		}
		
		
			
		
		
	

}
