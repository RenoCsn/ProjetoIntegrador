package classes;

import java.util.ArrayList;
import java.util.List;

public class Roteiro {

	private String data;

	private Motorista motorista;
	private Veiculo veiculo;
	List<Objeto> listaObjetos = new ArrayList<>();

	public Roteiro() {
	}

	public Roteiro(String data, Motorista motorista, Veiculo veiculo) {
		this.data = data;
		this.motorista = motorista;
		this.veiculo = veiculo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<Objeto> getListaObjetos() {
		return listaObjetos;
	}

	public void setListaObjetos(List<Objeto> objetosEmRoteiro) {
		this.listaObjetos = objetosEmRoteiro;
	}

	public Boolean adicionaObjeto(Objeto objeto) {

		if (getVeiculo() != null && listaObjetos != null && listaObjetos.size() < veiculo.getCapacidade()) {
			listaObjetos.add(objeto);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Roteiro [data=" + data + ", motorista=" + motorista + ", veiculo=" + veiculo + ", listaObjetos="
				+ listaObjetos + "]";
	}

}
