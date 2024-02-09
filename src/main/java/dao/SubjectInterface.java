package dao;

import java.util.List;
import model.Subject;

public interface SubjectInterface {
	public void create(Subject sub);
	public void update(Subject sub);
	public void delete(Integer id);
	public Subject find(Integer id);
	public List<Subject> findAll();
}
