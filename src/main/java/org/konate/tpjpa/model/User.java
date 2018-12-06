package org.konate.tpjpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.konate.tpjpa.util.Civility;

@Entity @Table(name="t_user")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private String name;
	private int age;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@Enumerated(EnumType.STRING)
	private Civility civility;

	public User() {
	}
	
	public User(String name, int age, Date dateOfBirth, Civility civility) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.civility = civility;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Civility getCivility() {
		return civility;
	}

	public void setCivility(Civility civility) {
		this.civility = civility;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", civility="
				+ civility + "]";
	}

}
