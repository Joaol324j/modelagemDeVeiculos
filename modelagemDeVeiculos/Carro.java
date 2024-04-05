package modelagemDeVeiculos;

public class Carro {
	
    String marca;
    String modelo;
    int ano;
    String cor;
    int numero_portas;
	
	public Carro(String marca, String modelo, int ano, String cor, int numero_portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numero_portas = numero_portas;
	}

	public String descricao() {
		
		return String.format("Marca %s, Modelo: %s, Ano: %d, Cor: %s, Portas: %d ", marca, modelo, ano, cor, numero_portas);
		
	}

}
