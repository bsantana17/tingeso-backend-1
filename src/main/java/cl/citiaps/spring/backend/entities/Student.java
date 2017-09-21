package cl.citiaps.spring.backend.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idstudent", unique=true, nullable=false)
	private int studentId;

	@Column(name="name", nullable=false, length=45)
	private String name;

	@Column(name="rut", nullable=false, unique=true)
	private int rut;

	@Column(name="email", nullable=false, length=100, unique=true)
	private String email;

	@Column(name="career", nullable=false, length=100)
	private String career;

	@Column(name="year_income", nullable=false)
	private int yearIncome;

	public Student() {
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCareer() {
		return this.career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	public int getYearIncome() {
		return this.yearIncome;
	}

	public void setYearIncome(int yearIncome) {
		this.yearIncome = yearIncome;
	}

}