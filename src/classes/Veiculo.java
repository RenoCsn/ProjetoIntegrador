package classes;

public class Veiculo {

	private int idVeiculo;
	private Short tipo;
	private String marca;
	private String modelo;
	private int ano;
	private String placa;

	public Veiculo() {

	}

	public Veiculo(int idVeiculo, Short tipo, String marca, String modelo, int ano, String placa) {
		super();
		this.idVeiculo = idVeiculo;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public Short getTipo() {
		return tipo;
	}

	public void setTipo(Short tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Veiculo [idVeiculo=" + idVeiculo + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo
				+ ", ano=" + ano + ", placa=" + placa + "]";
	}

	public Short getCapacidade() {

		if (tipo == 1) {
			return 1;
		} else if (tipo == 2) {
			return 3;
		} else if (tipo == 3) {
			return 10;
		}
		return 0;
	}
}