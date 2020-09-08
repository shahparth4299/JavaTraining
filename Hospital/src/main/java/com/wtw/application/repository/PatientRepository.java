package com.wtw.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtw.application.model.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long>{

}
