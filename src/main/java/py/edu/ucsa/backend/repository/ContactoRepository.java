package py.edu.ucsa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.ucsa.backend.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long>{

}
