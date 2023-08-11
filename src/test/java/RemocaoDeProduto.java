import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemocaoDeProduto {

    public static void main(String[] args) {
        EntityManager entityManager = Util.getEntityManager();

        entityManager.getTransaction().begin();

        Produto produto = entityManager.find(Produto.class, 3);
        entityManager.remove(produto);

        entityManager.getTransaction().commit();
        entityManager.close();
        Util.closeEntityManagerFactory();
    }
}
