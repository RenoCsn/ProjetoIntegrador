package classes;

import java.util.ArrayList;
import java.util.List;

public class ArquivoMotoristaDao implements MotoristaDAO {

	private List<Motorista> motoristas = new ArrayList<>();

	@Override
	public void gravar(Motorista motorista) {
		motoristas.add(motorista);
	}

	@Override
	public void excluir(int idMotorista) {
		Motorista motorista = new Motorista();
		motorista.setId_motorista(idMotorista);
		// banco.removerMotorista(motorista);
	}

	@Override
	public List<Motorista> listarMotoristas() {
		return motoristas;
	}

	@Override
	public void alterar(int idMotorista, Motorista motorista) {
		int posicao = getPosicaoMotorista(idMotorista);
		if (posicao >= 0) {
			motoristas.set(posicao, motorista);
		}
	}

	@Override
	public Motorista consulta(int idMotorista) {
		int posicao = getPosicaoMotorista(idMotorista);
		if (posicao >= 0) {
			return motoristas.get(posicao);
		}
		return null;
	}

	private int getPosicaoMotorista(int idMotorista) {

		for (int i = 0; i < motoristas.size(); i++) {
			if (motoristas.get(i).getId_motorista() == idMotorista) {
				return i;
			}
		}
		return -1;
	}
}
