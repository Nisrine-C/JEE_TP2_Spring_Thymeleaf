package tp2.hopital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp2.hopital.entities.*;

public interface PatientRepository extends JpaRepository<Patient,Long>{

}

