package construtores;

public class Consulta {

	private String data,nomeP,nomeD;

	public Consulta (String data, String nomeP, String nomeD) {
		this.data=data;
		this.nomeP=nomeP;
		this.nomeD=nomeD;
	}

	public Consulta (String data) {
		this.data=data;
	}
	
	public Consulta() {

	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data=data;
	}

	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP=nomeP;
	}

	public String getNomeD() {
		return nomeD;
	}
	public void setNomeD(String nomeD) {
		this.nomeD=nomeD;
	}

}
