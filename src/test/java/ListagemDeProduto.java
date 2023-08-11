import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListagemDeProduto {
    public static void main(String[] args) {
        EntityManager entityManager = Util.getEntityManager();

        entityManager.getTransaction().begin();
        System.out.println("Produtos: ");
        entityManager.createQuery("SELECT p FROM Produto p", Produto.class)
                .getResultList()
                .forEach(produto -> System.out.println("Cod: " + produto.getCod() + "\nNome " + produto.getNome() + "\nDescrição: " + produto.getDescricao() + "\nPreço: " + produto.getPreco() + "\n"));
        entityManager.close();
        Util.closeEntityManagerFactory();
    }
}
