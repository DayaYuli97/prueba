package Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Persona;


public interface PersonaRepositrio extends JpaRepository<Persona, Long>{
	

}
