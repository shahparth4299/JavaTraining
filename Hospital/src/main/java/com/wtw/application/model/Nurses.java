package com.wtw.application.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "nurses")
public class Nurses {
	long id;
	String name;
	String email;
	int age;
	@Id
	@Column(name = "nurse_id")
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@OneToMany
	@JoinColumn(name = "nurse_id")
	@Cascade(value = org.hibernate.annotations.CascadeType.ALL)
	public Set<Patients> getPatients() {
		return patients;
	}
	@Override
	public String toString() {
		return "Nurses [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", salary=" + salary
				+ ", patients=" + patients + "]";
	}
	public void setPatients(Set<Patients> patients) {
		this.patients = patients;
	}
	int salary;
	Set<Patients> patients;

}
