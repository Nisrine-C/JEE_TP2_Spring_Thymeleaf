package tp2.hopital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tp2.hopital.repository.PatientRepository;
import tp2.hopital.entities.Patient;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patient patient = new Patient();
		patient.setId(null);
		patient.setNom("Mohammed");
		patient.setDateNaissance(new Date());
		patient.setMalade(false);
		patient.setScore(23);

		Patient patient2 = new Patient(null,"Amina",new Date(),false,41);

		patientRepository.save(patient);
		patientRepository.save(patient2);

	}
}
