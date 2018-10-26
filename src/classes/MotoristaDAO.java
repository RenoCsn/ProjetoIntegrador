package classes;

import java.util.List;

public interface MotoristaDAO {

	void gravar(Motorista motorista);

	void excluir(int idMotorista);

	List<Motorista> listarMotoristas();

	void alterar(int idMotorista, Motorista motorista);

	Motorista consulta(int idMotorista);

}
