package main;

import javax.swing.JOptionPane;

import classes.Motorista;

public class Main {

	public static void main(String[] args) {
		
		int opcao;
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
				//cadastrar o motorista
				Motorista motorista = new Motorista(id_motorista, nome, nascimento, endereco, tipo_cnh, numero_cnh);
				
				break;
			case 2:
				//cadastro de veiculo
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
