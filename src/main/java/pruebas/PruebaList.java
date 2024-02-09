package pruebas;

import java.util.List;

import dao.SubjectDaoImpl;
import model.Subject;

public class PruebaList {

	public static void main(String[] args) {
		SubjectDaoImpl impl = new SubjectDaoImpl();
		List<Subject> list = impl.findAll();
		for(Subject item:list) {
			System.out.println("--------------------------");
			System.out.println("Id: "+item.getId());
			System.out.println("Subject: "+item.getStrSubject());
			System.out.println("Credits: "+item.getStrCredits());
		}
	}

}
