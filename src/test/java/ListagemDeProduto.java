import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListagemDeProduto {
    public static void main(String[] args) {
        EntityManager entityManager = Util.getEntityManager();

        entityManager.getTransaction().begin();
        for (int i = 0; i <= 3; i++) {
            Produto produto = entityManager.find(Produto.class, i);
            if (produto != null) {
                System.out.println("Cod: " + produto.getCod() + "\nNome " + produto.getNome() + "\nDescrição: " + produto.getDescricao() + "\nPreço: " + produto.getPreco() + "\n");
            }
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        Util.closeEntityManagerFactory();
    }
}
