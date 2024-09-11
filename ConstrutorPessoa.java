package construtores;

public class ConstrutorPessoa {

	public static void main(String[] args) {

		Pessoa famoso1=new Pessoa ();
		Pessoa famoso2=new Pessoa("Messi",35);
		Pessoa famoso3=new Pessoa("Tom Cruise");
		Pessoa famoso4=new Pessoa(37);
		
		System.out.println(famoso2.getNome());
		System.out.println(famoso2.getIdade());
		System.out.println(famoso3.getNome());
		System.out.println(famoso4.getIdade());

	}
}