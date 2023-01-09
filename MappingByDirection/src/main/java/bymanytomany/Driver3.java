package bymanytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver3 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employe employe=new Employe();
		employe.setEmployeName("sooraj");
		
		Employe employe2=new Employe();
		employe2.setEmployeName("athul");
		
		Employe employe3=new Employe();
		employe3.setEmployeName("arjun");
		
		List<Employe>employes=new ArrayList<Employe>();
        employes.add(employe);
        employes.add(employe2);
        employes.add(employe3);
        
        Company company=new Company();
        company.setCompanyName("TCS");
		
        
        Company company2=new Company();
        company2.setCompanyName("MindTree");
        
        
        Company company3=new Company();
        company3.setCompanyName("ITC");
        
        List<Company>companies=new ArrayList<Company>();
        companies.add(company);
        companies.add(company2);
        companies.add(company3);
        
        employe.setCompanies(companies);
        employe2.setCompanies(companies);
        employe3.setCompanies(companies);
        
        company.setEmployes(employes);
        company2.setEmployes(employes);
        company3.setEmployes(employes);
        
        entityTransaction.begin();
        entityManager.persist(company);
        entityManager.persist(company2);
        entityManager.persist(company3);
        entityManager.persist(employe);
        entityManager.persist(employe2);
        entityManager.persist(employe3);
        entityTransaction.commit();
        
	}

}
