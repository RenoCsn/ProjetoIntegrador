package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	
	public void cadastro(Veiculo veiculos) {
		
		try {
			
			FileWriter fw = new FileWriter("veiculos.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Tipo: "+this.tipo);
			pw.println("Marca: "+this.marca);
			pw.println("Modelo: "+this.modelo);
			pw.println("Ano: "+this.ano);
			pw.println("Placa: "+this.placa);
			
			pw.flush();
			pw.close();
			fw.close();
			
			
		} catch (IOException ex) {
			Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}