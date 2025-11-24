package com.medistore.service;

import com.medistore.entity.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();

    Patient findById(Long id);

    Patient save(Patient patient);

    void deleteById(Long id);
}
