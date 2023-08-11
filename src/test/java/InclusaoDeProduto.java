import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InclusaoDeProduto {
    public static void main(String[] args){
        EntityManager entityManager = Util.getEntityManager();

        Produto produto1 = new Produto("Panela", "Panela de pressão 10 litros", 56.80 );
        Produto produto2 = new Produto("Cama", "Cama de casal big", 450.68);
        Produto produto3 = new Produto("Caixa Som", "Caixa de Som JBL", 160.0);

        entityManager.getTransaction().begin();

        entityManager.merge(produto1);
        entityManager.merge(produto2);
        entityManager.merge(produto3);

        entityManager.getTransaction().commit();
        entityManager.close();
        Util.closeEntityManagerFactory();
    }
}
