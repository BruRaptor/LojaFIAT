package FIAT;

public class CarroPasseio extends Carro{

	private String tipoP;
	
	public CarroPasseio(String modelo, String cor, int ano, String tipoP) {
		super(modelo, cor, ano);
		this.tipoP = tipoP;
	}

	//Gets and Sets
	public String getTipoP() {
		return tipoP;
	}

	public void setTipoP(String tipoP) {
		this.tipoP = tipoP;
	}	
}