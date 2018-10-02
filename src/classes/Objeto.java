package classes;

public class Objeto {
	
	private int id_objeto;
	private String nome_remetente;
	private String endereco_remetente;
	private String none_destinatario;
	private String endereco_destinatario;
	private String data_postagem;
	private double peso;
	//private String codigo_localizador;
	
	public Objeto() {
		
	}

	public int getId_objeto() {
		return id_objeto;
	}

	public void setId_objeto(int id_objeto) {
		this.id_objeto = id_objeto;
	}

	public String getNome_remetente() {
		return nome_remetente;
	}

	public void setNome_remetente(String nome_remetente) {
		this.nome_remetente = nome_remetente;
	}

	public String getEndereco_remetente() {
		return endereco_remetente;
	}

	public void setEndereco_remetente(String endereco_remetente) {
		this.endereco_remetente = endereco_remetente;
	}

	public String getNone_destinatario() {
		return none_destinatario;
	}

	public void setNone_destinatario(String none_destinatario) {
		this.none_destinatario = none_destinatario;
	}

	public String getEndereco_destinatario() {
		return endereco_destinatario;
	}

	public void setEndereco_destinatario(String endereco_destinatario) {
		this.endereco_destinatario = endereco_destinatario;
	}

	public String getData_postagem() {
		return data_postagem;
	}

	public void setData_postagem(String data_postagem) {
		this.data_postagem = data_postagem;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
