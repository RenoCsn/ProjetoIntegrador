package classes;

import java.util.List;

public interface RoteiroDAO {

	void gravar(Roteiro roteiro);

	void excluir(int idRoteiro);

	List<Roteiro> listarRoteiros();

	void alterar(int idRoteiro, Roteiro roteiro);

	Roteiro consulta(int idRoteiro);

}
