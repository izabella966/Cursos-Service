package Cursos.rest;

import Cursos.model.entity.Aluno;
import Cursos.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private AlunoRepository repository ;

    @Autowired
    public  AlunoController(@RequestBody AlunoRepository alunoRepository){
        this.repository = alunoRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno save(Aluno aluno){
        return repository.save(aluno);
    }

}
