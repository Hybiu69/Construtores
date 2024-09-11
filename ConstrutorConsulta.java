package construtores;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1=new Consulta();
		Consulta consulta2=new Consulta("11/09/2024");
		Consulta consulta3=new Consulta("04/03/2008","Lucas","Cleide");
		
		System.out.println(consulta1.getData());
		
		System.out.println(consulta2.getData());
		
		System.out.println(consulta3.getData());
		System.out.println(consulta3.getNomeD());
		System.out.println(consulta3.getNomeP());

	}

}
