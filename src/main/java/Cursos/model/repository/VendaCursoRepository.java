package Cursos.model.repository;

import Cursos.model.entity.VendaCurso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaCursoRepository extends JpaRepository <VendaCurso, Integer> {
}
