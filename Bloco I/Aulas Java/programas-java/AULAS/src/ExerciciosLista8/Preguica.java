package ExerciciosLista8;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirArvore(char subir) {
		if(subir == '1') {
			System.out.println("A pregui�a est� subindo na arvore");
		}
		else if (subir == '2') {
			System.out.println("A pregui�a n�o est� subindo na arvore");
		}
	}
}