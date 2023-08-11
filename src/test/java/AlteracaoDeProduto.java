import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteracaoDeProduto {
    public static void main(String[] args) {
        EntityManager entityManager = Util.getEntityManager();

        entityManager.getTransaction().begin();
        Produto produto = entityManager.find(Produto.class, 2);
        if (produto != null) {
            produto.setPreco(345.00);
        } else {
            System.out.println("Produto não encontrado.");
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        Util.closeEntityManagerFactory();
    }
}
