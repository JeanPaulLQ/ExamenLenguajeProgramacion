package pruebas;

import dao.SubjectDaoImpl;
import model.Subject;

public class PruebaUpdate {

	public static void main(String[] args) {
		SubjectDaoImpl impl = new SubjectDaoImpl();
		Subject sub = impl.find(5);
		sub.setStrSubject("Hacking Etico");
		
		impl.update(sub);
	}

}
