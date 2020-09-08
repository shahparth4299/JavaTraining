package com.wtw.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "patients")
public class Patients {
	long id;
	@Id
	@GeneratedValue
	@Column(name = "patient_id")
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctor_id")
	public Doctors getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctors doctor) {
		this.doctor = doctor;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nurse_id")
	public Nurses getNurse() {
		return nurse;
	}
	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";   
	
	}
	public void setNurse(Nurses nurse) {
		this.nurse = nurse;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "wardboy_id")
	public Wardboys getWardboy() {
		return wardboy;
	}
	public void setWardboy(Wardboys wardboy) {
		this.wardboy = wardboy;
	}
	String name;
	String email;
	int age;
	@JsonIgnore
	Doctors doctor;
	@JsonIgnore
	Nurses nurse;
	@JsonIgnore
	Wardboys wardboy;
}
