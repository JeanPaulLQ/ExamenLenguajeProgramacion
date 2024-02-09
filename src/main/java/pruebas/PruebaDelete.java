package pruebas;

import dao.SubjectDaoImpl;

public class PruebaDelete {

	public static void main(String[] args) {
		SubjectDaoImpl impl = new SubjectDaoImpl();
		impl.delete(6);
		

	}

}
