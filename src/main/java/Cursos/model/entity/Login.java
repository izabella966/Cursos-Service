package Cursos.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLogin;

    @Column(nullable = false, length = 100)
    @Email(message = "{campo.email.validacao}")
    private String email;

    @NotEmpty (message = "{campo.senha.obrigatorio}")
    @Column(nullable = false, length = 10)
    private String senha;
}
