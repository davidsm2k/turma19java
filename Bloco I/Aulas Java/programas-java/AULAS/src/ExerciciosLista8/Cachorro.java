package ExerciciosLista8;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void correr(char correndo) {
		if(correndo == '1') System.out.println("O cachorro est� correndo");
		
		else if (correndo == '2') System.out.println("O cachorro n�o est� correndo");
	}
}