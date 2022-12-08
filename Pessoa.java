public abstract class Pessoa {

	private String nome;
	
	public void falar() {
		System.out.println("Bom dia tudo bem?");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
