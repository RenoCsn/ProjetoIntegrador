package classes;

import java.util.List;

public interface VeiculoDAO {

	void gravar(Veiculo veiculo);

	void excluir(int idVeiculo);

	List<Veiculo> listarVeiculos();

	void alterar(int idVeiculo, Veiculo veiculo);

	Veiculo consulta(int idVeiculo);

}
