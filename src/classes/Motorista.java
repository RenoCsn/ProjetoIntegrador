package classes;

public class Motorista {
	
	private int id_motorista;
	private String nome;
	private String nascimento;
	private String endereco;
	private Short tipo_cnh;
	private String numero_cnh;
	
//	public Motorista(int id_motorista, String nome, String nascimento, String endereco, char tipo_cnh,
//			String numero_cnh) {
//		super();
//		this.id_motorista = id_motorista;
//		this.nome = nome;
//		this.nascimento = nascimento;
//		this.endereco = endereco;
//		this.tipo_cnh = tipo_cnh;
//		this.numero_cnh = numero_cnh;
//	}

	public int getId_motorista() {
		return id_motorista;
	}

	public void setId_motorista(int id_motorista) {
		this.id_motorista = id_motorista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Short getTipo_cnh() {
		return tipo_cnh;
	}

	public void setTipo_cnh(Short tipo_cnh) {
		this.tipo_cnh = tipo_cnh;
	}

	public String getNumero_cnh() {
		return numero_cnh;
	}

	public void setNumero_cnh(String numero_cnh) {
		this.numero_cnh = numero_cnh;
	}

	@Override
	public String toString() {
		return "Motorista [id_motorista=" + id_motorista + ", nome=" + nome + ", nascimento=" + nascimento
				+ ", endereco=" + endereco + ", tipo_cnh=" + tipo_cnh + ", numero_cnh=" + numero_cnh + "]";
	}

}
