package tp2.hopital.web;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tp2.hopital.entities.Patient;
import tp2.hopital.repository.PatientRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Patient> patientList = patientRepository.findAll();
        model.addAttribute("listPatients",patientList);
        return "patients";
    }



}
