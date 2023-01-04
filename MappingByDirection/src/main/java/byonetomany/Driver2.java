package byonetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver2 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setStudentName("Sooraj");
		
		FaceBook book=new FaceBook();
		book.setAccountName("007sooraj");
		
		
		FaceBook book2=new FaceBook();
		book2.setAccountName("sooraj114");
		
		
		FaceBook book3=new FaceBook();
		book3.setAccountName("sooraj007");
		
		
		List<FaceBook> books=new ArrayList<FaceBook>();
		books.add(book);
		books.add(book2);
		books.add(book3);
		
		student.setBook(books);
		book.setStudent(student);
		book2.setStudent(student);
		book3.setStudent(student);
		
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(book);
		entityManager.persist(book2);
		entityManager.persist(book3);
		entityTransaction.commit();

	}

}
