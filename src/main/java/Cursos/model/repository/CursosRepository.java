package Cursos.model.repository;

import Cursos.model.entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepository extends JpaRepository<Cursos, Integer> {
}
