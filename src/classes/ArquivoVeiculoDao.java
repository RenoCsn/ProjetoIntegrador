package classes;

import java.util.ArrayList;
import java.util.List;

public class ArquivoVeiculoDao implements VeiculoDAO {

	private List<Veiculo> listaVeiculos = new ArrayList<>();

	@Override
	public void gravar(Veiculo veiculo) {
		listaVeiculos.add(veiculo);
	}

	@Override
	public void excluir(int idVeiculo) {
		int posicao = getPosicaoVeiculo(idVeiculo);
		listaVeiculos.remove(posicao);
	}

	@Override
	public List<Veiculo> listarVeiculos() {
		return listaVeiculos;
	}

	@Override
	public void alterar(int idVeiculo, Veiculo veiculo) {
		int posicao = getPosicaoVeiculo(idVeiculo);
		if (posicao >= 0) {
			listaVeiculos.set(posicao, veiculo);
		}
	}

	@Override
	public Veiculo consulta(int idVeiculo) {
		int posicao = getPosicaoVeiculo(idVeiculo);
		if (posicao >= 0) {
			return listaVeiculos.get(posicao);
		}
		return null;
	}

	private int getPosicaoVeiculo(int idVeiculo) {

		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getIdVeiculo() == idVeiculo) {
				return i;
			}
		}
		return -1;
	}

}
