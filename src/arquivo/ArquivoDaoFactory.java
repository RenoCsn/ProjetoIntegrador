package arquivo;

import classes.ArquivoMotoristaDao;
import classes.ArquivoObjetoDao;
import classes.ArquivoRoteiroDao;
import classes.ArquivoVeiculoDao;
import classes.MotoristaDAO;
import classes.ObjetoDAO;
import classes.RoteiroDAO;
import classes.VeiculoDAO;
import main.DaoFactory;

public class ArquivoDaoFactory extends DaoFactory {

	@Override
	public MotoristaDAO getMotoristaDao() {

		MotoristaDAO motoristaDao = new ArquivoMotoristaDao();

		return motoristaDao;
	}

	@Override
	public VeiculoDAO getVeiculoDao() {

		VeiculoDAO veiculoDao = new ArquivoVeiculoDao();
		return veiculoDao;
	}

	@Override
	public RoteiroDAO getRoteiroDao() {

		RoteiroDAO roteiroDao = new ArquivoRoteiroDao();
		return roteiroDao;
	}

	@Override
	public ObjetoDAO getObjetoDao() {

		ObjetoDAO objetoDao = new ArquivoObjetoDao();
		return objetoDao;
	}

}
