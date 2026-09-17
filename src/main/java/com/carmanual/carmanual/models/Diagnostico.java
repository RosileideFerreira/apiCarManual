package com.carmanual.carmanual.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "diagnostico")
public class Diagnostico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String descricao;

    @NotBlank
    private String resultado;

    // Mantido como ID porque não há entidade Veiculo no modelo atual.
    @NotNull
    private Long idVeic;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "id_manual", unique = true)
    private Manual manual;

    public Diagnostico() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }

    public Long getIdVeic() { return idVeic; }
    public void setIdVeic(Long idVeic) { this.idVeic = idVeic; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Manual getManual() { return manual; }
    public void setManual(Manual manual) { this.manual = manual; }
}
