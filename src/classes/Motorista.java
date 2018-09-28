package classes;

import java.sql.Date;

public class Motorista {
	
	private int id_motorista;
	private String nome;
	private Date nascimento;
	private String endereco;
	private char tipo_cnh;
	private String numero_cnh;
	
	public Motorista() {
		
	}

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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public char getTipo_cnh() {
		return tipo_cnh;
	}

	public void setTipo_cnh(char tipo_cnh) {
		this.tipo_cnh = tipo_cnh;
	}

	public String getNumero_cnh() {
		return numero_cnh;
	}

	public void setNumero_cnh(String numero_cnh) {
		this.numero_cnh = numero_cnh;
	}
}
