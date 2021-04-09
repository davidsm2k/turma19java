package ExerciciosLista8;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void correr (char correndo) {
		if(correndo == '1') {
			System.out.println("O cavalo está correndo");
		}
		else if (correndo == '2') {
			System.out.println("O cavalo não está correndo");
		}
	}
}