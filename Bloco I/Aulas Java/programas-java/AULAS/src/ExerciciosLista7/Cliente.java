/*
1) Crie uma classe cliente e apresente os atributos e m?todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa??es deste objeto no console.
*/
package ExerciciosLista7;

public class Cliente {
	
	private String nome;
	private int idade;
	private String cpf;
	
	public Cliente() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
}
