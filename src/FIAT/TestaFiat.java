package FIAT;

public class TestaFiat {

	public static void main(String args[]) {
		Carro carro1 = new Carro("Palio", "Vermelho", 1990);
		CarroUtilitario carro2 = new CarroUtilitario("Palio", "Azul", 1999, "Weekend");
		CarroPasseio carro3 = new CarroPasseio("Palio", "Preto", 2015, "Fire Economy");
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getAno());
		System.out.println("");
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getTipoU());
		System.out.println("");
		
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getCor());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getTipoP());
	}
}
