package FIAT;

public class CarroUtilitario extends Carro{
	private String tipoU;
	
	public CarroUtilitario(String modelo, String cor, int ano,String tipoU) {
		super(modelo,cor,ano);
		this.tipoU = tipoU;
	}

	//Gets and Sets
	public String getTipoU() {
		return tipoU;
	}

	public void setTipoU(String tipoU) {
		this.tipoU = tipoU;
	}
}