package tp2.hopital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp2.hopital.entities.*;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}

