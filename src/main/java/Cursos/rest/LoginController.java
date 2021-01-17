package Cursos.rest;

import Cursos.model.entity.Login;
import Cursos.model.repository.LoginRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private LoginRepository repository;

    public LoginController(LoginRepository loginrepository){
        this.repository = loginrepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Login save(@RequestBody @Valid Login login){
        return repository.save(login);
    }

    @GetMapping("{idLogin}")
    public Login find(@PathVariable Integer idLogin){
        return repository
                .findById(idLogin)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Login não encontrado"));
    }

    @DeleteMapping("{idLogin}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer idLogin){
        repository
                .findById(idLogin)
                .map(login -> {
                    repository.delete(login);
                    return Void.TYPE;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Login não encontrado"));

    }

    @PutMapping("{idLogin}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer idLogin, @RequestBody @Valid Login loginatualizado){
        repository
                .findById(idLogin)
                .map(login -> {
                    loginatualizado.setIdLogin(login.getIdLogin());
                    return repository.save(loginatualizado);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Login não encontrado"));

    }

}
