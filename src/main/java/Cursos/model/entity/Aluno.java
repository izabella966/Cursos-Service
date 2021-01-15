package Cursos.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAluno;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 10)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String data_nascimento;

    @OneToOne
    @JoinColumn(name = "idLogin")
    private Login id_login;



}
