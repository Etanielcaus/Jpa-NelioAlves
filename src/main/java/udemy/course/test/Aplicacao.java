package udemy.course.test;


import udemy.course.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(null, "João", "joao@email.com");
        Pessoa pessoa2 = new Pessoa(null, "Pedro", "Pedro@email.com");
        Pessoa pessoa3 = new Pessoa(null, "Carlos", "Carlos@email.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(pessoa);
        entityManager.persist(pessoa2);
        entityManager.persist(pessoa3);
        entityManager.getTransaction().commit();

        System.out.println("Succes");


        System.out.println(pessoa);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}
