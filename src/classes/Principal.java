package classes;

import javax.swing.JOptionPane;

public class Principal {
	
	Veiculo veiculos = new Veiculo();
	
	public static void main(String[] args) {
		
		Veiculo veiculos = new Veiculo();
		
		veiculos.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro")));
		veiculos.setMarca(JOptionPane.showInputDialog("Digite a marca"));
		veiculos.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
		veiculos.setPlaca(JOptionPane.showInputDialog("Digite o Placa"));
		veiculos.setTipo(JOptionPane.showInputDialog("Digite o Tipo: (1 - Van | 2 - Caminhão Baú | 3 - Carreta)"));
		
		veiculos.cadastro(veiculos);
	}
}
