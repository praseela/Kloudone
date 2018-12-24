package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posting")
public class Posting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String designation;
	@Column
	private String company;
	@Column
	private String location;
	@Column
	private int experience;
	@Column
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Posting() {
		super();
	}

	public Posting(int id, String designation, String company, String location, int experience, int salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.company = company;
		this.location = location;
		this.experience = experience;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Posting [id=" + id + ", designation=" + designation + ", company=" + company + ", location=" + location
				+ ", experience=" + experience + ", salary=" + salary + "]";
	}

}
