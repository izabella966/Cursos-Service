package Cursos;

import Cursos.model.entity.*;
import Cursos.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;


@SpringBootApplication
public class CursosApplication {

    @Bean
    public CommandLineRunner run(@Autowired LoginRepository repositorylogin, @Autowired AlunoRepository repositoryaluno, @Autowired ProdutorRepossitory repositoryprod,
                                 @Autowired CursosRepository repositorycursos, @Autowired VendaCursoRepository repositoryvenda){
        return  args -> {
/*
            Login login;
            login = Login.builder().email("izabella@gmail.com").senha("abc123").build();
            repositorylogin.save(login);

            Login login2;
            login2 = Login.builder().email("tereza@gmail.com").senha("abc123").build();
            repositorylogin.save(login2);

            Aluno aluno2;
            aluno2 = Aluno.builder().nome("tereza").data_nascimento("23-10-2020").id_login(login2).build();
            repositoryaluno.save(aluno2);

            Aluno aluno;
            aluno = Aluno.builder().nome("joao").data_nascimento("23-10-2020").id_login(login).build();
            repositoryaluno.save(aluno);

            Produtor produtor2;
            produtor2 = Produtor.builder().nome("tereza").conta_bancaria("09373628").cpf("02903876534").id_login(login2).build();
            repositoryprod.save(produtor2);

            Produtor produtor;
            produtor = Produtor.builder().nome("joao").conta_bancaria("09373628").cpf("02903876534").id_login(login).build();
            repositoryprod.save(produtor);

            Cursos cursos;
            cursos = Cursos.builder().nome("Análise corporal").descricao("Leitura dos seus traços, o corpo explica").dataCadastro(LocalDate.now()).preco(297.00).id_Produtor(produtor).build();
            repositorycursos.save(cursos);
/*
            VendaCurso venda;
            venda = VendaCurso.builder().status(true).dataVenda(LocalDate.now()).idAluno(aluno).idCursos(cursos).build();
            repositoryvenda.save(venda);*/


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(CursosApplication.class, args);

    }
}
