package br.com.fiap.brinquedos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brinquedo")
    @SequenceGenerator(name = "brinquedo", sequenceName = "TDS_SQ_BRINQUEDO", allocationSize = 1)
    private Long id;

    private String nome;
    private String tipo;
    private String classificacao;
    private String tamanho;
    private BigDecimal preco;

    // Getters e Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getClassificacao() { return classificacao; }
    public void setClassificacao(String classificacao) { this.classificacao = classificacao; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }
}
