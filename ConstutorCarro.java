package construtores;

public class ConstutorCarro {

	public static void main(String[] args) {
		Carro carro1= new Carro("AAA-1A11",817);
		Carro carro2= new Carro("BBB-2B22");
		Carro carro3= new Carro();
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());
		
		System.out.println(carro2.getPlaca());
		
		System.out.println(carro3.getNumChassi());

	}

}
