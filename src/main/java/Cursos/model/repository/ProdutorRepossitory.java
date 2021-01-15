package Cursos.model.repository;

import Cursos.model.entity.Produtor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutorRepossitory extends JpaRepository <Produtor, Integer> {
}
