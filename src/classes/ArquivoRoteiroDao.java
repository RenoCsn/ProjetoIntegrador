package classes;

import java.util.ArrayList;
import java.util.List;

public class ArquivoRoteiroDao implements RoteiroDAO {

	private List<Roteiro> listaRoteiros = new ArrayList<>();

	@Override
	public void gravar(Roteiro roteiro) {
		listaRoteiros.add(roteiro);
	}

	@Override
	public void excluir(int idRoteiro) {
		int posicao = getPosicaoRoteiro(idRoteiro);
		listaRoteiros.remove(posicao);
	}

	@Override
	public List<Roteiro> listarRoteiros() {
		return listaRoteiros;
	}

	@Override
	public void alterar(int idRoteiro, Roteiro roteiro) {
		int posicao = getPosicaoRoteiro(idRoteiro);
		if (posicao >= 0) {
			listaRoteiros.set(posicao, roteiro);
		}
	}

	@Override
	public Roteiro consulta(int idRoteiro) {
		int posicao = getPosicaoRoteiro(idRoteiro);
		if (posicao >= 0) {
			return listaRoteiros.get(posicao);
		}
		return null;
	}

	private int getPosicaoRoteiro(int idRoteiro) {

		for (int i = 0; i < listaRoteiros.size(); i++) {
			if (listaRoteiros.get(i).getIdRoteiro() == idRoteiro) {
				return i;
			}
		}
		return -1;
	}

}
