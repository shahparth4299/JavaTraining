package com.wtw.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wtw.application.model.Doctors;

public interface DoctorRepository extends JpaRepository<Doctors, Long> {

}
