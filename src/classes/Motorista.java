package classes;

public class Motorista {
	
	private int idMotorista;
	private String nome;
	private String nascimento;
	private String endereco;
	private Short tipoCnh;
	private String numeroCnh;
	
	public Motorista(int id_motorista, String nome, String nascimento, String endereco, Short tipoCnh,
			String numeroCnh) {
		super();
		this.idMotorista = id_motorista;
		this.nome = nome;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.tipoCnh = tipoCnh;
		this.numeroCnh = numeroCnh;
	}

	public Motorista() {

	}

	public int getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
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

	public Short getTipoCnh() {
		return tipoCnh;
	}

	public void setTipoCnh(Short tipoCnh) {
		this.tipoCnh = tipoCnh;
	}

	public String getNumeroCnh() {
		return numeroCnh;
	}

	public void setNumeroCnh(String numeroCnh) {
		this.numeroCnh = numeroCnh;
	}

	@Override
	public String toString() {
		return "Motorista [idMotorista=" + idMotorista + ", nome=" + nome + ", nascimento=" + nascimento + ", endereco="
				+ endereco + ", tipoCnh=" + tipoCnh + ", numeroCnh=" + numeroCnh + "]";
	}

}
