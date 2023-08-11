import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteracaoDeProduto {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("contestoque");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Produto produto = entityManager.find(Produto.class, 2);
        if (produto != null) {
            double novoPreco = 345.00;
            produto.setPreco(novoPreco);
        } else {
            System.out.println("Produto não encontrado.");
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
