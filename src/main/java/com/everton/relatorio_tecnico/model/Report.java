package com.everton.relatorio_tecnico.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate dataInicioAtendimento;
    private LocalDate dataFimAtendimento;

    // Informações da revenda
    private String nomeRevenda;
    private Boolean revendaAcompanhou;
    private String nomeRepresentanteRevenda;

    // Informações do cliente/fazenda
    private String nomeCliente;
    private String nomeFazenda;
    private String cidade;
    private String uf;
    private String responsavelFazenda;
    private String emailResponsavel;
    private String telefoneContato;

    // Técnico e assistência
    private String tecnicoResponsavel;
    private String tipoAssistencia;
    private String equipamento;
    private String equipamentoOutro; // se for "outros"

    // Produtos
    @ElementCollection
    private List<String> produtos; // Ex: SmartConnect, GPS, etc.

    // Descrição e observações
    @Column(columnDefinition = "TEXT")
    private String descricaoServicos;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    // Problemas encontrados
    private Boolean encontrouProblemas;
    @Column(columnDefinition = "TEXT")
    private String descricaoProblemas;

    // Entrega técnica
    private Boolean entregaTecnica;
    private String detalhesEntregaTecnica;

    // Satisfação
    private Integer satisfacaoTecnico;
    private Integer satisfacaoEmpresa;
    private String observacoesSatisfacao;

    // Assinatura (pode ser base64 ou caminho para o arquivo)
    @Lob
    private String assinaturaCliente;

    // Mídias (imagens e vídeos) - caminhos ou base64
    @ElementCollection
    private List<String> arquivosMidia;

    @ElementCollection
    private List<String> arquivosProblemas;


}



