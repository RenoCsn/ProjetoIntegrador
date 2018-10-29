package classes;

import java.util.List;

public interface ObjetoDAO {

	void gravar(Objeto objeto);

	void excluir(int idObjeto);

	List<Objeto> listarObjetos();

	void alterar(int idObjeto, Objeto objeto);

	Objeto consulta(int idObjeto);

}
