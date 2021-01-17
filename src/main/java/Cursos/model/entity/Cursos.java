package Cursos.model.entity;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.TreeSet;

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
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCursos;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 8)
    private String descricao;

    @Column(name= "data_cadastro")
    private LocalDate dataCadastro;

    @Column(nullable = false, length = 8)
    private Double preco;

    /*@ManyToOne
    @JoinColumn(name = "fk_produtor")
    private Produtor produtor;*/
}
