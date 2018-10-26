package arquivo;

import classes.ArquivoMotoristaDao;
import classes.MotoristaDAO;
import main.DaoFactory;

public class ArquivoDaoFactory extends DaoFactory {

	@Override
	public MotoristaDAO getMotoristaDao() {

		MotoristaDAO motoristaDao = new ArquivoMotoristaDao();

		return motoristaDao;

	}

}
