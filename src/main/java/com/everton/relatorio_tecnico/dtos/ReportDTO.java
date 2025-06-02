package com.everton.relatorio_tecnico.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class ReportDTO {

    private LocalDate dataInicioAtendimento;
    private LocalDate dataFimAtendimento;
    private String nomeRevenda;
    private Boolean revendaAcompanhou;
    private String nomeRepresentanteRevenda;
    private String nomeCliente;
    private String nomeFazenda;
    private String cidade;
    private String uf;
    private String responsavelFazenda;
    private String emailResponsavel;
    private String telefoneContato;
    private String tecnicoResponsavel;
    private String tipoAssistencia;
    private String equipamento;
    private String equipamentoOutro;
    private List<String> produtos;
    private String descricaoServicos;
    private Boolean encontrouProblemas;
    private String descricaoProblemas;
    private String observacoes;
    private Boolean entregaTecnica;
    private String detalhesEntregaTecnica;
    private Integer satisfacaoTecnico;
    private Integer satisfacaoEmpresa;
    private String observacoesSatisfacao;
    private String assinaturaCliente;
    private List<String> arquivosMidia;
    private List<String> arquivosProblemas;
}
