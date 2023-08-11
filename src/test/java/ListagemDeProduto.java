import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListagemDeProduto {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("contestoque");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
    }
}
