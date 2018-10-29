package classes;

import java.util.ArrayList;
import java.util.List;

public class Roteiro {

	private String data;
	private int idRoteiro;
	private int idMotorista;
	private int idVeiculo;
	List<Integer> listaIdObjetos = new ArrayList<>();

	public Roteiro() {
	}

	public Roteiro(String data, int idRoteiro, int idMotorista, int idVeiculo, List<Integer> listaIdObjetos) {
		super();
		this.data = data;
		this.idRoteiro = idRoteiro;
		this.idMotorista = idMotorista;
		this.idVeiculo = idVeiculo;
		this.listaIdObjetos = listaIdObjetos;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getIdRoteiro() {
		return idRoteiro;
	}

	public void setIdRoteiro(int idRoteiro) {
		this.idRoteiro = idRoteiro;
	}

	public int getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public List<Integer> getListaIdObjetos() {
		return listaIdObjetos;
	}

	public void setListaIdObjetos(List<Integer> listaIdObjetos) {
		this.listaIdObjetos = listaIdObjetos;
	}

	public Boolean adicionaObjeto(int idObjeto, int capacidade) {

		if (getIdVeiculo() >= 0 && listaIdObjetos != null && listaIdObjetos.size() < capacidade) {
			listaIdObjetos.add(idObjeto);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Roteiro [data=" + data + ", idRoteiro=" + idRoteiro + ", idMotorista=" + idMotorista + ", idVeiculo="
				+ idVeiculo + ", listaIdObjetos=" + listaIdObjetos + "]";
	}


}
