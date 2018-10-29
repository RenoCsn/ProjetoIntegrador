package main;

import java.util.ArrayList;
import java.util.List;

import classes.Motorista;
import classes.MotoristaDAO;
import classes.Objeto;
import classes.ObjetoDAO;
import classes.Roteiro;
import classes.RoteiroDAO;
import classes.Veiculo;
import classes.VeiculoDAO;

public class MainDaoTest {

	public static void main(String[] args) {

		System.out.println("Inicio dos testes do daoFactory em arquivo\n");

		DaoFactory arquivoDaoFactory = DaoFactory.getDaoFactory(0);

		MotoristaDAO motoristaDao = arquivoDaoFactory.getMotoristaDao();
		VeiculoDAO veiculoDao = arquivoDaoFactory.getVeiculoDao();
		ObjetoDAO objetoDao = arquivoDaoFactory.getObjetoDao();
		RoteiroDAO roteiroDao = arquivoDaoFactory.getRoteiroDao();

		Motorista motorista = new Motorista(0, "a", "05021993", "batata", (short) 1, "0123456");
		motoristaDao.gravar(motorista);
		Motorista motorista2 = new Motorista(2, "b", "04021985", "teste", (short) 2, "7891234");
		motoristaDao.gravar(motorista2);
		Motorista motorista3 = new Motorista(10, "c", "05201578", "cafe", (short) 3, "569877");
		motoristaDao.gravar(motorista3);
		Motorista motorista4 = new Motorista(1, "d", "8954854", "quero", (short) 1, "8972642");
		motoristaDao.gravar(motorista4);
		System.out.println(motoristaDao.consulta(1));
		System.out.println(motoristaDao.consulta(2));
		System.out.println(motoristaDao.consulta(10));
		System.out.println(motoristaDao.consulta(0));

		Veiculo veiculo = new Veiculo(0, (short) 1, "fiat", "a", 1990, "abc");
		veiculoDao.gravar(veiculo);
		Veiculo veiculo2 = new Veiculo(2, (short) 3, "ford", "b", 1987, "cba");
		veiculoDao.gravar(veiculo2);
		Veiculo veiculo3 = new Veiculo(5, (short) 2, "fiat", "c", 1990, "asdfsd");
		veiculoDao.gravar(veiculo3);
		Veiculo veiculo4 = new Veiculo(11, (short) 3, "ford", "d", 1987, "drwerwe");
		veiculoDao.gravar(veiculo4);
		System.out.println(veiculoDao.consulta(11));
		System.out.println(veiculoDao.consulta(0));
		System.out.println(veiculoDao.consulta(5));
		System.out.println(veiculoDao.consulta(2));

		Objeto objeto = new Objeto(0, "aaaaaa", "batata", "yyyyyy", "cafe", "aaabbb", 1.0);
		objetoDao.gravar(objeto);
		Objeto objeto2 = new Objeto(10, "cccccc", "resdfs", "tttttttt", "aaaa", "aaabbb", 1.0);
		objetoDao.gravar(objeto2);
		Objeto objeto3 = new Objeto(20, "dddddd", "fewrwdfs", "ggggggg", "bbbbbb", "aaabbb", 1.0);
		objetoDao.gravar(objeto3);
		Objeto objeto4 = new Objeto(30, "fffff", "wer4ewrw", "hhhh", "4444", "aaabbb", 1.0);
		objetoDao.gravar(objeto4);
		System.out.println(objetoDao.consulta(30));
		System.out.println(objetoDao.consulta(20));
		System.out.println(objetoDao.consulta(10));
		System.out.println(objetoDao.consulta(0));
		
		List<Integer> listaIdObjetos = new ArrayList<>();
		listaIdObjetos.add(0);
		listaIdObjetos.add(10);
		listaIdObjetos.add(20);
		listaIdObjetos.add(30);
		Roteiro roteiro = new Roteiro("84564", 0, 10, 2, listaIdObjetos);
		roteiroDao.gravar(roteiro);

		System.out.println("\n------------------");


		System.out.println(motoristaDao.listarMotoristas());
		System.out.println(veiculoDao.listarVeiculos());
		System.out.println(objetoDao.listarObjetos());
		System.out.println(roteiroDao.listarRoteiros());

		System.out.println("Fim dos testes do daoFactory em arquivo");

	}

}
