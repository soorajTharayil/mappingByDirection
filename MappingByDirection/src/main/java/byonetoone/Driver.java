package byonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setPersonName("Sooraj");
		
		
		AdharCard adharCard=new AdharCard();
		adharCard.setAdharNumber(123457634l);
		
		person.setAdharCard(adharCard);
		adharCard.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(adharCard);
		entityManager.persist(person);
		entityTransaction.commit();

	}

}
