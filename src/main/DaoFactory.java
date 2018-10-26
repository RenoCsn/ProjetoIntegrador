package main;

import arquivo.ArquivoDaoFactory;
import classes.MotoristaDAO;

public abstract class DaoFactory {

	public static DaoFactory getDaoFactory(int opcao) {

		if (opcao == 0) {
			ArquivoDaoFactory arquivoDaoFactory = new ArquivoDaoFactory();
			return arquivoDaoFactory;
		} else if (opcao == 1) {
			ArquivoDaoFactory criaBanco = new ArquivoDaoFactory();
			return criaBanco;
		} else {

			return null;
		}

	}

	public abstract MotoristaDAO getMotoristaDao();

}
