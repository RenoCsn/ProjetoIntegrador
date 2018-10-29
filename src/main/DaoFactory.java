package main;

import arquivo.ArquivoDaoFactory;
import classes.MotoristaDAO;
import classes.ObjetoDAO;
import classes.RoteiroDAO;
import classes.VeiculoDAO;

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

	public abstract VeiculoDAO getVeiculoDao();

	public abstract RoteiroDAO getRoteiroDao();

	public abstract ObjetoDAO getObjetoDao();

}
