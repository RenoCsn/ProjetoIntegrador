package classes;

import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Veiculo {
	
	private int id_veiculo;
	private String tipo;
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	public Veiculo() {
		
	}

	public int getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
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
	ArrayList<Veiculo> veiculos = new ArrayList();
	
	public void cadastroVeiculo(Veiculo v) {
		
		v.setTipo(this.tipo);
		v.setPlaca(this.placa);
		v.setModelo(this.modelo);
		v.setAno(this.ano);
		v.setMarca(this.marca);
		
		veiculos.add(v);
		
	}
	//ARRUMAR BUSCAR VEICULO
	/*public ArrayList buscarVeiculo() {
		
		int n = veiculos.size();
		for(int i = 0; i<n; i++) {
			JOptionPane.showMessageDialog(null, veiculos.get(i));
		}
		
		return veiculos;
	}*/
	public String toString(){
		return "Placa:"+ this.placa;
	}
}