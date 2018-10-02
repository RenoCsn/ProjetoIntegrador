package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Motorista;
import classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		List<Motorista> listaMotorista = new ArrayList<Motorista>();
		List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
		int teste = 0;
		boolean continua = true;
		while (continua) {
			int opcao = 0;
			try {
				opcao = Integer
						.parseInt(JOptionPane
								.showInputDialog(
										null,
										"1) Cadastro de motorista.\n"
									  + "2) Cadastro de veiculo.\n"
									  + "3) Cadastro de objeto.\n"
									  + "4) Gerar roteiro de entrega para motorista.\n"
									  + "5) Cadastrar encomendas entregues e listar as que não foram.\n"
									  + "6) Listar roteiros antigos.\n"
									  + "7) Sair"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			switch (opcao) {
			case 1:
				teste++;
				//cadastrar o motorista
				Motorista motorista = new Motorista();
				motorista.setId_motorista(teste);
				motorista.setNome(JOptionPane.showInputDialog(null, "Digite o nome do motorista"));;
				motorista.setNascimento(JOptionPane.showInputDialog(null, "Digite a data de nascimento do motorista"));
				motorista.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço do motorista"));
				motorista.setTipo_cnh(JOptionPane.showInputDialog(null, "Digite o tipo da Cnh do motorista"));
				motorista.setNumero_cnh(JOptionPane.showInputDialog(null, " Digite o numero da Cnh do motorista"));
				listaMotorista.add(motorista);
				System.out.println(motorista.toString());
				break;
			case 2:
				//cadastro de veiculo
				Veiculo veiculo;
				veiculo = new Veiculo();
				veiculo.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro")));
				veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca"));
				veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
				veiculo.setPlaca(JOptionPane.showInputDialog("Digite o Placa"));
				veiculo.setTipo(JOptionPane.showInputDialog("Digite o Tipo: (1 - Van | 2 - Caminhão Baú | 3 - Carreta)"));
				listaVeiculo.add(veiculo);
				System.out.println(teste);
				break;
			case 3:
				//cadastra os objetos
				break;
			case 4:
				//gera o roteiro de entrega
				break;
			case 5:
				//informa o que foi entregue e o que não e lista os que não foram
				break;
			case 6:
				//listar os roteiros antigos
				break;
			case 7:
				//sai do sistema
				continua = false;
				break;
			default:
				continua = false;
				break;
			}
		}
	}
}
