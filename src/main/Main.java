package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Motorista;
import classes.Veiculo;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		List<Motorista> listaMotorista = new ArrayList<>();
		List<Veiculo> listaVeiculo = new ArrayList<>();
=======
		
		Veiculo veiculo = new Veiculo();
		
>>>>>>> b19f739e4cd021b08cac4edce15a3e501ea8fdae
		int opcao;
		int teste = 0;
		boolean continua = true;
		while (continua) {
			
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
								  + "7)Sair"));
			switch (opcao) {
			case 1:
				teste++;
				//cadastrar o motorista
				Motorista motorista;
				motorista = new Motorista();
				motorista.setId_motorista(teste);
				motorista.setNome(JOptionPane.showInputDialog(null, "Digite o nome do motorista"));;
//				(id_motorista, nome, nascimento, endereco, tipo_cnh, numero_cnh);
				motorista.setNascimento(JOptionPane.showInputDialog(null, "Digite a data de nascimento do motorista"));
				motorista.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço do motorista"));
				motorista.setTipo_cnh(JOptionPane.showInputDialog(null, "Digite o tipo da Cnh do motorista"));
				motorista.setNumero_cnh(JOptionPane.showInputDialog(null, " Digite o numero da Cnh do motorista"));
				listaMotorista.add(motorista);
				System.out.println(motorista.toString());
				break;
			case 2:
				//cadastro de veiculo
<<<<<<< HEAD
				Veiculo veiculo;
				veiculo = new Veiculo();
=======
>>>>>>> b19f739e4cd021b08cac4edce15a3e501ea8fdae
				veiculo.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro")));
				veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca"));
				veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
				veiculo.setPlaca(JOptionPane.showInputDialog("Digite o Placa"));
				veiculo.setTipo(JOptionPane.showInputDialog("Digite o Tipo: (1 - Van | 2 - Caminhão Baú | 3 - Carreta)"));
<<<<<<< HEAD
				listaVeiculo.add(veiculo);
				System.out.println(veiculo.toString());
=======
				
				veiculo.cadastroVeiculo(veiculo);
>>>>>>> b19f739e4cd021b08cac4edce15a3e501ea8fdae
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
