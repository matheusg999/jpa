package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("Neymar Jr Alterado");
		

		//em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
		
		
		/* neste caso mesmo com o 'em.merge' comentado o nome ainda vai ser alterado, pois o objeto 'Usuario' esta sendo gerenciado, 
		 * ou seja, ele acabou entrando num contexto transacional e atualizando o banco de dados.
		 */

	}
}
