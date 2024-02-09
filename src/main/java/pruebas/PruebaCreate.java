package pruebas;

import java.util.List;

import dao.SubjectDaoImpl;
import model.Subject;

public class PruebaCreate {

	public static void main(String[] args) {
		SubjectDaoImpl subjectDao = new SubjectDaoImpl();
		Subject sub1 = new Subject();
		sub1.setStrCredits("5");
		sub1.setStrSubject("Algoritmos");
		//subjectDao.create(sub1);
		
		/*Subject sub2 = new Subject();
		sub2.setStrCredits("5");
		sub2.setStrSubject("Desarrollo Web");
		subjectDao.create(sub2);*/
		Subject sub3 = new Subject();
		sub3.setStrSubject("Desarrollo Android");
		sub3.setStrCredits("4");
		subjectDao.create(sub3);
	}

}
