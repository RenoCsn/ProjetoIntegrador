package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Motorista;
import classes.Objeto;
import classes.Roteiro;
import classes.Veiculo;

public class Main {

	static List<Motorista> listaMotorista = new ArrayList<>();
	static List<Veiculo> listaVeiculo = new ArrayList<>();
	static List<Objeto> listaObjeto = new ArrayList<>();
	static List<Roteiro> listaRoteiro = new ArrayList<>();
	static List<Veiculo> listaVeiculoNaoUtilizado = new ArrayList<>();
	static List<Objeto> listaObjetosEntregues = new ArrayList<>();
	static List<Objeto> listaObjetosNaoEntregues = new ArrayList<>();

	public static void main(String[] args) {

		int idMotorista = 0;
		int idVeiculo = 0;
		boolean continua = true;
		while (continua) {
			int opcao = 0;
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1) Cadastro de motorista.\n" + "2) Cadastro de veiculo.\n" + "3) Cadastro de objeto.\n"
								+ "4) Gerar roteiro de entrega para motorista.\n"
								+ "5) Cadastrar encomendas entregues e listar as que não foram.\n"
								+ "6) Listar roteiros antigos.\n" + "7) Sair"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			switch (opcao) {
			case 1:
				// cadastrar o motorista
				Motorista motorista = new Motorista();
				motorista.setId_motorista(idMotorista);
				motorista.setNome(JOptionPane.showInputDialog(null, "Digite o nome do motorista"));
				;
				motorista.setNascimento(JOptionPane.showInputDialog(null, "Digite a data de nascimento do motorista"));
				motorista.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço do motorista"));
				motorista.setTipo_cnh(Short.parseShort(JOptionPane.showInputDialog(null,
						"Digite o Tipo de cnh: (1 - Van(A) | 2 - Caminhão Baú(B) | 3 - Carreta(C))")));
				motorista.setNumero_cnh(JOptionPane.showInputDialog(null, " Digite o numero da Cnh do motorista"));
				listaMotorista.add(motorista);
				System.out.println(listaMotorista.toString());
				idMotorista++;
				break;
			case 2:
				// cadastro de veiculo
				Veiculo veiculo = new Veiculo();
				veiculo.setId_veiculo(idVeiculo);
				veiculo.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro")));
				veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca"));
				veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
				veiculo.setPlaca(JOptionPane.showInputDialog("Digite o Placa"));
				veiculo.setTipo(Short.parseShort(
						JOptionPane.showInputDialog("Digite o Tipo: (1 - Van | 2 - Caminhão Baú | 3 - Carreta)")));
				listaVeiculo.add(veiculo);
				listaVeiculoNaoUtilizado.add(veiculo);
				// listaVeiculo.sort(Comparator.comparing(Veiculo::getTipo));
				listaVeiculoNaoUtilizado.sort((o1, o2) -> o2.getTipo().compareTo(o1.getTipo()));
				idVeiculo++;
				break;
			case 3:
				// cadastra os objetos
				Objeto objeto = new Objeto();
				objeto.setId_objeto(JOptionPane.showInputDialog(null, "Digite o id do objeto"));
				objeto.setNome_remetente(JOptionPane.showInputDialog(null, "Digite o nome do remetente"));
				objeto.setEndereco_remetente(JOptionPane.showInputDialog(null, "Digite o endereço do remetente"));
				objeto.setNone_destinatario(JOptionPane.showInputDialog(null, "Digite o nome do destinatário"));
				objeto.setEndereco_destinatario(JOptionPane.showInputDialog(null, "Digite o endereço do destinatário"));
				objeto.setData_postagem(JOptionPane.showInputDialog(null, "Digite a data da postagem"));
				objeto.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso")));
				listaObjeto.add(objeto);
				break;
			case 4:
				// gera o roteiro de entrega
				int idMotoristaRequisitado = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite o id do motorista que deseja gerar o roteiro"));
				geraRoteiro(idMotoristaRequisitado);
				break;
			case 5:
				int opcaoMenuEntrega = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite o numero da opcao desejada:\n1 - Informar o que foi entregue. \n2 - Informar o que nao foi entregue. \n 3 - Listar o que nao foi entregue."));
				// informa oq foi entregue
				if (opcaoMenuEntrega == 1) {
					informaEntregue(JOptionPane.showInputDialog(null,
							"Digite o id do objeto que deseja informar que foi entregue"));
					// informa oq que nao foi
				} else if (opcaoMenuEntrega == 2) {
					informaNaoEntregue(JOptionPane.showInputDialog(null,
							"Digite o id do objeto que deseja informar que nao foi entregue"));
					// lista os nao entregues
				} else if (opcaoMenuEntrega == 3) {
					if (listaObjetosNaoEntregues != null && !listaObjetosNaoEntregues.isEmpty()) {
						System.out.println(listaObjetosNaoEntregues.toString());
					}
				} else {
					JOptionPane.showMessageDialog(null, "A opcao digitada esta incorreta.");
				}
				break;
			case 6:
				// listar os roteiros antigos
				listarRoteiros();
				break;
			case 7:
				// sai do sistema
				continua = false;
				break;
			default:
				continua = false;
				break;
			}
		}
	}

	private static void geraRoteiro(int idMotorista) {
		Roteiro roteiro = new Roteiro();
		Motorista motoristaDoRoteiro = null;
		if (listaMotorista != null && !listaMotorista.isEmpty()) {
			for (Motorista motorista : listaMotorista) {
				if (idMotorista == motorista.getId_motorista()) {
					motoristaDoRoteiro = motorista;
				}
			}
			if (motoristaDoRoteiro == null) {
				JOptionPane.showMessageDialog(null, "Id de motorista não encontrado");
			}

		} else {
			JOptionPane.showMessageDialog(null,
					"Nenhum motorista cadastrado, por favor cadastre ao menos um motorista!");
			return;
		}
		Veiculo veiculoDoRoteiro = null;
		if (listaVeiculoNaoUtilizado != null && !listaVeiculoNaoUtilizado.isEmpty()) {
			for (int i = 0; i < listaVeiculoNaoUtilizado.size(); i++) {
				if (motoristaApto(motoristaDoRoteiro, listaVeiculoNaoUtilizado.get(i))) {
					veiculoDoRoteiro = listaVeiculoNaoUtilizado.get(i);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum veiculo cadastrado, por favor cadastre ao menos um veiculo!");
			return;
		}
		roteiro.setMotorista(motoristaDoRoteiro);
		roteiro.setVeiculo(veiculoDoRoteiro);
		Objeto objetoEmRoteiro = null;
		if (listaObjetosNaoEntregues != null && !listaObjetosNaoEntregues.isEmpty()) {
			for (int i = 0; i < listaObjetosNaoEntregues.size(); i++) {
				objetoEmRoteiro = listaObjetosNaoEntregues.get(i);
				if (!roteiro.adicionaObjeto(objetoEmRoteiro)) {
					JOptionPane.showMessageDialog(null, "Veiculo com capacidade esgotada");
				}
			}
		} else if (listaObjeto != null && !listaObjeto.isEmpty()) {
			for (int i = 0; i < listaObjeto.size(); i++) {
				objetoEmRoteiro = listaObjeto.get(i);
				if (!roteiro.adicionaObjeto(objetoEmRoteiro)) {
					JOptionPane.showMessageDialog(null, "Veiculo com capacidade esgotada");
				}
			}
		}
		roteiro.setData(JOptionPane.showInputDialog(null, "Digite a data para o roteiro desejado"));
		listaRoteiro.add(roteiro);
	}

	private static Boolean motoristaApto(Motorista motoristaDoRoteiro, Veiculo veiculo) {

		if (motoristaDoRoteiro.getTipo_cnh() >= veiculo.getTipo()) {
			return true;
		}
		return false;
	}

	private static void informaEntregue(String idObjeto) {
		Objeto objetoEntregue = null;
		for (Objeto objeto : listaObjeto) {
			if (objeto.getId_objeto().equalsIgnoreCase(idObjeto)) {
				objetoEntregue = objeto;
				listaObjetosEntregues.add(objetoEntregue);
				listaObjeto.remove(objetoEntregue);
				return;
			}
		}
		if (objetoEntregue == null) {
			JOptionPane.showMessageDialog(null, "Objeto nao encontrado");
		}
	}

	private static void informaNaoEntregue(String idObjeto) {
		Objeto objetoNaoEntregue = null;
		for (Objeto objeto : listaObjeto) {
			if (objeto.getId_objeto().equalsIgnoreCase(idObjeto)) {
				objetoNaoEntregue = objeto;
				listaObjetosNaoEntregues.add(objetoNaoEntregue);
				listaObjeto.remove(objetoNaoEntregue);
				return;
			}
		}
		if (objetoNaoEntregue == null) {
			JOptionPane.showMessageDialog(null, "Objeto nao encontrado");
		}
	}

	private static void listarRoteiros() {
		System.out.println(listaRoteiro.toString());
	}

}
