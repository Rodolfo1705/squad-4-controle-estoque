import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InclusaoDeProduto {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("squad-4-controle-estoque");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Produto produto1 = new Produto("Panela", "Panela de pressão 10 litros", 56.80 );
        Produto produto2 = new Produto("Cama", "Cama de casal big", 450.68);
        Produto produto3 = new Produto("Caixa Som", "Caixa de Som JBL", 160.0);

        //Quando JPA faz uma operação que não é apenas leitura do BD, é necessário criar uma transação
        entityManager.getTransaction().begin();
        entityManager.persist(produto1); //Pega o objeto e salva no banco de dados
        entityManager.persist(produto2);
        entityManager.persist(produto3);
        entityManager.getTransaction().commit(); //Confirma as alterações feitas
    }
}
