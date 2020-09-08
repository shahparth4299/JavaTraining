package com.wtw.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtw.application.model.Patients;
import com.wtw.application.repository.DoctorRepository;
import com.wtw.application.repository.NurseRepository;
import com.wtw.application.repository.PatientRepository;
import com.wtw.application.repository.WardboyRepository;

@Service
public class PatientService {
	@Autowired
	PatientRepository patientRepository;
	DoctorRepository doctorRepository;
	NurseRepository nurseRepository;
	WardboyRepository wardboyRepository;
	public List<Patients> allPatients(){
		List<Patients> lst = patientRepository.findAll();
		if(lst.size() > 0)
			return lst;
		return new ArrayList<Patients>();
	}
	
	public Patients PatientById(Long id){
		return patientRepository.findById(id).get();   
    }
	
	public List<Patients> insertPatient(Patients patient) {
		patient.setDoctor(doctorRepository.findById(patient.getDoctor().getId()).get());
		patient.setNurse(nurseRepository.findById(patient.getNurse().getId()).get());
		patient.setWardboy(wardboyRepository.findById(patient.getWardboy().getId()).get());
		patientRepository.save(patient);
		return patientRepository.findAll();
	} 
	public void deletePatient(Long id){
        patientRepository.deleteById(id);
    } 
	
}
