package classes;

public class Objeto {
	
	private int idObjeto;
	private String nomeRemetente;
	private String enderecoRemetente;
	private String nomeDestinatario;
	private String enderecoDestinatario;
	private String dataPostagem;
	private double peso;
	//private String codigo_localizador;
	
	public Objeto() {
		
	}

	public Objeto(int idObjeto, String nomeRemetente, String enderecoRemetente, String nomeDestinatario,
			String enderecoDestinatario, String dataPostagem, double peso) {
		super();
		this.idObjeto = idObjeto;
		this.nomeRemetente = nomeRemetente;
		this.enderecoRemetente = enderecoRemetente;
		this.nomeDestinatario = nomeDestinatario;
		this.enderecoDestinatario = enderecoDestinatario;
		this.dataPostagem = dataPostagem;
		this.peso = peso;
	}

	public int getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

	public String getNomeRemetente() {
		return nomeRemetente;
	}

	public void setNomeRemetente(String nomeRemetente) {
		this.nomeRemetente = nomeRemetente;
	}

	public String getEnderecoRemetente() {
		return enderecoRemetente;
	}

	public void setEnderecoRemetente(String enderecoRemetente) {
		this.enderecoRemetente = enderecoRemetente;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public String getEnderecoDestinatario() {
		return enderecoDestinatario;
	}

	public void setEnderecoDestinatario(String enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}

	public String getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(String dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Objeto [idObjeto=" + idObjeto + ", nomeRemetente=" + nomeRemetente + ", enderecoRemetente="
				+ enderecoRemetente + ", nomeDestinatario=" + nomeDestinatario + ", enderecoDestinatario="
				+ enderecoDestinatario + ", dataPostagem=" + dataPostagem + ", peso=" + peso + "]";
	}

}
