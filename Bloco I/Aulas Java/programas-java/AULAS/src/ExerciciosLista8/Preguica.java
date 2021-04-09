package ExerciciosLista8;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirArvore(char subir) {
		if(subir == '1') {
			System.out.println("A preguiça está subindo na arvore");
		}
		else if (subir == '2') {
			System.out.println("A preguiça não está subindo na arvore");
		}
	}
}