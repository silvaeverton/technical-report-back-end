package com.everton.relatorio_tecnico.service.impl;

import com.everton.relatorio_tecnico.dtos.ReportDTO;
import com.everton.relatorio_tecnico.exceptions.NotFoundException;
import com.everton.relatorio_tecnico.model.Report;
import com.everton.relatorio_tecnico.repositories.ReportRepository;
import com.everton.relatorio_tecnico.service.ReportService;
import com.everton.relatorio_tecnico.service.TechService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportRepository repository;

    private final TechService service;

    private final ModelMapper mapper;

    @Override
    public Report create(ReportDTO dto) {

        Report relatorio = new Report();


        relatorio.setDataInicioAtendimento(dto.getDataInicioAtendimento());
        relatorio.setDataFimAtendimento(dto.getDataFimAtendimento());
        relatorio.setNomeRevenda(dto.getNomeRevenda());
        relatorio.setRevendaAcompanhou(dto.getRevendaAcompanhou());
        relatorio.setNomeRepresentanteRevenda(dto.getNomeRepresentanteRevenda());
        relatorio.setNomeCliente(dto.getNomeCliente());
        relatorio.setNomeFazenda(dto.getNomeFazenda());
        relatorio.setCidade(dto.getCidade());
        relatorio.setUf(dto.getUf());
        relatorio.setResponsavelFazenda(dto.getResponsavelFazenda());
        relatorio.setEmailResponsavel(dto.getEmailResponsavel());
        relatorio.setTelefoneContato(dto.getTelefoneContato());
        relatorio.setTecnicoResponsavel(dto.getTecnicoResponsavel());
        relatorio.setTipoAssistencia(dto.getTipoAssistencia());
        relatorio.setEquipamento(dto.getEquipamento());
        relatorio.setEquipamentoOutro(dto.getEquipamentoOutro());
        relatorio.setProdutos(dto.getProdutos());
        relatorio.setDescricaoServicos(dto.getDescricaoServicos());
        relatorio.setEncontrouProblemas(dto.getEncontrouProblemas());
        relatorio.setDescricaoProblemas(dto.getDescricaoProblemas());
        relatorio.setObservacoes(dto.getObservacoes());
        relatorio.setEntregaTecnica(dto.getEntregaTecnica());
        relatorio.setDetalhesEntregaTecnica(dto.getDetalhesEntregaTecnica());
        relatorio.setSatisfacaoTecnico(dto.getSatisfacaoTecnico());
        relatorio.setSatisfacaoEmpresa(dto.getSatisfacaoEmpresa());
        relatorio.setObservacoesSatisfacao(dto.getObservacoesSatisfacao());
        relatorio.setAssinaturaCliente(dto.getAssinaturaCliente());
        relatorio.setArquivosMidia(dto.getArquivosMidia());
        relatorio.setArquivosProblemas(dto.getArquivosProblemas());

        return repository.save(relatorio);
    }

    @Override
        public List<Report> findAll() {
            return repository.findAll();
    }

    @Override
    public List<Report> findByTech(Long techId) {
        service.findById(techId);
        return repository.findByTech_Id(techId);

    }

    @Override
    public Report findById(Long idReport) {

        return repository.findById(idReport).orElseThrow(()->
                new NotFoundException("Report not found",404));

    }
}
