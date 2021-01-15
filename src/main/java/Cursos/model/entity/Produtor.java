package Cursos.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProdutor;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 8)
    private String conta_bancaria;

    @Column(nullable = false, length = 11)
    private String cpf;

    @OneToOne
    @JoinColumn(name = "idLogin")
    private Login id_login;
}
