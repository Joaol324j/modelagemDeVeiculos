package modelagemDeVeiculos;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Toyota", "Corrola", 2020, "Preto", 4);
		Moto moto = new Moto("Honda", "CBR500R", 2021, "Vermelho", 500);
		
		
		System.out.println(carro.descricao());
		System.out.println(moto.descricao());

	}

}
