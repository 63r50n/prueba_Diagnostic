package primaria;

public class entradas {
		
	private String tipoentrada;
	private String marca;
	
	
	public entradas(String tipoentrada,String marca) {
		this.tipoentrada=tipoentrada;
		this.marca=marca;
		
	}
	public String ToString() {
		return "tipo entrada" + this.tipoentrada + "marca" + this.marca;
	}


	public String getTipoentrada() {
		return tipoentrada;
	}


	public void setTipoentrada(String tipoentrada) {
		this.tipoentrada = tipoentrada;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
