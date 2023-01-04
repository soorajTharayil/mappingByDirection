package byonetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	String studentName;
	
	@OneToMany
	List<FaceBook> book;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<FaceBook> getBook() {
		return book;
	}

	public void setBook(List<FaceBook> book) {
		this.book = book;
	}
	
	

}
