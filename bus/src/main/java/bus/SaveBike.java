package bus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBike {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bike b = new Bike();
		b.setName("JERRY");
		b.setPh(8908087934l);
		
		entityTransaction.begin();
		entityManager.persist(b);
		entityTransaction.commit();
		
	}
}
