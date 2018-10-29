package classes;

import java.util.ArrayList;
import java.util.List;

public class ArquivoObjetoDao implements ObjetoDAO {

	private List<Objeto> listaObjetos = new ArrayList<>();

	@Override
	public void gravar(Objeto objeto) {
		listaObjetos.add(objeto);
	}

	@Override
	public void excluir(int idObjeto) {
		int posicao = getPosicaoObjeto(idObjeto);
		listaObjetos.remove(posicao);
	}

	@Override
	public List<Objeto> listarObjetos() {
		return listaObjetos;
	}

	@Override
	public void alterar(int idObjeto, Objeto objeto) {
		int posicao = getPosicaoObjeto(idObjeto);
		if (posicao >= 0) {
			listaObjetos.set(posicao, objeto);
		}
	}

	@Override
	public Objeto consulta(int idObjeto) {
		int posicao = getPosicaoObjeto(idObjeto);
		if (posicao >= 0) {
			return listaObjetos.get(posicao);
		}
		return null;
	}

	private int getPosicaoObjeto(int idObjeto) {

		for (int i = 0; i < listaObjetos.size(); i++) {
			if (listaObjetos.get(i).getIdObjeto() == idObjeto) {
				return i;
			}
		}
		return -1;
	}

}
