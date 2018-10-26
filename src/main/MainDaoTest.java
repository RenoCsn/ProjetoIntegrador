package main;

import classes.Motorista;
import classes.MotoristaDAO;

public class MainDaoTest {

	public static void main(String[] args) {

		System.out.println("hello world");

		// get shape factory
		DaoFactory arquivoDaoFactory = DaoFactory.getDaoFactory(0);

		// get an object of Shape Circle
		MotoristaDAO motoristaDao = arquivoDaoFactory.getMotoristaDao();

		Motorista motorista = new Motorista(0, "a", "nascimento", "endereco", (short) 1, "numero_cnh");
		motoristaDao.gravar(motorista);
		Motorista motorista2 = new Motorista(2, "b", "Nascimento", "endereco", (short) 2, "numero_cnh");
		motoristaDao.gravar(motorista2);
		// call draw method of Shape Circle
		System.out.println(motoristaDao.consulta(0));

	}

}
