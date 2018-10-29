package classes;

import java.util.ArrayList;
import java.util.List;

public class ArquivoMotoristaDao implements MotoristaDAO {

	private List<Motorista> listaMotoristas = new ArrayList<>();

	@Override
	public void gravar(Motorista motorista) {
		listaMotoristas.add(motorista);
	}

	@Override
	public void excluir(int idMotorista) {
		int posicao = getPosicaoMotorista(idMotorista);
		listaMotoristas.remove(posicao);
		// banco.removerMotorista(motorista);
	}

	@Override
	public List<Motorista> listarMotoristas() {
		return listaMotoristas;
	}

	@Override
	public void alterar(int idMotorista, Motorista motorista) {
		int posicao = getPosicaoMotorista(idMotorista);
		if (posicao >= 0) {
			listaMotoristas.set(posicao, motorista);
		}
	}

	@Override
	public Motorista consulta(int idMotorista) {
		int posicao = getPosicaoMotorista(idMotorista);
		if (posicao >= 0) {
			return listaMotoristas.get(posicao);
		}
		return null;
	}

	private int getPosicaoMotorista(int idMotorista) {

		for (int i = 0; i < listaMotoristas.size(); i++) {
			if (listaMotoristas.get(i).getIdMotorista() == idMotorista) {
				return i;
			}
		}
		return -1;
	}
}
