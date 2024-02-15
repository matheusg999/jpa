package teste.heranca;

import infra.DAO;
import modelo.heranca.Carro;
import modelo.heranca.Mustang;

public class NovoCarro {

	public static void main(String[] args) {
		
		DAO<Carro> carroDAO = new DAO<>();
		
		Carro carro = new Carro("Uno", "2007", "Fiat");
		Mustang carro2 = new Mustang("Mustang GT", "2020", "Ford", "V6");
		
		carroDAO.incluirAtomico(carro);
		carroDAO.incluirAtomico(carro2);
		
		carroDAO.fechar();
		
	}
}
