package construtores;

public class ConstrudorAnimal {

	public static void main(String[] args) {
		Animal animal1= new Animal (151,"Marrom");
		Animal animal2= new Animal ("Cinza");
		Animal animal3= new Animal ();
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		
		System.out.println(animal2.getCor());
		
		System.out.println(animal3.getTamanho());
		

	}

}
