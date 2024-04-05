package modelagemDeVeiculos;

public class Moto {
	
	String marca;
	String modelo;
	String cor;
	int ano;
	int cilindradas;
	
	public Moto(String marca, String modelo, int ano, String cor, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.cilindradas = cilindradas;
	}
	
	public String descricao(){
		return String.format("Marca: %s, Modelo: %s, Ano: %d, Cor: %s, Cilindradas: %d", marca, modelo, ano, cor, cilindradas);
	}

}
