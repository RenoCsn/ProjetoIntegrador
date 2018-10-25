package classes;

import java.util.ArrayList;
import java.util.List;

public class MotoristaDaoImpl implements MotoristaDAO {

	private List<Motorista> motoristas = new ArrayList<>();

	@Override
	public void gravar(Motorista motorista) {
		banco.inserirMotorista(motorista);
	}

	@Override
	public void excluir(int idMotorista) {
		Motorista motorista = new Motorista();
		motorista.setId_motorista(idMotorista);
		banco.removerMotorista(motorista);
	}

	@Override
	public List<Motorista> listarMotoristas() {
		return banco.listarMotorista();
	}

	@Override
	public Motorista consulta(int idMotorista) {
		banco.listarMotorista();
		for (Motorista motorista : motoristas) {
			if (motorista.getId_motorista() == idMotorista) {
				return motorista;
			}
		}
		return null;
	}

}
