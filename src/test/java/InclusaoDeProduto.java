import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;

public class InclusaoDeProduto {
    public static void main(String[] args){
        EntityManager entityManager = Util.getEntityManager();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.setNome("Panela");
        produto1.setDescricao("Panela de pressão 10 litros");
        produto1.setPreco(56.8);

        produto2.setNome("Cama");
        produto2.setDescricao("Cama de casal big");
        produto2.setPreco(450.68);

        produto3.setNome("Caixa Som");
        produto3.setDescricao("Caixa de Som JBL");
        produto3.setPreco(160.0);

        entityManager.getTransaction().begin();

        entityManager.merge(produto1);
        entityManager.merge(produto2);
        entityManager.merge(produto3);

        entityManager.getTransaction().commit();
        entityManager.close();
        Util.closeEntityManagerFactory();
    }
}
