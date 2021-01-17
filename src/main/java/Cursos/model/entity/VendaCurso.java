package Cursos.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class VendaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;

    @Column(nullable = false)
    private boolean status;

    @Column(name= "data_venda", updatable = false)
    private LocalDate dataVenda;
/*
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "id_cursos")
    private Cursos idCursos;

    /*@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "id_alunos")
    private Cursos idAluno;*/

}
