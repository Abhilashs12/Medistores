package com.medistore.controller;

import com.medistore.entity.Patient;
import com.medistore.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @GetMapping
    public String listPatients(Model model) {
        model.addAttribute("patients", service.findAll());
        return "patients";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient-form";
    }

    @PostMapping
    public String savePatient(@ModelAttribute("patient") Patient patient) {
        service.save(patient);
        return "redirect:/patients";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Patient patient = service.findById(id);
        if (patient == null) {
            return "redirect:/patients";
        }
        model.addAttribute("patient", patient);
        return "patient-form";
    }

    @GetMapping("/view/{id}")
    public String viewPatient(@PathVariable Long id, Model model) {
        Patient patient = service.findById(id);
        if (patient == null) {
            return "redirect:/patients";
        }
        model.addAttribute("patient", patient);
        return "patient-view";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/patients";
    }
}
