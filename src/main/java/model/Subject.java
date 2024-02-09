package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
@NamedQuery(name = "Subject.findAll",query="SELECT s FROM Subject s")
public class Subject {
	@Id
	@Column(name="idsubject")
	private int id;
	
	@Column(name="subject")
	private String strSubject;
	
	@Column(name="credits")
	private String strCredits;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStrSubject() {
		return strSubject;
	}
	public void setStrSubject(String strSubject) {
		this.strSubject = strSubject;
	}
	public String getStrCredits() {
		return strCredits;
	}
	public void setStrCredits(String strCredits) {
		this.strCredits = strCredits;
	}
	
	
}
