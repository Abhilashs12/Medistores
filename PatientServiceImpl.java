package com.medistore.service.impl;

import com.medistore.entity.Patient;
import com.medistore.repository.PatientRepository;
import com.medistore.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;

    public PatientServiceImpl(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Patient> findAll() {
        return repository.findAll();
    }

    @Override
    public Patient findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Patient save(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
