package br.com.estudos.demo.repository;

import br.com.estudos.demo.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, UUID> {
}
