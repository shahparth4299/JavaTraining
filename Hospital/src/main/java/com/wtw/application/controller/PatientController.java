package com.wtw.application.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wtw.application.model.Patients;
import com.wtw.application.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@GetMapping
	public ResponseEntity<List<Patients>> getAllEmployees() {
        List<Patients> list = patientService.allPatients();
        return new ResponseEntity<List<Patients>>(list, HttpStatus.OK);
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Patients> getEmployeeById(@PathVariable("id") Long id){
        Patients patient = patientService.PatientById(id);
        return new ResponseEntity<Patients>(patient, HttpStatus.OK);
    }
	
	@PostMapping
    public ResponseEntity<List<Patients>> insertPatient(Patients p){
		List<Patients> list = patientService.insertPatient(p);
        return new ResponseEntity<List<Patients>>(list, HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id){
        patientService.deletePatient(id);
        return HttpStatus.FORBIDDEN;
    }
	
}
