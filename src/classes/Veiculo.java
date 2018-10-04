package classes;

public class Veiculo {
	
	private int id_veiculo;
	private Short tipo;
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
		return "Veiculo [id_veiculo=" + id_veiculo + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo
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

//	ArrayList<Veiculo> veiculos = new ArrayList();
//	
//	public void cadastroVeiculo(Veiculo v) {
//		
//		v.setTipo(this.tipo);
//		v.setPlaca(this.placa);
//		v.setModelo(this.modelo);
//		v.setAno(this.ano);
//		v.setMarca(this.marca);
//		
//		veiculos.add(v);
//		
//	}
//	//ARRUMAR BUSCAR VEICULO
//	/*public ArrayList buscarVeiculo() {
//		
//		int n = veiculos.size();
//		for(int i = 0; i<n; i++) {
//			JOptionPane.showMessageDialog(null, veiculos.get(i));
//		}
//		
//		return veiculos;
//	}*/
//	public String toString(){
//		return "Placa:"+ this.placa;
//	}
}